package parcial1;

public class Hombre extends Persona {

	public Hombre(double peso, double altura, double edad) {
		super(peso, altura, edad);
	}
	
	@Override
	public boolean esPosibleCalcularTMB() {
		if (60 <= this.peso && this.peso <= 110 && 160 <= this.altura && this.altura <= 195 && this.edad > 15) {
			return true;
		}
		return false;
	}
	
	@Override
	public double calcularTMB() {
		if (esPosibleCalcularTMB()) {
			double tmb = 88.362 + (13.397 * this.peso) + (4.799 * this.altura) - (5.677 * this.edad);
			return tmb;
		}
		return -1;
	}

}
