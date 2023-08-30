package com.tnsif.MultiLevelInheritace;

public class City extends State {
	
	private String mayor;
	private String historical_monument;
	public City(String name, int population,String capital, String languagespoken,String mayor, String historical_monument) {
		super(name, population,capital,languagespoken);
		this.mayor = mayor;
		this.historical_monument = historical_monument;
	}
	public String getMayor() {
		return mayor;
	}
	public void setMayor(String mayor) {
		this.mayor = mayor;
	}
	public String getHistorical_monument() {
		return historical_monument;
	}
	public void setHistorical_monument(String historical_monument) {
		this.historical_monument = historical_monument;
	}
	@Override
	public String toString() {
		return "City [mayor=" + mayor + ", historical_monument=" + historical_monument + ", Capital="
				+ getCapital() + ", Languagespoken=" + getLanguagespoken() + ", Name=" + getName()
				+ ", Population=" + getPopulation() + "]";
	}
	

}
