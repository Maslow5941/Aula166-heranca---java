package entidade;

public class Individual extends TaxaPag {

	 
	private Double gastoSaude;
	


	public Individual(String nome, double anual, Double gastoSaude) {
		super(nome, anual);
		this.gastoSaude = gastoSaude;
	}


	public Double gastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double taxa() {
		// TODO Auto-generated method stub
		if(getAnual()<20000.0) {
			return getAnual()*0.15 - gastoSaude*0.5;
		}else {
			return getAnual()*0.25 - gastoSaude*0.5;
		}
		
		
	}
	
	
	
	
}
