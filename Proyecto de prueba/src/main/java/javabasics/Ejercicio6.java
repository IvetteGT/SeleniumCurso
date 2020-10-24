package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
		 Si no lo es, también debemos indicarlo.*/
		JOptionPane.showMessageDialog(null, "Vamos a ver si el número que ingresaras es divisible entre 2");
		int number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
		int resto = (number%2);
		if(resto==0) {
			JOptionPane.showMessageDialog(null, "El número " + number+" ES divisible");
		}else {
			JOptionPane.showMessageDialog(null, "El número " + number+ " NO es divisible");
		}

	}

}