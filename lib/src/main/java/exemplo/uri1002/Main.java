/**
 * 
 */
package exemplo.uri1002;

import java.util.Scanner;

/**
 * @author Gabriel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada;
		double raio;
		Circulo c1;
		double area;
		
		entrada = new Scanner(System.in);
		raio = entrada.nextDouble();
		entrada.close();
		
		c1 = new Circulo(raio);
		area = c1.getArea();
		
		System.out.printf("A = %.4f\n", area);
		
	}

}
