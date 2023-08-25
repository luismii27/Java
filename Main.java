package vehiculos;

public class Main {

	public static void main(String[] args) {
		Coche c1 = new Coche();

		c1.setMatricula("125678JLL");
		c1.setMarca("Ford");
		c1.setModelo("Focus");
		c1.setPotencia(27);

		c1.mostrar();

		Moto m1 = new Moto();

		c1.setMatricula("78654FLL");
		c1.setMarca("Harley");
		c1.setModelo("Davidson");
		c1.setCilindrada("250cc");

		System.out.println();

		c1.mostrar();

	}

}
