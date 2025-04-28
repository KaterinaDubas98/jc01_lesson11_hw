package com.edu.home.main;

import com.edu.home.complex.ComplexNumber;

public class Main {

	public static void main(String[] args) {
		ComplexNumber z1 = new ComplexNumber();
		ComplexNumber z2 = new ComplexNumber();

		ComplexNumber z3;

		z1.realPart = 4;
		z1.imaginaryPart = 5;

		z2.realPart = 7;
		z2.imaginaryPart = 12;

		z3 = add(z1, z2);

		System.out.println("z1 = " + z1.realPart + "+" + z1.imaginaryPart + "i");
		System.out.println("z2 = " + z2.realPart + "+" + z2.imaginaryPart + "i");
		System.out.println("z3 = " + z3.realPart + "+" + z3.imaginaryPart + "i");

	}

	public static ComplexNumber add(ComplexNumber comp1, ComplexNumber comp2) {
		int realP, imageP;

		realP = comp1.realPart + comp2.realPart;
		imageP = comp1.imaginaryPart + comp2.imaginaryPart;

		ComplexNumber c = new ComplexNumber();
		c.realPart = realP;
		c.imaginaryPart = imageP;

		return c;
	}

}
