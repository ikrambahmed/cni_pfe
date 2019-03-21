package application.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author dell
 */
@Embeddable
public class FonctionPK implements Serializable {

 
    @Column(name = "CODE")
    private String code;
 
    @Column(name = "COD_FONCTION")
    private String codFonction;

    public FonctionPK() {
    }

	public FonctionPK(String code, String codFonction) {
		super();
		this.code = code;
		this.codFonction = codFonction;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodFonction() {
		return codFonction;
	}

	public void setCodFonction(String codFonction) {
		this.codFonction = codFonction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFonction == null) ? 0 : codFonction.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FonctionPK other = (FonctionPK) obj;
		if (codFonction == null) {
			if (other.codFonction != null)
				return false;
		} else if (!codFonction.equals(other.codFonction))
			return false;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

    
    
    
}
