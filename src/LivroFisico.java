
public class LivroFisico extends Livro {
	public LivroFisico(String nome, Double valor) {
		super(nome, valor);
	}
	
	public double desconto(double porcentagemDesconto) {
		return (porcentagemDesconto >= 0.05) ? 0.05 : porcentagemDesconto;
	}
}
