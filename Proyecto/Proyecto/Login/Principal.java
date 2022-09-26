package Login;

public class Principal {

	private static Registro ventana2;
	private static Perfil ventana3;

	public static void main(String[] args) {

		Login ventana1 = new Login();
		ventana1.setVisible(true);

		ventana2 = new Registro();

		ventana3 = new Perfil();
		ventana3.setVisible(true);

		Test ventana4 = new Test();
		ventana4.setVisible(true);

		Explorar ventana5 = new Explorar();
		ventana5.setVisible(true);
	}

}
