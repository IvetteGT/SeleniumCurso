package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String Radio =JOptionPane.showInputDialog("Introduce Radio del circulo: ");
		double Radio2 = Double.parseDouble(Radio);
				
		JOptionPane.showMessageDialog(null, "Area del Circulo " + (Math.PI*Radio2));
		
		double Area = (Math.PI*Radio2);
	
		System.out.println("");
		
		System.out.println("Area del círculo: " + Area);
		
	}

}