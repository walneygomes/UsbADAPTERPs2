
public class Adapter implements EntradaUSB {

	EntradaPs2 ps2 = new EntradaPs2();

	public void conectarEntradaUSB() {
		// TODO Auto-generated method stub

		ps2.conectarEntradaPS2();
	}

}
