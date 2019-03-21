package application.model;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the CATEGORIE database table.
 * 
 */
@Entity
@Table(name="categorie")
@XmlRootElement
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COD_CAT")
	private String codeCat;
	
	@Column(name="LIB_CATA")
	private String libCatAr;

	@Column(name="LIB_CATL")
	private String libCatFr;
	
	
	@OneToMany(mappedBy = "codCat")
	@JsonIgnore
    private Collection<Missionnaire> missionnaireCollection;

	
	

    @JsonIgnore	
	public Collection<Missionnaire> getMissionnaireCollection() {
		return missionnaireCollection;
	}


	public void setMissionnaireCollection(Collection<Missionnaire> missionnaireCollection) {
		this.missionnaireCollection = missionnaireCollection;
	}


	public Categorie() {
		super() ; 
	}


	public String getCodeCat() {
		return codeCat;
	}


	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}


	public String getLibCatAr() {
		return libCatAr;
	}


	public void setLibCatAr(String libCatAr) {
		this.libCatAr = libCatAr;
	}


	public String getLibCatFr() {
		return libCatFr;
	}


	public void setLibCatFr(String libCatFr) {
		this.libCatFr = libCatFr;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Categorie(String codeCat, String libCatAr, String libCatFr) {
		super();
		this.codeCat = codeCat;
		this.libCatAr = libCatAr;
		this.libCatFr = libCatFr;
	}
	

	




	
}