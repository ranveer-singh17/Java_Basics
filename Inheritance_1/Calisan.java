
public class Calisan extends Kisi{
	
	String ofis;
	int maas;
	

	public Calisan(String isim, String adres, String telno, String eposta,String ofis,int maas) {
		super(isim, adres, telno, eposta);
		this.ofis=ofis;
		this.maas=maas;
		// TODO Auto-generated constructor stub
	}

	public String getOfis() {
		return ofis;
	}

	public void setOfis(String ofis) {
		this.ofis = ofis;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Calisan [ofis=" + ofis + ", maas=" + maas + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

	

	

}
