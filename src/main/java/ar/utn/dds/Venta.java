package ar.utn.dds;

public class Venta {
	Venta(MetodoDePago pago) {
		this.formadepago = pago;
	}

	MetodoDePago formadepago;

	float precioVentaFinal() {
		return 2;
	}
}
