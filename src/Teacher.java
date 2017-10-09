public class Teacher extends Person {
	//imie i nazwisko i getety setery
	private String przedmiot;
	private int wiek;
	
	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}
	public String getPrzedmiot() {
		return przedmiot;
	}
	
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	public int getWiek() {
		return wiek;
	}

	public Teacher(String imie, String nazwisko, String przedmiot, int wiek) {
		super(imie, nazwisko);
		
		this.przedmiot=przedmiot;
		this.wiek=wiek;
	}
	public String show() {
		return "Czesc nazywam sie " + getImie() +" i ucze przedmiotu "+ getPrzedmiot(); 
	}
}
