package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�");
		System.out.println("�ڵ����� ������ ������ ��ȯ�մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");		
	}
	
	@Override
	public void wiper() {
		System.out.println("�� ���� �翡 ���� �����Ⱑ �ڵ����� �����˴ϴ�.");		
	}
}
