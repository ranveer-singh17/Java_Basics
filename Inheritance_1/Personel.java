
public class Personel extends Calisan{
	
	String unvan;
	
	public Personel(String isim, String adres, String telno, String eposta, String ofis, int maas,String unvan) {
		super(isim, adres, telno, eposta, ofis, maas);
		this.unvan=unvan;
		// TODO Auto-generated constructor stub
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	@Override
	public String toString() {
		return "Personel [unvan=" + unvan + ", ofis=" + ofis + ", maas=" + maas + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
