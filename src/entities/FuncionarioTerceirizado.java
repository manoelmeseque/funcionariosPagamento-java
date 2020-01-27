package entities;

public class FuncionarioTerceirizado extends Funcionario {
	private Double adicional;
	
	public FuncionarioTerceirizado() {
		super();
	}
	
	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHoras, Double adicional) {
		super(nome, horas, valorPorHoras);
		this.adicional = adicional;
	}
	
	public Double getAdicional() {
		return adicional;
	}
	
	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + (adicional*1.1);
	}
}
