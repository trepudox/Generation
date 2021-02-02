package exercicios;

public class EletronicoMain {
	public static void main(String[] args) {
		Eletronico celular = new Eletronico("Motorla", "Moto G7");
		
		celular.infoEletronico();
		
		celular.usar();
		celular.ligar();
		celular.usar();
		System.out.println(celular.getBateria());
		
		for(int i = 0; i < 9; i++) 
		{
			celular.usar();
		}
		
		celular.usar();
		
		celular.ligar();
		
		celular.setBateria(95);
		
	}
}
