package generics.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class FactoryTest {

	public static void main(String[] args) throws IOException {

		CarFactory<Car> carFactory = new CarFactory<Car>();
		
		// ShipFactory<AutoCar> factory2 = new ShipFactory<AutoCar>();  //���� ��
		AutoCar car = new AutoCar("�� ��");
		carFactory.fixCar(car);
		
		ShipFactory<Ship> shipFactory = new ShipFactory<>();
		Cruze cruze = new Cruze("�� ũ����");
		shipFactory.fixShip(cruze);
		
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
}
