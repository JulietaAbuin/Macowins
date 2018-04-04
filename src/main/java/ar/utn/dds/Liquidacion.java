package ar.utn.dds;

public class Liquidacion implements Estado {
	public float precioFinal(float precioBase) {
		return precioBase/2;
	}
}
