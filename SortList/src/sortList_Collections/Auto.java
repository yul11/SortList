package sortList_Collections;

public class Auto {
	
	  private String marke;
	  private int zulassung;
	  private int leistung;
	  

	  public Auto(String m, int i, int l) {
		  this.marke = m;
		  this.zulassung = i;
		  this.leistung = l;
	  }
	  
	  public String getMarke() {
		  return this.marke;
	  }

	  public int getZulassung() {
		  return this.zulassung;
	  }
	  
	  public int getLeistung() {
		  return this.leistung;
	  }	  

	  public String toString() {
		  return this.marke + " (" + this.zulassung + ")" + " (" + this.leistung + " PS)";
	  }

}
