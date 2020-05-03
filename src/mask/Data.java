package mask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class Data {
	private Module1 drugStore;
	
	public Module1 getInfo() {
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			StringBuilder sb = new StringBuilder();
			String input ="";
			while((input=br.readLine())!= null) {
				sb.append(input);
			}
			System.out.println(sb.toString());
			System.out.println();
			
			br.close();
			con.disconnect();
			
			Gson gson = new Gson();
			Module1 drugStore = gson.fromJson(sb.toString(), Module1.class);
			
			return drugStore;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
