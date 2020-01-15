/*Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma 
 * circunferência e do volume de uma esfera para um raio daquele valor. Informar também o valor de PI 
 * com duas casas decimais.
*/
package util;

public class Calculator {
	
	public static final double PI = 3.14159;/* São membros que fazem sentido independentemente de objetos.
	 Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.
*/

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
