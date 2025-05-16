package clases;

public class TrianguloRectangulo {

	private int a, b;
	private double c;

	/**
	 * Es un constructor por defecto diciendo que el cateto a es igual a 1 y el
	 * cateto b igual.
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}

	/**
	 * Constructor que pide valores al crearlo Lo que realiza es que si es igual o
	 * inferior a 0 lanze una excepcion, si no lo es, que adjunte los valores
	 * 
	 */
	public TrianguloRectangulo(int a, int b) {

		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Los catetos no pueden tener un valor inferior a 0");
		} else {
			this.a = a;
			this.b = b;
		}
	}

	/**
	 * Se encarga de multiplicar el cateto a por el b, entre 2
	 * 
	 * @return devuelve el resultado de la operacion
	 */
	public double area() {
		double res = (a * b) / 2;
		return res;
	}

	/**
	 * Se encarga de realizar la operacion de la hipotenusa
	 * 
	 * @return devuelve el resultado de la operación
	 */
	public double hipotenusa() {

		c = (int) Math.sqrt(a * a + b * b);
		return c;
	}
/**
 * Se encarga de calcular el valor del perimetro
 * @return devuelve el resultado
 */
	public double perimetro() {
		double total = a + b + hipotenusa();
		return total;
	}
	
/**
 * 
 * Accede para ver el atributo privado A (Cateto A)
 */
	public int getA() {
		return a;
	}
	
	/**
	 * 
	 * Accede para modificar el atributo privado a (Cateto a)
	 */
	public void setA(int a) {
		this.a = a;
	}
	
	/**
	 * 
	 * Accede para ver el atributo privado b (Cateto b)
	 */
	public int getB() {
		return b;
	}

	/**
	 * 
	 * Accede para modificar el atributo privado b (Cateto b)
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * 
	 * Accede para ver el atributo privado c (hipotenusa c)
	 */
	public double getC() {
		return c;
	}

	/**
	 * 
	 * Accede para modificar el atributo privado c (hipotenusa c)
	 */
	public void setC(double c) {
		this.c = c;
	}
/**
 * Muestra el resultado de todas las operaciones del cateto A, cateto b y hipotenusa
 */
	@Override
	public String toString() {
		String res= "Cateto A: "+a+"\n"
				+ "Cateto B: "+ b+"\n"
				+"Hipotenusa C: "+c;
		return res;
	}
	
	
}
