package entidade;

public class Compania extends TaxaPag {

	private Integer numeroDeFuncionarios;

	public Compania(String nome, double anual, Integer numeroDeFuncionarios) {
		super(nome, anual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	@Override
	public Double taxa() {
		if (numeroDeFuncionarios > 10) {
			return getAnual() * 0.14;
		}
		else {
			return getAnual() * 0.16;
		}

	

	
	}
	
}
