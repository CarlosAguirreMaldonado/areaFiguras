package Area;

import java.util.Arrays;

import Area.Area;


public class Main {

	 private static final int n = 5;
	  private static final int base = 2;
	  private static final int altura = 10;
	  private static final int dMayor = 15;
	  private static final int dMenor = 12;
	  private static final int radio =  4;

	  public static void main (String[] args) {
	    
		System.out.println ("Dado el cuadrado n=" + n + "\nArea=" + Area.aCuadrado(n));
	    System.out.println ("Dado el rectagulo b=" + base +" y h=" + altura + "\nArea=" + Area.aRectangulo(base, altura));
	    System.out.println ("Dado el triangulo b=" + base +" y h=" + altura + "\nArea=" + Area.aTriangulo(base, altura));
	    System.out.println ("Dado el rombo D=" + dMayor +" y d=" + dMenor + "\nArea=" + Area.aRombo(dMayor, dMenor));
	    System.out.println ("Dado la circunferencia radio=" + radio + "\nArea=" + Area.aCirculo(radio));
	   
	  }
	
}
