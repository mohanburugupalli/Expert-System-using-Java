package com.javacodegeeks.drools;

public class Stockprice {
	public float dividend;
	public int globalcues;
	public float revenuegrowth;
	public int netclientschange;
	public float randd;
	public int taxbenefits;
	public int newproducts;

	public int getNewproducts() {
		return newproducts;
	}

	public void setNewproducts(int np) {
		this.newproducts = np;
	}

	public int getTaxbenefits() {
		return taxbenefits;
	}

	public void setTaxbenefits(int tax) {
		this.taxbenefits = tax;
	}

	public float getRandd() {
		return randd;
	}

	public void setRandd(float rd) {
		this.randd = rd;
	}

	public int getNetclientschange() {
		return netclientschange;
	}

	public void setNetclientschange(int cli) {
		this.netclientschange = cli;
	}

	public int getGlobalcues() {
		return globalcues;
	}

	public void setGlobalcues(int glbl) {
		this.globalcues = glbl;
	}

	public float getRevenuegrowth() {
		return revenuegrowth;
	}

	public void setRevenuegrowth(float rev) {
		this.revenuegrowth = rev;
	}

	public float getDividend() {
		return dividend;
	}

	public void setDividend(float div) {
		this.dividend = div;
	}

}
