package airplane;

import java.util.HashMap;

public class FlightInfoService {
	public static HashMap<String, String> airLindId = new HashMap<>();
	public static HashMap<String, String> airPortId = new HashMap<>();
	
	public static void setAirLineId() {
		airLindId.put("�ƽþƳ��װ�", "AAR");
		airLindId.put("����λ�", "ABL");
		airLindId.put("�̽�Ÿ�װ�", "ESR");
		airLindId.put("�����װ�", "JJA");
		airLindId.put("�� ����", "JNA");
		airLindId.put("���� �װ�", "KAL");
		airLindId.put("Ƽ�����װ�", "TWB");
	}

	public static void setAirPortId() {
		airPortId.put("����", "NAARKJB");
		airPortId.put("����", "NAARKJJ");
		airPortId.put("����", "NAARKJK");
		airPortId.put("����", "NAARKJY");
		airPortId.put("����", "NAARKNW");
		airPortId.put("���", "NAARKNY");
		airPortId.put("����", "NAARKPC");
		airPortId.put("����", "NAARKPK");
		airPortId.put("��õ", "NAARKPS");
		airPortId.put("���", "NAARKPU");
		airPortId.put("��õ", "NAARKSI");
		airPortId.put("����", "NAARKSS");
		airPortId.put("����", "NAARKTH");
		airPortId.put("�뱸", "NAARKTN");
		airPortId.put("û��", "NAARKTU");
	}
	
}
