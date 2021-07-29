package com.javaex.api.objectclass.v4;

import java.util.*;
import com.javaex.api.objectclass.v3.Point;

public class Scoreboard implements Cloneable {
	// 참조 타입 필드
	private int scores[];
	
	// 생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "scorese"+Arrays.toString(scores);
	}
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone(); // clone() 메서드는 checked예외
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
}
	// 깊은 복제의 경우. 내부 참조 필드들을
	// 모두 새로 복제하여 새 객체로 만들고
	// 참조 다시 연결 해야
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얇은 복제를 시도
		Scoreboard clone = (Scoreboard)super.clone();
		// 내부 참조 객체를 복제
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}
}
