package br.com.zup.estrelas.aulaquinze.exerciciodois.exerciciotres;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		FiguraGeometrica retangulo = new Retangulo(10f, 5f);
		FiguraGeometrica triangulo = new Triangulo(12.8f, 2f);
		FiguraGeometrica circulo = new Circulo(12.8f);
		
		IFiguraGeometrica quadrado = new Quadrado(12f);
		
		System.out.println("Quadrado: " + quadrado.calculaArea());
		System.out.println("Retangulo: " + retangulo.calculaArea());
		System.out.println("Triangulo: " + triangulo.calculaArea());
		System.out.println("Circulo: " + circulo.calculaArea());
	}

}
