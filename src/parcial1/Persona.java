package parcial1;

public abstract class Persona {
	
	protected double peso;
	protected double altura;
	protected double edad;
	
	public Persona(double peso, double altura, double edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}
	
	public abstract boolean esPosibleCalcularTMB();
	
	public abstract double calcularTMB();

}
