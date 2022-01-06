package Ch07;
/*
 * ��¥ : 2022/01/03
 * �̸� : ������
 * ���� : �ڹ� �������̽� �ǽ��ϱ� ���� p228
 */
public class InterfaceTest {

	public static void main(String[] args) {
		
		// �������̽��� ���� Ŭ���� ���� ����
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.powerOff();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();

		samsung.powerOn();
		samsung.chUp();
		
		// �������̽��� �̿��� ���յ� ��ȭ
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
	}
	
	
}
