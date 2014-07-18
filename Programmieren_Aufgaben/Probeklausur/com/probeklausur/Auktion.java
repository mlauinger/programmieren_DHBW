package com.probeklausur;

import java.util.Calendar;
import java.util.Date;

public class Auktion {

	private static double INCREMENT = 1.0;
	
	private Ware ware;
	private Gebot hoechstgebot = null;
	private double aktuellesGebot = 0.0;
	private Calendar endDatum;
	
	public Auktion(Ware ware, int dauer) {
		this.ware = ware;
		Calendar currDate = Calendar.getInstance();
		currDate.setTimeInMillis(currDate.getTimeInMillis() + (dauer * 60000));
		endDatum = currDate;
	}
	
	public boolean gebotAbgeben(Gebot g) {
		if(g.getMaxGebot() > hoechstgebot.getMaxGebot()) {
			if(hoechstgebot == null) {
				aktuellesGebot = INCREMENT;
				hoechstgebot = g;
				return true;
			} else if((g.getBieter() == hoechstgebot.getBieter()) && (g.getMaxGebot() > hoechstgebot.getMaxGebot())) {
				hoechstgebot.setMaxGebot(g.getMaxGebot());
				return true;
			} else {
				aktuellesGebot = (hoechstgebot.getMaxGebot() + INCREMENT);
				hoechstgebot = g;
				return true;
			}
		} else {
			if(g.getMaxGebot() < (aktuellesGebot + INCREMENT)) {
			} else {
				aktuellesGebot = (g.getMaxGebot() + INCREMENT);
			}
			return false;
		}
	}
}
