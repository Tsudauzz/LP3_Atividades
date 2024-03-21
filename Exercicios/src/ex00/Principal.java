package ex00;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(4);
		lista.add(2);
		lista.add(9);
		lista.add(0);
		lista.add(3);
		
		for(int item : lista) {
			System.out.println(item);
		}
		
	}
}
