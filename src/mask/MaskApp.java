package mask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MaskApp {

	public MaskApp drugStore;
	
	public static MaskApp getMaskPage() {

		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			StringBuilder sb = new StringBuilder();
			String input ="";
			while((input = br.readLine())!= null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			br.close();
			con.disconnect();
			
			Gson gson = new Gson();
			MaskApp drugStore = gson.fromJson(sb.toString(), MaskApp.class);
			
			return drugStore;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Module1 maskInfo(int page) {
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=" + page);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input); 
			}
//			System.out.println(sb.toString());
			br.close();
			con.disconnect();

			Gson gson = new Gson();
			Module1 maskInfo = gson.fromJson(sb.toString(), Module1.class);

			return maskInfo;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		}

	}

	



