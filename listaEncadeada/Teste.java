package listaEncadeada;

public class Teste {

	public static void main(String[] args) {
		
		try {
			
			ListaEncadedaSimples lista = new ListaEncadedaSimples();
			lista.adicionaPrimeiroElemento(new No("Ícaro"));
			lista.adicionaElemento(new No("João"));
			lista.adicionaElemento(new No("Pedro"));
			lista.adicionaElemento(new No("José"));
			lista.adicionaElemento(new No("Tais"));
			System.err.println("Se o código está bom, compartilha e dê o seu joinha! \n");
			System.out.println(lista.toString());
			
			/* Verifica se contém o elemento (João)*/
			lista.contem("João");
			
			/* Remove o último elemento (Tais)*/
			lista.removeCauda();
			System.out.println(lista.toString());
			
			/* remove o elemento escolhido (2 - João)*/
			lista.remove(2);
			System.out.println(lista.toString());
			
			
			
			
//			lista.adicionaPosicao(3, new No("Vanessa"));
//			System.out.println("===============   2");
//			System.out.println(lista.toString());
//			lista.removeCabeca();
//			System.out.println("===============   3");
//			System.out.println(lista.pegaElemento(2).toString());
//			lista.adicionaPrimeiroElemento(new No("Ícaro111111111"));
//			System.out.println("===============  4 ");
//			System.out.println(lista.toString());
		
		
		
			
		} catch (NullPointerException n) {
			System.err.println("Os campos não podem ser Nulos!");
			n.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("\nPrograma Encerrado com sucesso! *ou não :(");
		}
		
		
	}	
}
