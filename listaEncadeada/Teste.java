package listaEncadeada;

public class Teste {

	public static void main(String[] args) {
		ListaEncadedaSimples lista = new ListaEncadedaSimples();
		lista.adicionaPrimeiroElemento(new No("�caro"));
		lista.adicionaElemento(new No("Jo�o"));
		lista.adicionaElemento(new No("Pedro"));
		lista.adicionaElemento(new No("Jos�"));
		lista.adicionaElemento(new No("Tais"));
		System.out.println("===============   1");
		System.out.println(lista.toString());
		
		/* Verifica se cont�m o elemento */
		lista.contem("Jo�o");
		
		/* Remove o �ltimo elemento */
		lista.removeCauda();
		System.out.println(lista.toString());
		
		/* remove o elemento escolhido */
		lista.remove(2);
		System.out.println(lista.toString());
		
//		lista.adicionaPosicao(3, new No("Vanessa"));
//		System.out.println("===============   2");
//		System.out.println(lista.toString());
//		lista.removeCabeca();
//		System.out.println("===============   3");
//		System.out.println(lista.pegaElemento(2).toString());
//		lista.adicionaPrimeiroElemento(new No("�caro111111111"));
//		System.out.println("===============  4 ");
//		System.out.println(lista.toString());
	
	}
}
