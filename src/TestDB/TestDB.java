package TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//�౹ ���� ������ ��ü
class Info{
	String name;
	String loc;
	
	public Info(String name, String loc) {
		this.name = name;
		this.loc = loc;
	}
	
}

public class TestDB {

	//���� ������ ������ �ʿ��� ���۷����� �غ��ϱ�
	Connection con; //��� ����
	String query; //������ ����
	Statement stmt; //��ũ��Ʈ(������ �Է°���)
	ResultSet rs; // ���
	ArrayList<Info> storeInfos = new ArrayList<>(); //����� ����Ʈ�� ����
	
	//DB�� �����ϱ�
	void openCon() throws Exception{
	
		//����Ŭ �ּ�, ���̵�, ��й�ȣ
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userid = "test1";
		String pwd = "test1";
		
		//�ڹ� ���̺귯�� ���� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� �ε� ����");
		
		//��Ʈ��ũ ����� ��ü ����
		System.out.println("�����ͺ��̽� ���� �غ�...");
		con = DriverManager.getConnection(url,userid,pwd);
		System.out.println("�����ͺ��̽� ���� ����");
		
		//��ũ��Ʈ ����
		stmt = con.createStatement();
		System.out.println("��ũ��Ʈ ����");
	}
	
	//DB ���� ����
	void closeCon() throws Exception{
		con.close();
		System.out.println("�����ͺ��̽� ���� ����");
	}
	 
	
	//������ �ֱ�
	void inserData(String name, String loc) throws Exception{
		//smst��� ��ũ��Ʈ ��ü�� INSERT �������� �Է��ϰ� ����
		query = "INSERT INTO drugstore(name,loc) VALUES('" + name + "','" + loc + "')";
		stmt.executeUpdate(query); //��ũ��Ʈ�� ������ �Է��ϱ�
		System.out.println(query);
	}
	
	//������ ��������
	void selectData() throws Exception{
		query = "SELECT name, loc FROM drugstore";
		System.out.println(query);
		
		rs = stmt.executeQuery(query); //��ũ��Ʈ�� ������ �Է��ϰ� ������ �ޱ�
		while(rs.next()) {
			
			//�౹�̸��� ��ġ�� ���� ��ü ����
			Info temp = new Info(rs.getString(1), rs.getString(2));
			storeInfos.add(temp); //�迭�� ����
		}
		
		for (int i = 0; i < storeInfos.size(); i++) {
			System.out.println(storeInfos.get(i).name + " : " + storeInfos.get(i).loc);
		}
	}
	
	//������ �����
	void deleteData(String name) throws Exception{
		query ="DELETE drugstore WHERE name like '" + name + "'";
		stmt.executeUpdate(query);
		System.out.println(query);
	}
	
	
	public static void main(String[] args) {
		//���ο��� TestDB��ü�� �����ϰ� openCon()�Լ� ����
		TestDB td = new TestDB();
		try {
			td.openCon();
			//td.inserData("A�౹", "�λ걤���� �׽�Ʈ");
			td.deleteData("A�౹");
			td.closeCon();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
