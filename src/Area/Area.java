package Area;

public class Area {
	
	static double pi = 3.14159265;
	
	 public static int aCuadrado (int n) {
	        return (n*n);
	  }

	  public static int aRectangulo  (int base, int altura) {
	        return (base*altura);
	  }

	  public static float aTriangulo (int  base, int altura) {
	        return ((base*altura)/2);
	  }
	  
	  public static float aRombo (int  dMayor, int dMenor) {
	        return ((dMayor*dMenor)/2);
	  }

	  public static double aCirculo (int radio) {
		 
	        return (float)(pi*radio*radio);
	  }

}
