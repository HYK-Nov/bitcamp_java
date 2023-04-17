package final_.field;

public class Collector {
	// 참조형 변수를 가진 경우, 배열자체의 주소는 final이지만
	// 참조형 변수의 내부 자료까지 바뀌지 않음을 보장하지 않음
	final String[] stickers = {"Pikachu", "Lizadon", "Phantom"};
}
