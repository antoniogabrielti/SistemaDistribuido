package Atividade1;
/*Fa�a um programa composto por duas threads: a primeira deve exibir em ordem crescente os n�meros
de 1 a 500; a segunda deve exibir em ordem decrescente os n�meros entre 500 e 1. As threads devem
ser executadas concorrentemente
*/
public class main {

	public static void main(String[] args) {
		Thread1 primeira = new Thread1();
		Thread2 segunda = new Thread2();
		
		primeira.run();
		segunda.run();

	}

}
