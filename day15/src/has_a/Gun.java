package has_a;

public class Gun {
	
	private int bullet; // �Ѿ� ����
	private String modelName; // �ѱ� ��
	private String gunNumber; // �ѱ� ��ȣ
	
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
			System.out.println("���� �����ϴ�.");
		}else {
			System.out.println("�Ѿ��� ��� ������ �ʽ��ϴ�.");
		}
	}
	
	public void reload() {
		this.bullet = 5;
		System.out.println("������ �߽��ϴ�.");
	}
}
