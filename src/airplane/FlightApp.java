package airplane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class FlightApp {
	
	public static int getTotalCount(String depAirportId, String arrAirportId, long depPlandTime) {
		try {
			// 1. 주소 객체 만들기
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=HmOxDOdMlaH7QT6aXxwjlMhM3RXfK6QwvIR9CvlZuNfvJw0H4Hf99cvIa8XSI60F5LbkmnWUqFB4cxt%2BbL0uow%3D%3D&numOfRows=10&"
					+ "pageNo=1"
					+ "&depAirportId="
					+ FlightInfoService.airPortId.get(depAirportId)
					+ "&arrAirportId="
					+ FlightInfoService.airPortId.get(arrAirportId)
					+ "&depPlandTime="
					+ depPlandTime);
			// 2. 스트림 연결 
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			// 3. 버퍼 연결 
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream(),"UTF-8"));
			
			// 4. 문자 더하기
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}
			
			System.out.println(sb.toString());
			
			br.close(); //버퍼 닫기
			con.disconnect(); //스트림 닫기
			
			Gson gson = new Gson();
			FlightInfo flightInfo = gson.fromJson(sb.toString(),FlightInfo.class);
			
			return flightInfo.getResponse().getBody().getTotalCount();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static FlightInfo getFlightInfo(String depAirportId, String arrAirportId, long depPlandTime, int page) {
		try {
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=HmOxDOdMlaH7QT6aXxwjlMhM3RXfK6QwvIR9CvlZuNfvJw0H4Hf99cvIa8XSI60F5LbkmnWUqFB4cxt%2BbL0uow%3D%3D&numOfRows=10&"
					+ page
					+ "&depAirportId="
					+ FlightInfoService.airPortId.get(depAirportId)
					+ "&arrAirportId="
					+ FlightInfoService.airPortId.get(arrAirportId)
					+ "&depPlandTime="
					+ depPlandTime);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			
			br.close();
			con.disconnect();
			
			Gson gson = new Gson();
			FlightInfo flightInfo = gson.fromJson(sb.toString(),FlightInfo.class);
			
			return flightInfo;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		FlightInfoService.setAirLineId();
		FlightInfoService.setAirPortId();
//		System.out.println(FlightInfoService.airPortId.keySet());
		
		for(String key : FlightInfoService.airPortId.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		System.out.println("출발지를 입력하세요"); //출발지 입력
		Scanner sc = new Scanner(System.in);
		String depAirportId = sc.next();
		
		System.out.println("도착지를 입력하세요"); //도착지 입력
		String arrAirportId = sc.next();
		
		System.out.println("출발일자를 입력하세요"); //출발일자 입력
		String depPlandTimeTemp = sc.next();
		
		long depPlandTime = Long.parseLong(depPlandTimeTemp); //String -> long
		Integer depPlandTimeTempInteger = Integer.parseInt(depPlandTimeTemp);
		
		int page = 1;
		
		int totalCount = getTotalCount(depAirportId,arrAirportId,depPlandTime);
		
		int count = 0;
		if(totalCount % 50 == 0) {
			count = totalCount / 50;
		}else {
			count = totalCount / 50 + 1;
		}
		
		ArrayList<FlightInfo> flightInfos = new ArrayList<>();
		
		for(int i = 0; i<count; i++) {
			FlightInfo flightInfo = getFlightInfo(depAirportId, arrAirportId, depPlandTime, page);
			page++;
			flightInfos.add(flightInfo);
		}
		
		for(FlightInfo flightInfo : flightInfos) {
			List<Item> flightItems = flightInfo.getResponse().getBody().getItems().getItem();
			
			for(Item item : flightItems) {
				System.out.println("항공사 : " + item.getAirlineNm());
				System.out.println("출발지 : " + item.getDepAirportNm());
				System.out.println("도착지 : " + item.getArrAirportNm());
				System.out.println("출발시간 : " + item.getDepPlandTime());
				System.out.println("도착시간 : " + item.getArrPlandTime());
				System.out.println("요금 : " + item.getEconomyCharge());
				System.out.println();
			}
		}
		
		
		
		
	}

}
