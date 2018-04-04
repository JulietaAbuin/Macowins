package ar.utn.dds;

public class Promocion {
	private float descuento;
	public Promocion(float descuento){
		this.descuento=descuento;
		}
	public float precioFinal(float precioBase) {
		return precioBase - this.descuento;
	}
}
