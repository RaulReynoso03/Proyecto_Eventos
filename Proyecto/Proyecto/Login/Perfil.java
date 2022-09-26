package Login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Perfil extends JFrame {

	public Perfil() {

		setSize(900, 550);
		setTitle("Perfil");

		setLocationRelativeTo(null);
		setResizable(false);
		Image icon3 = new ImageIcon("Proyecto/Imagenes/icono.jpeg").getImage();
		setIconImage(icon3);

		panel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

	}

	public void panel() {

		JLayeredPane PanelBase = new JLayeredPane();

		// Panel Principal
		PanelBase.setLayout(null);
		PanelBase.setBackground(new Color(255, 84, 24));
		PanelBase.setBounds(0, 0, 900, 600);
		PanelBase.setOpaque(true);

		JPanel panelTop = new JPanel();
		panelTop.setSize(new Dimension(500, 490));
		panelTop.setLocation(200, 10);
		panelTop.setBackground(new Color(27, 26, 26));
		PanelBase.add(panelTop, new Integer(2));

		JLabel titulo = new JLabel("PERFIL");
		titulo.setBounds(430, 30, 200, 30);
		titulo.setBackground(Color.white);
		titulo.setForeground(Color.white);
		add(titulo);

		Image imagen15 = new ImageIcon("Proyecto/Imagenes/flecha.png").getImage();
		ImageIcon logotip = new ImageIcon(imagen15.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		JLabel Iconos = new JLabel();
		Iconos.setIcon(logotip);
		Iconos.setBounds(245, -9, 400, 100);
		Iconos.setForeground(new Color(0, 186, 255));
		add(Iconos);
		JButton ultimo1 = new JButton("Regresar");
		ultimo1.setBounds(210, 70, 110, 20);
		ultimo1.setForeground(Color.black);
		ultimo1.setBackground(Color.orange);
		add(ultimo1);

		Image imagen4 = new ImageIcon("Proyecto/Imagenes/perfiln (2).png").getImage();
		ImageIcon logo = new ImageIcon(imagen4.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		JLabel Icono = new JLabel();
		Icono.setIcon(logo);
		Icono.setBounds(400, 70, 400, 100);
		Icono.setForeground(new Color(0, 186, 255));
		add(Icono);

		Image imagen21 = new ImageIcon("Proyecto/Imagenes/icono.jpeg").getImage();
		ImageIcon logotipo = new ImageIcon(imagen21.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		JLabel Icono9 = new JLabel();
		Icono9.setIcon(logotipo);
		Icono9.setBounds(615, -9, 400, 100);
		Icono9.setForeground(new Color(0, 186, 255));
		add(Icono9);

		JButton ultimo = new JButton("Editar Orenji");
		ultimo.setBounds(580, 70, 110, 20);
		ultimo.setForeground(Color.black);
		ultimo.setBackground(Color.orange);
		add(ultimo);

		JLabel nombre = new JLabel("Nombre:");
		JLabel nom = new JLabel("Juan Hernandez Martinez");
		nombre.setBounds(360, 135, 600, 120);
		nom.setBounds(410, 135, 600, 120);
		nombre.setForeground(new Color(255, 255, 255));
		nom.setForeground(Color.white);
		add(nom);
		add(nombre);

		JLabel edad = new JLabel("Edad:");
		JLabel ed = new JLabel("25 años");
		edad.setBounds(410, 160, 600, 120);
		ed.setBounds(445, 160, 600, 120);
		edad.setForeground(new Color(255, 255, 255));
		ed.setForeground(Color.WHITE);
		add(edad);
		add(ed);

		JLabel seguidores = new JLabel("Seguidores:");
		JLabel segui = new JLabel("5");
		seguidores.setBounds(410, 185, 600, 120);
		segui.setBounds(480, 185, 600, 120);
		seguidores.setForeground(new Color(255, 255, 255));
		segui.setForeground(Color.WHITE);
		add(seguidores);
		add(segui);

		JLabel intereses = new JLabel("Intereses:");
		JLabel inte = new JLabel("Video juegos, Cantar, bailar y Futbol");
		intereses.setBounds(330, 210, 600, 120);
		inte.setBounds(390, 210, 600, 120);
		intereses.setForeground(new Color(255, 255, 255));
		inte.setForeground(Color.WHITE);
		add(intereses);
		add(inte);

		JLabel correo = new JLabel("Correo Electronico:");
		JLabel co = new JLabel("************@gmail.com");
		correo.setBounds(340, 235, 600, 120);
		co.setBounds(453, 235, 600, 120);
		correo.setForeground(new Color(255, 255, 255));
		co.setForeground(Color.WHITE);
		add(correo);
		add(co);

		Image imagen2 = new ImageIcon("Proyecto/Imagenes/ajuste1.png").getImage();
		ImageIcon ico2 = new ImageIcon(imagen2.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		JLabel cancelar = new JLabel();
		cancelar.setIcon(ico2);
		cancelar.setBounds(320, 300, 400, 100);
		add(cancelar);
		JButton boton1 = new JButton("AJUSTES");
		boton1.setBounds(295, 380, 100, 15);
		boton1.setForeground(Color.black);
		boton1.setBackground(Color.orange);
		add(boton1);

		Image imagen3 = new ImageIcon("Proyecto/Imagenes/editar.png").getImage();
		ImageIcon ico3 = new ImageIcon(imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		JLabel editar = new JLabel();
		editar.setIcon(ico3);
		editar.setBounds(430, 350, 400, 100);
		add(editar);
		JButton boton2 = new JButton(" EDITAR");
		boton2.setBounds(400, 435, 100, 15);
		boton2.setForeground(Color.black);
		boton2.setBackground(Color.orange);
		add(boton2);

		Image imagen6 = new ImageIcon("Proyecto/Imagenes/seguridad.png").getImage();
		ImageIcon ico6 = new ImageIcon(imagen6.getScaledInstance(55, 55, Image.SCALE_SMOOTH));
		JLabel seguridad = new JLabel();
		seguridad.setIcon(ico6);
		seguridad.setBounds(540, 305, 400, 100);
		add(seguridad);
		JButton boton3 = new JButton("SEGURIDAD");
		boton3.setBounds(518, 390, 100, 15);
		boton3.setForeground(Color.black);
		boton3.setBackground(Color.orange);
		add(boton3);

		this.getContentPane().add(PanelBase);

	}

}