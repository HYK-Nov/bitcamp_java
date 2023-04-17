package has_a;

public class Gun {
	
	private int bullet; // 총알 갯수
	private String modelName; // 총기 모델
	private String gunNumber; // 총기 번호
	
	public Gun(String modelName, String gunNumber) {
		this.bullet = 5;
		this.modelName = modelName;
		this.gunNumber = gunNumber;
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void shoot() {
		if(this.bullet > 0) {
			this.bullet--;
			System.out.println("총을 쐈습니다.");
		}else {
			System.out.println("총알이 없어서 나가지 않습니다.");
		}
	}
	
	public void reload() {
		this.bullet = 5;
		System.out.println("재장전 했습니다.");
	}
}
