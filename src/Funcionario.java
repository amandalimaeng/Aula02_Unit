
public abstract class Funcionario {
	protected double salario;
	
	public Funcionario(double salario) {
		this.salario=salario;
	} 
	
	public double getBonificacao() {
		return this.salario*1.2;
		
	}

}
