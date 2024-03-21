package ex04;

public class Computador implements DispositivoEletronico{

		@Override
		public void ligar() {
			System.out.println("Ligando PC");
		}
		
		@Override
		public void desligar() {
			System.out.println("Desligando PC");
		}
}
