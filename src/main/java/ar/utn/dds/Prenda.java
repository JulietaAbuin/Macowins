package ar.utn.dds;

public class Prenda {
	float precioBase;
	String tipo;
	Estado estado;
	public Prenda(String tipoPrenda,float precioBase,Estado estado){
		this.tipo = tipoPrenda;
		this.precioBase = precioBase;
		this.estado = estado;
	}
	float precioFinalPrenda() {
		return this.estado.precioFinal(this.precioBase);
	}
}
