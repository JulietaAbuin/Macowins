package ar.utn.dds;
import java.util.ArrayList;
import java.util.List;
public class Venta {
	List<Prenda> listaPrendas = new ArrayList<Prenda>();
	Venta(MetodoDePago pago) {
		this.formadepago = pago;
	}

	MetodoDePago formadepago;

	float precioVentaFinal() {
		return 2;
	}
}
