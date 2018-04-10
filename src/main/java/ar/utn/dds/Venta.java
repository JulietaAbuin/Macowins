package ar.utn.dds;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Venta {
	MetodoDePago formadepago;
	List<Item> listaItems = new ArrayList<Item>();
	private Date fecha = new Date();
	
	Venta(MetodoDePago pago) {
		this.formadepago = pago;
	}

	Date getFecha() {
		return this.fecha;
	}
	float importeParcial() {
		return (float)listaItems.stream().mapToDouble(item ->item.importe()).sum();
	}
	
	float importeTotal() {
		return formadepago.calcular(this.importeParcial());
	}
}
