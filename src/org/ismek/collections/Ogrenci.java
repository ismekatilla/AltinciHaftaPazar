package org.ismek.collections;

public class Ogrenci {

	private int numara;
	private String isim;

	public Ogrenci(String isim, int numara) {
		this.numara = numara;
		this.isim = isim;
	}
	
	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numara + " " + isim;
	}
}