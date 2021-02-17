
public class Fakulte extends Calisan{
	
	int ofissaati;
	int seviye;

	public Fakulte(String isim, String adres, String telno, String eposta, String ofis, int maas,int ofissaati,int seviye) {
		super(isim, adres, telno, eposta, ofis, maas);
		this.ofissaati=ofissaati;
		this.seviye=seviye;
		
		// TODO Auto-generated constructor stub
	}
	
	public int getOfissaati() {
		return ofissaati;
	}

	public void setOfissaati(int ofissaati) {
		this.ofissaati = ofissaati;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Fakulte [ofissaati=" + ofissaati + ", seviye=" + seviye + ", toString()=" + super.toString() + "]";
	}
	
	

	
}
