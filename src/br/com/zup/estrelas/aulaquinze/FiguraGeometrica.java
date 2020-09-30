package br.com.zup.estrelas.aulaquinze;

public abstract class FiguraGeometrica {
	float area;
	
	public abstract float calculaArea();

	public void setArea(float area) {
		this.area = area;
	}
	
	public float getArea() {
		return this.area;
	}
}