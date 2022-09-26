package Login;

import java.awt.*;
import javax.swing.*;
import java.awt.font.*;
import java.awt.color.*;

public class Test extends JFrame {
	public Test() {

		setSize(900, 550);
		setTitle("Modificar Orenji");

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

		Image imagen4 = new ImageIcon("Proyecto/Imagenes/si.png").getImage();
		ImageIcon logo = new ImageIcon(imagen4.getScaledInstance(30, 30, Image.SCALE_SMOOTH));

		JLabel Icono = new JLabel();
		Icono.setIcon(logo);
		Icono.setBounds(550, 200, 450, 550);
		Icono.setForeground(new Color(0, 186, 255));
		add(Icono);

		Image imagen5 = new ImageIcon("Proyecto/Imagenes/no.png").getImage();
		ImageIcon no = new ImageIcon(imagen5.getScaledInstance(30, 30, Image.SCALE_SMOOTH));

		JLabel no1 = new JLabel();
		no1.setIcon(no);
		no1.setBounds(340, 200, 450, 550);
		no1.setForeground(new Color(0, 186, 255));
		add(no1);

		JLabel titulo = new JLabel("ORENJI (Editar)");
		Font aux = titulo.getFont();
		titulo.setBounds(375, -80, 150, 250);
		titulo.setBackground(Color.white);
		titulo.setFont(new Font(aux.getFontName(), aux.getStyle(), 20));
		titulo.setForeground(Color.white);

		add(titulo);

		JLabel nombre = new JLabel("1.-¿Cual es tu genero?");
		nombre.setBounds(220, 40, 600, 120);
		nombre.setForeground(new Color(255, 255, 255));
		add(nombre);

		JPanel pr = new JPanel();
		JRadioButton bh = new JRadioButton("Hombre");
		JRadioButton bm = new JRadioButton("Mujer");

		BoxLayout br = new BoxLayout(pr, BoxLayout.Y_AXIS);
		pr.setLayout(br);
		pr.add(bh);
		pr.add(bm);

		ButtonGroup gb = new ButtonGroup();
		gb.add(bh);
		gb.add(bm);
		pr.setBounds(220, 110, 300, 50);
		pr.setBackground(new Color(69, 67, 67));
		bh.setBackground(new Color(127, 127, 127));
		bm.setBackground(new Color(127, 127, 127));
		add(pr);

		JLabel edad = new JLabel("2.-¿Te gusta la musica?");
		edad.setBounds(220, 160, 300, 17);
		edad.setForeground(new Color(255, 255, 255));
		add(edad);

		JPanel preguntas = new JPanel();
		JRadioButton p1 = new JRadioButton("SI");
		JRadioButton p2 = new JRadioButton("NO");

		BoxLayout pe = new BoxLayout(preguntas, BoxLayout.Y_AXIS);
		preguntas.setLayout(pe);
		preguntas.add(p1);
		preguntas.add(p2);

		ButtonGroup com = new ButtonGroup();
		com.add(p1);
		com.add(p2);
		preguntas.setBounds(220, 180, 300, 50);
		preguntas.setBackground(new Color(69, 67, 67));
		p1.setBackground(new Color(127, 127, 127));
		p2.setBackground(new Color(127, 127, 127));
		add(preguntas);

		JLabel seguidores = new JLabel("3.-¿Te gusta el cine?");
		seguidores.setBounds(220, 180, 600, 120);
		seguidores.setForeground(new Color(255, 255, 255));
		add(seguidores);

		JPanel preguntas1 = new JPanel();
		JRadioButton pe1 = new JRadioButton("SI");
		JRadioButton pe2 = new JRadioButton("NO");

		BoxLayout pre = new BoxLayout(preguntas1, BoxLayout.Y_AXIS);
		preguntas1.setLayout(pre);
		preguntas1.add(pe1);
		preguntas1.add(pe2);

		ButtonGroup compa = new ButtonGroup();
		compa.add(pe1);
		compa.add(pe2);
		preguntas1.setBounds(220, 250, 300, 50);
		preguntas1.setBackground(new Color(69, 67, 67));
		pe1.setBackground(new Color(127, 127, 127));
		pe2.setBackground(new Color(127, 127, 127));
		add(preguntas1);

		JLabel intereses = new JLabel("4.-¿Te gusta cantar?");
		intereses.setBounds(220, 250, 600, 120);
		intereses.setForeground(new Color(255, 255, 255));
		add(intereses);

		JPanel preguntas2 = new JPanel();
		JRadioButton per1 = new JRadioButton("SI");
		JRadioButton per2 = new JRadioButton("NO");

		BoxLayout preg = new BoxLayout(preguntas2, BoxLayout.Y_AXIS);
		preguntas2.setLayout(preg);
		preguntas2.add(per1);
		preguntas2.add(per2);

		ButtonGroup compane = new ButtonGroup();
		compa.add(per1);
		compane.add(per2);
		preguntas2.setBounds(220, 320, 300, 50);
		preguntas2.setBackground(new Color(69, 67, 67));
		per1.setBackground(new Color(127, 127, 127));
		per2.setBackground(new Color(127, 127, 127));
		add(preguntas2);

		JLabel correo = new JLabel("5.-¿Te gusta la comida Mexicana?");
		correo.setBounds(220, 320, 600, 120);
		correo.setForeground(new Color(255, 255, 255));
		add(correo);

		JPanel preguntas3 = new JPanel();
		JRadioButton pero1 = new JRadioButton("SI");
		JRadioButton pero2 = new JRadioButton("NO");

		BoxLayout pregu = new BoxLayout(preguntas3, BoxLayout.Y_AXIS);
		preguntas3.setLayout(pregu);
		preguntas3.add(pero1);
		preguntas3.add(pero2);

		ButtonGroup companero = new ButtonGroup();
		companero.add(pero1);
		companero.add(pero2);
		preguntas3.setBounds(220, 390, 300, 50);
		preguntas3.setBackground(new Color(69, 67, 67));
		pero1.setBackground(new Color(127, 127, 127));
		pero2.setBackground(new Color(127, 127, 127));
		add(preguntas3);

		JButton contraseña = new JButton("ACEPTAR");
		contraseña.setBounds(590, 466, 100, 20);
		contraseña.setForeground(Color.black);
		contraseña.setBackground(new Color(69, 163, 29));
		add(contraseña);

		JButton cerrar = new JButton("CANCELAR");
		cerrar.setBounds(380, 466, 100, 20);
		cerrar.setForeground(Color.black);
		cerrar.setBackground(new Color(181, 30, 30));
		add(cerrar);

		this.getContentPane().add(PanelBase);

	}

}