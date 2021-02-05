package exercicios;

public class Main {
	public static void main(String[] args) {
		Cachorro keylor = new Cachorro("Keylor", 2, "Labrador");
		
		keylor.fichaAnimal();
		keylor.correr();
		keylor.emitirSom();
		
		Cavalo jorge = new Cavalo("Jorge", 5, "Preto");
		
		jorge.fichaAnimal();
		jorge.correr();
		jorge.emitirSom();
		
		Preguica doido = new Preguica("Doido", 6);
		
		doido.fichaAnimal();
		doido.subirArvore();
		doido.emitirSom();
		
		
	}
}
