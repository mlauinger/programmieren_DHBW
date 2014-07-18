package com.probeklausur;

public class Gebot {

	private double maxGebot;
	private Bieter bieter;
	
	public Gebot(Bieter b, double maxGebot){
		bieter = b;
		this.maxGebot = maxGebot;
	}

	public double getMaxGebot() {
		return maxGebot;
	}

	public void setMaxGebot(double maxGebot) {
		this.maxGebot = maxGebot;
	}

	public Bieter getBieter() {
		return bieter;
	}

	public void setBieter(Bieter bieter) {
		this.bieter = bieter;
	}
	
	
	
	
}
