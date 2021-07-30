package test;

public class Tv {
	private int channel;
	private int volume;
	private boolean power;

	Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getvolume() {
		System.out.println(volume);
		return volume;
	}
	public boolean getpower() {
		System.out.println(power);
		return power;
	}
	public boolean power(boolean power) {
		System.out.println(power);
		return power;
	}
	public int channel(int channel) {
		System.out.println(channel);
		return channel;
	}
	public boolean channel(boolean channel) {
		System.out.println(channel);
		return channel;
	}
	public int volume(int volume) {
		System.out.println(volume);
		return volume;
	}
	
}




