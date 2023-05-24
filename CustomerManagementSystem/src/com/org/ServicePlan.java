package com.org;

public enum ServicePlan {

	// ServicePlan charges :
	// SILVER : 1000
	// GOLD : 2000
	// DIAMOND : 5000
	// PLATINUM : 10000
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private double charge;

	private ServicePlan(double charge) {
		this.charge = charge;
	}

	public double getCharge() {
		return charge;
	}

}
