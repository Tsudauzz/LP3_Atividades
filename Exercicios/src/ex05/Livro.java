package ex05;

public class Livro {
	private int totalPaginas;
	
	public Livro(int pgs) {
		this.totalPaginas = pgs;
	}
	
	public void lerPaginas(int paginas) {
		try {
			
			if (paginas < 1 || paginas > totalPaginas) {
				throw new Exception("Erro");
			}
			System.out.println("Páginas lidas com sucesso!");
			
		} catch(Exception meuObjErro) {
			System.out.println("Meu Erro de Paralamas!");
			System.out.println(meuObjErro.getMessage());
		}
	}
}
