package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void startCar()
	{
		System.out.println("�õ��� �մϴ�");
	}
	
	public  void turnOff()
	{
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run()
	{
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
