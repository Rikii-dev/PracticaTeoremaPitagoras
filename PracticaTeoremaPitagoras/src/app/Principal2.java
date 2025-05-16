package app;

import clases.TrianguloRectangulo;

public class Principal2 {

	public static void main(String[] args) {
		
		double areaConValores, areaPorDefecto, perimetroConValores, perimetroPorDefecto;
		TrianguloRectangulo convalores= new TrianguloRectangulo(5,4);
		TrianguloRectangulo pordefecto= new TrianguloRectangulo();
		areaConValores= convalores.area();
		areaPorDefecto= pordefecto.area();
		perimetroConValores= convalores.perimetro();
		perimetroPorDefecto=pordefecto.perimetro();
		
	}

}
