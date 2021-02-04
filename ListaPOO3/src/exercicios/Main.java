package exercicios;

public class Main {
	public static void main(String[] args) {
		Cachorro jog = new Cachorro("Jog", 2, "Labrador");
		
		jog.correr();
		jog.emitirSom();
		jog.fichaAnimal();
		
		Cavalo jorge = new Cavalo("Jorge", 5, "Preto");
		
		jorge.emitirSom();
		jorge.fichaAnimal();
		jorge.correr();
		
		Preguica doido = new Preguica("Doido", 6);
		
		doido.emitirSom();
		doido.fichaAnimal();
		doido.subirArvore();
	}
}
