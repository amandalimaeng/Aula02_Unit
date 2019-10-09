
public class TesteFuncionario {

	public static void main(String[] args) {
		double salario = 1000.00;
		Funcionario g= new Gerente(salario);
		
		double bonificacao= g.getBonificacao();
		System.out.println("A bonificação é de: R$"+bonificacao);
		
	}

}
