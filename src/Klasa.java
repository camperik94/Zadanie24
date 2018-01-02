
public class Klasa {
	private String tekst;

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Klasa(String tekst) {
		this.tekst = tekst;
	}
	
	public void funkcja() {
		for(int i = tekst.length()-1; i >= 0; i--) {
			System.out.print(Character.toString(tekst.charAt(i)));
		}
	}
}
