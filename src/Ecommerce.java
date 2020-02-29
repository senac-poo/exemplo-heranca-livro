
public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LivroFisico livroFisico = new LivroFisico("Orientação à Objetos", 100.0);
		LivroEbook livroEbook = new LivroEbook("Orientação à Objetos", 95.0);
		
		// aplicando descontos
		double descontoFisico = livroFisico.desconto(0.20);
		double descontoEbook = livroEbook.desconto(0.02);
		
		System.out.println("Desconto do livro físico: " + descontoFisico);
		System.out.println("Desconto do livro ebook: " + descontoEbook);
	}

}
