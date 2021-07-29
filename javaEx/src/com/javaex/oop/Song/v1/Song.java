package com.javaex.oop.Song.v1;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public Song(String artist, String title, String album, 
			int year, String composer,String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public Song(String artist) { // name 필드만 초기화 하는 생성자
		this.artist = artist;
	}
	public String gettitle() {
		return title;
	}
	public void settitle() {
		this.title = title;
	}
	public String getartist() {
		return artist;
	}
	public void setartist() {
		this.artist = artist;
	}
	public String getalbum() {
		return album;
	}
	public void setalbum() {
		this.album = album;
	}
	public String getcomposer() {
		return composer;
	}
	public void setcomposer() {
		this.composer = composer;
	}
	public int getyear() {
		return year;
	}
	public void setyear() {
		this.year = year;
	}
	public String gettrack() {
		return track;
	}
	public void settrack() {
		this.track = track;
	}
	public void showInfo() {
		System.out.println();
	}
}
