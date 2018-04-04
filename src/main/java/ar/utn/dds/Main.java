package ar.utn.dds;

public class Main {

	public static void main(String[] args) {
	Prenda prendita = new Prenda("saco",1200,new Promocion(20));
	prendita.precioFinalPrenda();
	System.out.println("El precio es " + prendita.precioFinalPrenda());

	}

}
