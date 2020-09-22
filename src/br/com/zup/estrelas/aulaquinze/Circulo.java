package br.com.zup.estrelas.aulaquinze;

public class Circulo extends FiguraGeometrica{
	private double raio;
	
	public Circulo (double raio) {
		this.raio = raio;
	}

	@Override
	public float calculaArea() {
		double areaDouble = Math.PI * Math.pow(raio, 2);
		super.area = (float)areaDouble;
		super.setArea(area);
		return area;
	}
}
