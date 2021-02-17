
public class Ogrenci extends Kisi{
	
	boolean ise;
	
	public Ogrenci(String isim, String adres, String telno, String eposta,boolean ise) {
		super(isim, adres, telno, eposta);
		this.ise=ise;
		// TODO Auto-generated constructor stub
	}

	public boolean isIse() {
		return ise;
	}

	public void setIse(boolean ise) {
		this.ise = ise;
	}

	@Override
	public String toString() {
		return "Ogrenci [ise=" + ise + ", toString()=" + super.toString() + "]";
	}
	
	
	
	



}
