public class Student extends Person {
	// imie i nazwisko
	private int klasa;
	private double srednia;
	
	
	public void setKlasa(int klasa) {
		this.klasa = klasa;
	}
	public int getKlasa() {
		return klasa;
	}
	
	public void setSrednia(double srednia) {
		this.srednia = srednia;
	}
	public double getSrednia() {
		return srednia;
	}

	public Student(String imie, String nazwisko, int klasa, double srednia) {
		super(imie, nazwisko);
		
		this.klasa=klasa;
		this.srednia=srednia;
	}
	
	public String show() {
		return "Czesc nazywam sie " + getImie() +" i chodze do "+ getKlasa() + " klasy :)"; 
	}

}
