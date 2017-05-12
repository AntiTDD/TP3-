package Complejidad;

public class Polinomio {

private int grado ;

private double [ ] coeficientes;

/**
 * La pos 0 del arreglo contiene el coeficiente de grado n. La pos n
 * contiene al termino independiente.
 */

public Polinomio(double [] coef) throws Exception {
	this.grado = coef.length-1;
	if(this.grado < 1){
		throw new Exception("El polinomio debe tener minimo un coeficiente");
	}
	this.coeficientes = coef.clone();
	
}

double evaluarMSucesivas (double x ) {
	double resultado=0;
	for(int i = 0; i < this.coeficientes.length;i++) {
		double terminoi=1;
		for(int j = 0; j < grado - i;j++) {
			terminoi *= x;
		}
		resultado += ( terminoi * this.coeficientes[i] );
	}	
	return resultado;
}

double evaluarRecursiva (double x ) {
	double resultado = 0;
	for(int i = 0; i < this.coeficientes.length; i++) {
		resultado += this.coeficientes[i] * ValorCoef.recursiva(x,this.grado-i);
	}
	return resultado;
}

double evaluarRecursivaPar (double x ) {
	double resultado = 0;
	for(int i = 0; i < this.coeficientes.length; i++) {
		resultado += this.coeficientes[i] * ValorCoef.recursivaParImpar(x,this.grado-i);
	}
	return resultado;
}

//double evaluarProgDinamica (double x ) {}

//double evaluarMejorada (double x ) {}

//double evaluarPow (double x ) {}

// y a sugerencia de Lucas P

//double evaluarHorner ( double x ) {}

}
