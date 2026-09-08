package parcial1;

public class Mujer extends Persona {

	public Mujer(double peso, double altura, double edad) {
		super(peso, altura, edad);
	}

	@Override
	public boolean esPosibleCalcularTMB() {
		if (40 <= this.peso && this.peso <= 80 && 140 <= this.altura && this.altura <= 180 && this.edad > 15) {
			return true;
		}
		return false;
	}
	
	@Override
	public double calcularTMB() {
		if (esPosibleCalcularTMB()) {
			double tmb = 447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
			return tmb;
		}
		return -1;
	}

}
