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
	public int getchannel() {
		return channel;
	}
	public int getvolume() {
		return volume;
	}
	public void power(boolean power) {
		this.power=power;
	}
}


