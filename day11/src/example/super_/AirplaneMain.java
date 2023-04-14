package example.super_;

public class AirplaneMain {

	public static void main(String[] args) {
		SupersonicAirplane sa1 = new SupersonicAirplane("LJ421");
		
		for (int i = 0; i < 8; i++) {
			sa1.fly();
		}
		
		System.out.println(sa1.speed);
		
		sa1.showStatus();
		System.out.println("-----------------");
		
		for (int i = 0; i < 3; i++) {
			sa1.fly();
		}
		
		sa1.showStatus();
	}

}
