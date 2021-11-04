package es.iessoterhernandez.daw.endes;

import es.iessoterohernandez.daw.endes.Fibonacci;

public class fibonacciMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Fibonacci f1 = new Fibonacci("fibonacci 1",10); 
		f1.mostrarSerie();
		
		Fibonacci f2 = new Fibonacci();
		f2.setNombre("fibonacci 2");
		f2.setTamaño(10);
		f2.mostrarSerie();
		
		

	}

}
