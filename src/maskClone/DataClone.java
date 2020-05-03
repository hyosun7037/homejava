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
			//1�� �ּ� ��ü �����
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1"); //json ��ũ �ּ� �Է�
			
			//2�� ��Ʈ�� ����
			HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
			
			//3�� ���� ����(���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			
			//4.���ڴ��ϱ�
			StringBuilder sb = new StringBuilder();
			
			//��Ʈ�������� ���ۿ��� ���� ���ڿ��� ���پ� �߰��ϱ�
			String input = "";
			while((input=br.readLine())!=null) {
				sb.append(input);
			}
			
			//�Է��� �� �Ǿ����� �׽�Ʈ
			System.out.println(sb.toString());
			System.out.println();
			
			br.close(); //���� �ݱ�
			con.disconnect(); //��Ʈ�� �ݱ�
			
			//5.�ڹ� ������Ʈ�� ��ȯ
			Gson gson = new Gson();
			Module2 drugStore = gson.fromJson(sb.toString(), Module2.class);
			//info = drugStore.getStoreInfos().get(0).getName(); //�౹�̸�
			return drugStore;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//���ͳݿ��� ������ �޾ƿ���
	//���� ������ String�� ����
	//����� String�� return
	
	public static void main(String[] args) {
		System.out.println(new DataClone().getInfo());
	}

}
