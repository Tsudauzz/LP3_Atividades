package ex04;

public class Televisao implements DispositivoEletronico{

		@Override
		public void ligar() {
			System.out.println("Ligando TV");
		}
		
		@Override
		public void desligar() {
			System.out.println("Desligando TV");
		}
}
