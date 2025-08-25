package com.sutherland.loanapplication.dto;

public class Creditscore {
	private String pancard;
	private String name ;
	private int score;
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Creditscore [pancard=" + pancard + ", name=" + name + ", score=" + score + "]";
	}
	

}
