package ar.utn.dds;

public class Item {
	Prenda prenda;
	int cantidad;
	Item(Prenda prenda, int cantidad){
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	float importe() {
		return this.prenda.precioFinalPrenda() * this.cantidad;
	}
}
