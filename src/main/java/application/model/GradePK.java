package application.model;

	import java.io.Serializable;
	import javax.persistence.Basic;
	import javax.persistence.Column;
	import javax.persistence.Embeddable;
	import javax.validation.constraints.NotNull;
	import javax.validation.constraints.Size;

	@Embeddable
	public class GradePK implements Serializable {

	 
		private static final long serialVersionUID = 1L;

	
		

		
		
	    @Column(name = "CODE")
	    private String code;
	   
	
	    @Column(name = "COD_GRD")
	    private String codGrd;

	    
	    public GradePK() {
	    	super() ; 
	    
	    }


		public GradePK(String code, String codGrd) {
			super();
			this.code = code;
			this.codGrd = codGrd;
		}


		public String getCode() {
			return code;
		}


		public void setCode(String code) {
			this.code = code;
		}


		public String getCodGrd() {
			return codGrd;
		}


		public void setCodGrd(String codGrd) {
			this.codGrd = codGrd;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((codGrd == null) ? 0 : codGrd.hashCode());
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
			GradePK other = (GradePK) obj;
			if (codGrd == null) {
				if (other.codGrd != null)
					return false;
			} else if (!codGrd.equals(other.codGrd))
				return false;
			if (code == null) {
				if (other.code != null)
					return false;
			} else if (!code.equals(other.code))
				return false;
			return true;
		}
	    
	    

	    
	}
