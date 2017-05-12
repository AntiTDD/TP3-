package Complejidad;

public class ValorCoef {

	public static double recursiva(double x, double n) {
		if(n == 0)
			return 1;	
		if(n == 1)
			return x;
		return x*=recursiva(x,n-1);	
	}


	public static double recursivaParImpar(double x, double n) {
		if (n == 0) {
			return 1;
		} else if (n % 2 == 1) { 
			return x * recursivaParImpar(x, n - 1);
		} else {
			return recursivaParImpar(x*x, n / 2); 
		}
	}

}
