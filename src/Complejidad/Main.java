package Complejidad;
public class Main {
	public static void main(String[] args) throws Exception {

		double respuesta;
		double respuesta2;
		double[] coef = {3, 2, 2, 3};
		Polinomio pol= new Polinomio(coef);
		respuesta=pol.evaluarMSucesivas(2);
		respuesta2=pol.evaluarRecursiva(2);
		System.out.println(respuesta);

	}
}
