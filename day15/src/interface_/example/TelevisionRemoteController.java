package interface_.example;

public class TelevisionRemoteController implements RemoteController {

	public final int inch;
	public int channel;

	public TelevisionRemoteController(int inch) {
		this.inch = inch;
		this.channel = 1;
	}

	@Override
	public void turnOn() {
		System.out.println("TV 전원 킴");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원 끔");
	}

	public void setChannelUp() {
		this.channel++;
	}

	public void setChannelDown() {
		if(this.channel-1 >= 1) this.channel--;
		else this.channel = 1;
	}
	
	public void setChannel(int channel) {
		if(channel < 1) this.channel = 1;
		else this.channel = channel;
	}

	@Override
	public void showStatus() {
		System.out.println("화면 크기: " + this.inch);
		System.out.println("현재 채널: " + this.channel);
	}

}
