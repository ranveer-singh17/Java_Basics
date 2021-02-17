
public class Kisi {
	
	private String isim;
	private String adres;
	private String telno;
	private String eposta;
	public Kisi(String isim, String adres,String telno, String eposta) {
		super();
		this.isim = isim;
		this.adres = adres;
		this.telno = telno;
		this.eposta = eposta;
	}
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}



	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", adres=" + adres + ", telno=" + telno + ", eposta=" + eposta + "]";
	}
	
	
	
	

}
