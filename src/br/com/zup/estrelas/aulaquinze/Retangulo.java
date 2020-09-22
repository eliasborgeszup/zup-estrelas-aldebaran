package br.com.zup.estrelas.aulaquinze;

public class Retangulo extends FiguraGeometrica{
	
	private float base, altura;
	
	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float calculaArea() {
		super.area = this.base * this.altura;
		super.setArea(area);
		return super.area;
	}
}
