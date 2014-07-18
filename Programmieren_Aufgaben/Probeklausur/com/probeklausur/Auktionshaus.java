package com.probeklausur;

import java.util.ArrayList;
import java.util.List;

public class Auktionshaus {

	private ArrayList<Auktion> alleAuktionen = new ArrayList<Auktion>();

	public void addAuktion(Auktion a) {
		alleAuktionen.add(a);
	}

	public void removeAuktion(Auktion a) {
		alleAuktionen.remove(a);
	}

	public List<Auktion> getAuktionen() {
		return alleAuktionen;
	}

}
