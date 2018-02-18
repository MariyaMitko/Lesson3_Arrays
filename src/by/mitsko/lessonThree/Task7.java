package by.mitsko.lessonThree;

import java.util.Arrays;

public class Task7 { 

	public static void main(String[] args) {
		 double a [] = new double [5];
	     double b [] = new double [5];
    	//double c [] = new double [10];
		double d [] = new double[100];
		double sum = 0;
		double sqrt = 0;
       // int i;
       // int j;
        
		for (int i = 0; i<a.length; i++) {
		 a [i] = Math.random()*(-10);
		System.out.print(String.format("%.2f", a[i]) + " ");
		}
		System.out.println();
		for (int i = 0; i<b.length; i++) {
		b [i] = Math.random()*10;
		System.out.print(String.format("%.2f", b[i]) + " " );
		}
		System.out.println();
        for(int i = 0; i<10; i++) {
		// c  = arrayUtils.AddAll(a, b);
        	 double c [] = Arrays.copyOf(a, a.length+b.length);
        	 System.arraycopy(b, 0, c, 5, 5);
		System.out.print(String.format("%.2f", c[i]) + " ");
        
       
       
	/*	for ( i = 2; i<100; i=i+2) {
		if ( c[i] > 0) {
		 d[i] = c[i];
		}
	/*	Sysoyt
System.out.println(c[i]);
		for (int j = 0; j<d.length; j++) {
		sum = Math.pow(d[j], 2); }
		Sysout */

		}
        
	
	}
	}
	

