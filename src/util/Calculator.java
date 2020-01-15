/*Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quanto seria o valor de uma 
 * circunfer�ncia e do volume de uma esfera para um raio daquele valor. Informar tamb�m o valor de PI 
 * com duas casas decimais.
*/
package util;

public class Calculator {
	
	public static final double PI = 3.14159;/* S�o membros que fazem sentido independentemente de objetos.
	 N�o precisam de objeto para serem chamados. S�o chamados a partir do pr�prio nome da classe.
*/

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
