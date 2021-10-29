package listaEncadeada;

public class Teste {

	public static void main(String[] args) {
		
		try {
			
			ListaEncadedaSimples lista = new ListaEncadedaSimples();
			lista.adicionaPrimeiroElemento(new No("�caro"));
			lista.adicionaElemento(new No("Jo�o"));
			lista.adicionaElemento(new No("Pedro"));
			lista.adicionaElemento(new No("Jos�"));
			lista.adicionaElemento(new No("Tais"));
			System.err.println("Se o c�digo est� bom, compartilha e d� o seu joinha! \n");
			System.out.println(lista.toString());
			
			/* Verifica se cont�m o elemento (Jo�o)*/
			lista.contem("Jo�o");
			
			/* Remove o �ltimo elemento (Tais)*/
			lista.removeCauda();
			System.out.println(lista.toString());
			
			/* remove o elemento escolhido (2 - Jo�o)*/
			lista.remove(2);
			System.out.println(lista.toString());
			
			
			
			
//			lista.adicionaPosicao(3, new No("Vanessa"));
//			System.out.println("===============   2");
//			System.out.println(lista.toString());
//			lista.removeCabeca();
//			System.out.println("===============   3");
//			System.out.println(lista.pegaElemento(2).toString());
//			lista.adicionaPrimeiroElemento(new No("�caro111111111"));
//			System.out.println("===============  4 ");
//			System.out.println(lista.toString());
		
		
		
			
		} catch (NullPointerException n) {
			System.err.println("Os campos n�o podem ser Nulos!");
			n.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\nPrograma Encerrado com sucesso! *ou n�o :(");
		}
		
		
	}	
}
