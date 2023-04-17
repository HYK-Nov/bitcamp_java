package has_a;

public class MainClass {

	public static void main(String[] args) {
		Gun gun = new Gun("Awesome", "123456");
		
		// gun을 사전에 생성해야 함
		Police police = new Police(gun, "Cop", 178);
//		Police police = new Police(new Gun("Awesome", "123456"), "Cop", 178); // 익명클래스 사용하면 가능함
		
		police.showStatus();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.reload();
		police.shoot();
	}

}
