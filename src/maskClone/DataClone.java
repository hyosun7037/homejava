package maskClone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

public class DataClone {

	private Module2 drugStore;
	
	public Module2 getInfo() {
		
		try {
			//1번 주소 객체 만들기
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1"); //json 링크 주소 입력
			
			//2번 스트림 연결
			HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
			
			//3번 버퍼 연결(문자열)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			
			//4.문자더하기
			StringBuilder sb = new StringBuilder();
			
			//스트림빌더에 버퍼에서 받은 문자열을 한줄씩 추가하기
			String input = "";
			while((input=br.readLine())!=null) {
				sb.append(input);
			}
			
			//입력이 잘 되었는지 테스트
			System.out.println(sb.toString());
			System.out.println();
			
			br.close(); //버퍼 닫기
			con.disconnect(); //스트림 닫기
			
			//5.자바 오브젝트로 변환
			Gson gson = new Gson();
			Module2 drugStore = gson.fromJson(sb.toString(), Module2.class);
			//info = drugStore.getStoreInfos().get(0).getName(); //약국이름
			return drugStore;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//인터넷에서 정보를 받아오기
	//받은 정보를 String에 저장
	//저장된 String을 return
	
	public static void main(String[] args) {
		System.out.println(new DataClone().getInfo());
	}

}
