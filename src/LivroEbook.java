
public class LivroEbook extends Livro{
	public LivroEbook(String nome, Double valor) {
		super(nome, valor);
	}
	
	public double desconto(double porcentagemDesconto) {
		return (porcentagemDesconto >= 0.15) ? 0.15 : porcentagemDesconto;
	}
}
