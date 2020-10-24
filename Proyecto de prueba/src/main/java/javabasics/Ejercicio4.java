package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String nombre =JOptionPane.showInputDialog("Introduce Nombre: ");
		
		JOptionPane.showMessageDialog(null, "Bienvenida " + (nombre));
		
	}

}
