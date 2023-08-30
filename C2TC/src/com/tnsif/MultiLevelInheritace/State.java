package com.tnsif.MultiLevelInheritace;

public class State extends Country {
	
	private  String capital;
	private String languagespoken;
	public State(String name, int population,String capital, String languagespoken) {
		super(name, population);
		this.capital = capital;
		this.languagespoken = languagespoken;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getLanguagespoken() {
		return languagespoken;
	}
	public void setLanguagespoken(String languagespoken) {
		this.languagespoken = languagespoken;
	}
	@Override
	public String toString() {
		return "State [capital=" + capital + ", languagespoken=" + languagespoken + ", Name=" + getName()
				+ ", Population=" + getPopulation() + "]";
	}
	
	
	
	

}
