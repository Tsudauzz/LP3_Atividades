package ex01;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Teclado");
		lista.add("Mouse");
		lista.add("Computador");
		lista.add("Mesa");
		lista.add("Monitor");
		
		for(String item : lista) {
			System.out.println(item);
		}
		
		lista.remove(0);
		System.out.println(" ");
		
		for(String item : lista) {
			System.out.println(item);
		}
		
	}
}
