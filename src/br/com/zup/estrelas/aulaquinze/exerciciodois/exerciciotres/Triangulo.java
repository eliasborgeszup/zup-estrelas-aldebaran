package br.com.zup.estrelas.aulaquinze.exerciciodois.exerciciotres;

public class Triangulo extends FiguraGeometrica{
	private float base, altura;
	
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public float calculaArea() {
		super.area = (this.base * this.altura) / 2;
		super.setArea(area);
		return area;
	}

}
