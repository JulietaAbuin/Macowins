package ar.utn.dds;

public class Efectivo implements MetodoDePago{
	public float calcular(float importeParcial) {
		return importeParcial - (importeParcial*10/100);
	}
}
