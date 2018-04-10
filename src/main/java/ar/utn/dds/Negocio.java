package ar.utn.dds;
import java.util.ArrayList;
import java.util.List;
public class Negocio {
	List<Venta> listaVentas = new ArrayList<Venta>();
	void agregarVenta(Venta venta) {
		listaVentas.add(venta);
	}
	
	float gananciasDeUnDia() {
		return 9;
	}
}
