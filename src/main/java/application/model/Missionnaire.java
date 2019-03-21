package application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "MISSIONNAIRE")
@XmlRootElement
public class Missionnaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="CIN")
    private String cin;
  
    
    @Column(name="MATRICULE")
    private String matricule;
 
    
    @JoinColumn(name = "COD_CAT", referencedColumnName = "COD_CAT")
    @ManyToOne
    private Categorie codCat;
   
    @JoinColumn(name = "CLASSGRD", referencedColumnName = "CLASSGRD")
    @ManyToOne
    private Classe classgrd;
    
    @JoinColumn(name = "CODE", referencedColumnName = "CODE")
    @ManyToOne
    private DeptGen code;
    

    @JoinColumn(name = "CODGRP", referencedColumnName = "CODGRP")
    @ManyToOne
    private Groupe codgrp;


/*	@ManyToOne 
	private Grade Grade;*/
	
   
    
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "CODE", referencedColumnName = "CODE", insertable = false, updatable = false),
        @JoinColumn(name = "COD_GRD", referencedColumnName = "COD_GRD", insertable = false, updatable = false),
})
    
    private Grade grade;



    
    
   


	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public Missionnaire() {
    }

	public Missionnaire(String cin, String matricule) {
		super();
		this.cin = cin;
		this.matricule = matricule;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Categorie getCodCat() {
		return codCat;
	}

	public void setCodCat(Categorie codCat) {
		this.codCat = codCat;
	}

	public Classe getClassgrd() {
		return classgrd;
	}

	public void setClassgrd(Classe classgrd) {
		this.classgrd = classgrd;
	}

	public DeptGen getCode() {
		return code;
	}

	public void setCode(DeptGen code) {
		this.code = code;
	}

	public Groupe getCodgrp() {
		return codgrp;
	}

	public void setCodgrp(Groupe codgrp) {
		this.codgrp = codgrp;
	}



	

    
}

