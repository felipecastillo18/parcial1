package parcial1;

public class Main {

	public static void main(String[] args) {
		Hombre hombre1 = new Hombre(80, 170, 40);
		Mujer mujer1 = new Mujer(60, 160, 35);
		
		System.out.println("El hombre 1 pesa " + hombre1.getPeso() + " kg,  mide " + hombre1.getAltura() + " cm y tiene " + hombre1.getEdad() + " años." );
		System.out.println("La mujer 1 pesa " + mujer1.getPeso() + " kg,  mide " + mujer1.getAltura() + " cm y tiene " + mujer1.getEdad() + " años." );

		boolean esPosibleCalcularTMBHombre = hombre1.esPosibleCalcularTMB();
		boolean esPosibleCalcularTMBMujer = mujer1.esPosibleCalcularTMB();
		
		if (esPosibleCalcularTMBHombre) {
			double tmbHombre = hombre1.calcularTMB();
			System.out.println("El TMB del hombre 1 es: " + tmbHombre);
		}
		
		else {
			System.out.println("No se puede calcular el TMB del hombre 1");
		}
		
		if (esPosibleCalcularTMBMujer) {
			double tmbMujer = mujer1.calcularTMB();
			System.out.println("El TMB de la mujer 1 es: " + tmbMujer);
		}
		
		else {
			System.out.println("No se puede calcular el TMB de la mujer 1");
		}

		Hombre hombre2 = new Hombre(80, 170, 12);
		Mujer mujer2 = new Mujer(60, 120, 35);
		
		System.out.println("El hombre 2 pesa " + hombre2.getPeso() + " kg,  mide " + hombre2.getAltura() + " cm y tiene " + hombre2.getEdad() + " años." );
		System.out.println("La mujer 2 pesa " + mujer2.getPeso() + " kg,  mide " + mujer2.getAltura() + " cm y tiene " + mujer2.getEdad() + " años." );

		esPosibleCalcularTMBHombre = hombre2.esPosibleCalcularTMB();
		esPosibleCalcularTMBMujer = mujer2.esPosibleCalcularTMB();
		
		if (esPosibleCalcularTMBHombre) {
			double tmbHombre = hombre2.calcularTMB();
			System.out.println("El TMB del hombre 2 es: " + tmbHombre);
		}
		
		else {
			System.out.println("No se puede calcular el TMB del hombre 2");
		}
		
		if (esPosibleCalcularTMBMujer) {
			double tmbMujer = mujer2.calcularTMB();
			System.out.println("El TMB de la mujer 2 es: " + tmbMujer);
		}
		
		else {
			System.out.println("No se puede calcular el TMB de la mujer 2");
		}

	}

}
