package entidade;

public abstract class TaxaPag {

	private String nome;
	private double anual;
	
	
	public TaxaPag(String nome, double anual) {
		
		this.nome = nome;
		this.anual = anual;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getAnual() {
		return anual;
	}


	public void setAnual(double anual) {
		this.anual = anual;
	}
	
	public abstract Double taxa();



	
}
