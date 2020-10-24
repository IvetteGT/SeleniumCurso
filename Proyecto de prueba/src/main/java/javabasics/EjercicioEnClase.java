package javabasics;

import javax.swing.JOptionPane;

public class EjercicioEnClase {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio Suma, Resta, Multiplicación, División y Modulo");
		
		String numero1 =JOptionPane.showInputDialog("Introduce primer Numero");
		int dato_numUno = Integer.parseInt(numero1);
		
		String numero2 =JOptionPane.showInputDialog("Introduce segundo Numero");
		int dato_numDos = Integer.parseInt(numero2);
		
		JOptionPane.showMessageDialog(null, "Resultado Suma " + (dato_numUno + dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Resta " + (dato_numUno - dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Multiplicacion " + (dato_numUno * dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado División " + (dato_numUno / dato_numDos));
		JOptionPane.showMessageDialog(null, "Resultado Modulo " + (dato_numUno % dato_numDos));
		
	}

}
