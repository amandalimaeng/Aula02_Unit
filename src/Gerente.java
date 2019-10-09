
public class Gerente extends Funcionario{
	protected double salario;
		
	public Gerente(double salario) {
		super(salario);
		this.salario=salario;
	}
	
	@Override
	public double getBonificacao() {
		return (this.salario*1.4)+1000;
	}
	
	
	
	

}
