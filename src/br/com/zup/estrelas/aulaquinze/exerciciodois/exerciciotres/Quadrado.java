package br.com.zup.estrelas.aulaquinze.exerciciodois.exerciciotres;

public class Quadrado implements IFiguraGeometrica{
	private double lado;
	
	public Quadrado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		double area = this.lado * this.lado;
		return area;
	}
}
