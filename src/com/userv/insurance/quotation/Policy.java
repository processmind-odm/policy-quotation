package com.userv.insurance.quotation;

import java.util.ArrayList;

public class Policy {
	//Input Parameters
	private ArrayList<Auto> auto;
	private Client client;
	private ArrayList<Driver> driver;
	
	//Variables
	private String policyEligibility;
	private double policyEligibilityScore;
	
	//Getters and Setters
	public double getPolicyEligibilityScore() {
		return policyEligibilityScore;
	}
	public void setPolicyEligibilityScore(double policyEligibilityScore) {
		this.policyEligibilityScore = policyEligibilityScore;
	}
	public String getPolicyEligibility() {
		return policyEligibility;
	}
	public void setPolicyEligibility(String policyEligibility) {
		this.policyEligibility = policyEligibility;
	}
	public ArrayList<Auto> getAuto() {
		return auto;
	}
	public void setAuto(ArrayList<Auto> auto) {
		this.auto = auto;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ArrayList<Driver> getDriver() {
		return driver;
	}
	public void setDriver(ArrayList<Driver> driver) {
		this.driver = driver;
	}

	//Custom Methods
	public Driver getCurrentDriver(int index){
		return driver.get(index);
	}
	public Auto getCurrentAuto(int index){
		return auto.get(index);
	}
	public double sumAutosScore() {
		double policyScore = 0;
		for (int i = 0; i < auto.size(); i++) {
			policyScore += auto.get(i).getAutoEligibilityScore();
		}
		return policyScore;
	}
	public double sumDriversScore() {
		double policyScore = 0;
		for (int i = 0; i < driver.size(); i++) {
			policyScore += driver.get(i).getDriverEligibilityScore();
		}
		return policyScore;
	}
	public void setAllEligibilities(String eligibility) {
		for (int i = 0; i < auto.size(); i++) {
			auto.get(i).setAutoEligibility(eligibility);
		}
		for (int i = 0; i < driver.size(); i++) {
			driver.get(i).setDriverEligibility(eligibility);
		}
	}

	public void setAllCoveredByLongTermClient(String covered) {
		for (int i = 0; i < auto.size(); i++) {
			auto.get(i).setAutoCoveredByLongTermClient(covered);
		}
		for (int i = 0; i < driver.size(); i++) {
			driver.get(i).setDriverCoveredByLongTermClient(covered);
		}
	}
}
