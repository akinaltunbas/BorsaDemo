package domain;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;
import javax.persistence.Transient;



@Entity
public class Hisse {
	
	@Id
	@TableGenerator(name="HÝS_GEN")
	@GeneratedValue(generator="HÝS_GEN")
	private int id;
	private String kod;
	private String isim;
	
	
	private Double price;
	

	@Transient
	private Date date;
	
	@ManyToMany(mappedBy="hisses")
	private List<Kullanici> kullanicis;

	public Hisse() {
		super();
	}
	
	



	public Hisse(String kod, String isim) {
		super();
		this.kod = kod;
		this.isim = isim;
	}

	



	public Hisse(String kod) {
		super();
		this.kod = kod;
	}

	



	public Hisse(String kod, String isim, Date date) {
		super();
		this.kod = kod;
		this.isim = isim;
		this.date = date;
	}





	public Hisse(String kod, String isim, Double price, Date date) {
		super();
		this.kod = kod;
		this.isim = isim;
		this.price = price;
		this.date = date;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	


	public List<Kullanici> getKullanicis() {
		return kullanicis;
	}





	public void setKullanicis(List<Kullanici> kullanicis) {
		this.kullanicis = kullanicis;
	}





	@Override
	public String toString() {
		return "Hisse [id=" + id + ", kod=" + kod + ", isim=" + isim + ", price=" + price + ", date=" + date + "]";
	}






	


	
	



	

	
	
	

}
