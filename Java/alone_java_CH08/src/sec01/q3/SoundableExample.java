package sec01.q3;

public class SoundableExample {
	private static void printSound(Soundable soundalbe) {
		System.out.println(soundalbe.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
