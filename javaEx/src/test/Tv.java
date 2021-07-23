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
	public int getchannel(int channel) {
		return channel;
	}
	public int getvolume(int volume) {
		return volume;
	}
	public boolean ispower(boolean power) {
		return power;
	}
}


