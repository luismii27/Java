package vehiculos;

public class Coche extends Vehiculo {

	private int potencia;
	private String cilindrada;

	public void mostrar() {
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Potencia: " + potencia);

	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setCilindrada(String string) {
		this.cilindrada = cilindrada;

	}

	public Object getCilindrada() {
		return cilindrada;
	}

}
