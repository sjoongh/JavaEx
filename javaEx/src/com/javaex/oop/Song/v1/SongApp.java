package com.javaex.oop.Song.v1;

public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song("아이유", "좋은날", 
				"Real", 2010, "3번 track", "이민수 작곡");
		
		Song bigbang = new Song("BIGBANG", "거짓말",
				"Always", 2007, "2번 track", "G-DRAGON 작곡");
		
		Song busk = new Song("버스커버스커", "벚꽃엔딩",
				"버스커버스커1집", 2012, "4번 track", "장범준 작곡");
		
		System.out.printf("%s, %s ( %s %d %s %s )%n",
				iu.getartist(), iu.gettitle(), iu.getalbum(), iu.getyear(),
				iu.getcomposer(), iu.gettrack());
		System.out.printf("%s, %s ( %s %d %s %s )%n",
				bigbang.getartist(), bigbang.gettitle(), bigbang.getalbum(), bigbang.getyear(),
				bigbang.getcomposer(), bigbang.gettrack());
		System.out.printf("%s, %s ( %s %d %s %s )%n",
				busk.getartist(), busk.gettitle(), busk.getalbum(), busk.getyear(),
				busk.getcomposer(), busk.gettrack());
		
		iu.showInfo();
	}
	

}
