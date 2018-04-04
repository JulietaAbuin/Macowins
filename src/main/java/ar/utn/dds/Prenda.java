package ar.utn.dds;

public class Prenda {
	float precioBase;
	TipoPrenda tipo;
	Estado estado;

	float precioFinalPrenda() {
		return this.estado.precioFinal(this.precioBase);
	}
}
