package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0 )
			return num1/num2;
		else 
			return Calc.ERROR;
	}
	@Override
	public int square(int num) {
		return num * num;
	}
	
	public void showInfo(){
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�" );
	}

	@Override
	public void description() {
		super.description();
	}
}
