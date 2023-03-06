package app;

public class Kayttaja {
	private LajitteluAlgoritmi lajittelu;
	
	public Kayttaja(LajitteluAlgoritmi lajittelu) {
		this.lajittelu = lajittelu;
	}
	
	public Kayttaja() {
		this.lajittelu = new QuickLajittelu();
	}
	
	public void setLajittelu(LajitteluAlgoritmi lajittelu) {
		this.lajittelu = lajittelu;
	}
	
	public void lajittele(int[] arr) {
		lajittelu.lajittele(arr);
	}
}
