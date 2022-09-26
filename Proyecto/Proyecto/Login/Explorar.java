package Login;

import java.awt.*;
import javax.swing.*;

public class Explorar extends JFrame {

	public Explorar() {
		a();
		setSize(900, 550);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("QKIE");
		Image icon3 = new ImageIcon("Proyecto/Imagenes/Icono.jpeg").getImage();
		setIconImage(icon3);
		this.setResizable(true);
		this.setVisible(true);
	}

	public void a() {
		JPanel fondo = new JPanel();
		BorderLayout forma = new BorderLayout();
		Color clr1 = new Color(255, 147, 4);
		Color clr2 = new Color(252, 129, 22);
		Color clr3 = new Color(44, 44, 47);
		Color clr4 = new Color(181, 182, 183);
		Color clr5 = new Color(35, 35, 37);
		Color clr6 = new Color(68, 68, 71);
		Font f1 = new Font("Negrita", Font.BOLD + Font.ITALIC, 16);
		Font f2 = new Font("Contenido", Font.PLAIN, 13);

		// Imagenes_Botones
		JButton lup = new JButton();
		lup.setSize(20, 20);
		lup.setBackground(clr6);
		ImageIcon im1 = new ImageIcon("Proyecto/Imagenes/lupa.png");
		ImageIcon lupa = new ImageIcon(
				im1.getImage().getScaledInstance(lup.getWidth(), lup.getHeight(), Image.SCALE_SMOOTH));
		lup.setIcon(lupa);

		JButton lup2 = new JButton();
		lup2.setSize(15, 15);
		lup2.setBackground(clr6);
		lup2.setBorder(null);
		ImageIcon imv2 = new ImageIcon("Proyecto/Imagenes/lupa.png");
		ImageIcon lupa2 = new ImageIcon(
				imv2.getImage().getScaledInstance(lup2.getWidth(), lup2.getHeight(), Image.SCALE_SMOOTH));
		lup2.setIcon(lupa2);

		JButton ini = new JButton();
		ini.setSize(20, 20);
		ini.setBackground(clr6);
		ImageIcon im2 = new ImageIcon("Proyecto/Imagenes/casa.png");
		ImageIcon casa = new ImageIcon(
				im2.getImage().getScaledInstance(ini.getWidth(), ini.getHeight(), Image.SCALE_SMOOTH));
		ini.setIcon(casa);
		JButton not = new JButton();
		not.setSize(20, 20);
		not.setBackground(clr6);
		ImageIcon im3 = new ImageIcon("Proyecto/Imagenes/camp.png");
		ImageIcon campana = new ImageIcon(
				im3.getImage().getScaledInstance(not.getWidth(), not.getHeight(), Image.SCALE_SMOOTH));
		not.setIcon(campana);
		JButton per = new JButton();
		per.setSize(20, 20);
		per.setBackground(clr6);
		ImageIcon im4 = new ImageIcon("Proyecto/Imagenes/perfil.png");
		ImageIcon perfil = new ImageIcon(
				im4.getImage().getScaledInstance(per.getWidth(), per.getHeight(), Image.SCALE_SMOOTH));
		per.setIcon(perfil);

		JLabel logoK = new JLabel();
		logoK.setSize(30, 30);
		ImageIcon logo = new ImageIcon("Proyecto/Imagenes/logo.jpeg");
		ImageIcon logoQ = new ImageIcon(
				logo.getImage().getScaledInstance(logoK.getWidth(), logoK.getHeight(), Image.SCALE_SMOOTH));
		logoK.setIcon(logoQ);

		JLabel lbltext = new JLabel("QKIE");
		lbltext.setFont(f1);
		lbltext.setForeground(Color.white);
		lbltext.setSize(25, 50);

		JPanel logotext = new JPanel();
		logotext.setBackground(null);
		logotext.setLayout(new FlowLayout(FlowLayout.LEFT));
		logotext.add(logoK);
		logotext.add(lbltext);

		JPanel mMain = new JPanel();
		mMain.setBackground(null);
		FlowLayout men = new FlowLayout(FlowLayout.CENTER);
		mMain.setLayout(men);
		mMain.add(ini);
		mMain.add(not);
		mMain.add(lup);
		mMain.add(per);

		JPanel sup = new JPanel();
		sup.setLayout(new BorderLayout());
		sup.setBackground(clr6);
		sup.add(logotext, BorderLayout.WEST);
		sup.add(mMain, BorderLayout.EAST);

		JPanel cent = new JPanel();
		cent.setBackground(clr5);
		cent.setLayout(new BorderLayout());

		JLabel esp4 = new JLabel(
				"                                                                                                             ");
		esp4.setBackground(null);
		esp4.setSize(100, 600);
		JLabel esp5 = new JLabel(
				"                                                                                                             ");
		esp5.setBackground(null);
		esp5.setSize(100, 200);
		JLabel esp6 = new JLabel("\n \n \n \n \n \n \n");
		esp6.setBackground(null);
		esp6.setSize(100, 200);
		JLabel esp7 = new JLabel("\n \n \n \n \n \n \n");
		esp7.setBackground(null);
		esp7.setSize(100, 200);

		JPanel inf = new JPanel();
		inf.setLayout(new BorderLayout());
		inf.setBackground(clr1);
		inf.setBounds(500, 200, 300, 400);
		ImageIcon i1 = new ImageIcon("Proyecto/Imagenes/imag1.jpg");
		ImageIcon ig1 = new ImageIcon(i1.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
		ImageIcon i5 = new ImageIcon("Proyecto/Imagenes/imag5.png");
		ImageIcon ig5 = new ImageIcon(i5.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH));

		JPanel infx = new JPanel();
		infx.setLayout(new BorderLayout());
		infx.setBackground(null);

		JPanel infx1 = new JPanel();
		infx1.setLayout(new FlowLayout());
		infx1.setBackground(null);
		JLabel ftP = new JLabel(ig5);
		JLabel lblcom = new JLabel("Compartit foto +");
		JLabel lblcom1 = new JLabel("Que es lo que piensas?");
		JTextField txtcom = new JTextField(10);
		txtcom.setSize(3, 10);
		JLabel lblcom2 = new JLabel("A tus liges les gustará ver las cosas que subes...");
		infx1.add(lblcom);
		infx1.add(lblcom1);
		infx1.add(txtcom);
		infx1.add(lblcom2);

		infx.add(infx1, BorderLayout.CENTER);

		inf.add(ftP, BorderLayout.WEST);
		inf.add(infx, BorderLayout.CENTER);

		JPanel ab = new JPanel();
		ab.setBounds(300, 700, 500, 500);
		ab.setBackground(clr5);
		ab.add(esp4);

		JPanel ac = new JPanel();
		ac.setBounds(300, 700, 400, 400);
		ac.setBackground(clr5);
		ac.add(esp5);

		JPanel ae = new JPanel();
		ae.setBounds(300, 700, 400, 400);
		ae.setBackground(clr5);
		ae.add(esp6);

		JPanel ad = new JPanel();
		ad.setBounds(300, 700, 400, 400);
		ad.setBackground(clr5);
		ad.add(esp7);

		cent.add(ae, BorderLayout.NORTH);
		cent.add(ac, BorderLayout.WEST);
		cent.add(inf, BorderLayout.CENTER);
		cent.add(ab, BorderLayout.EAST);
		cent.add(ad, BorderLayout.SOUTH);

		JPanel est = new JPanel();
		JScrollBar scb = new JScrollBar();

		JPanel ost = new JPanel();
		ost.setLayout(new BorderLayout());
		ost.setBackground(clr3);

		JPanel cont = new JPanel();
		cont.setBackground(null);
		cont.setLayout(new BorderLayout());
		JLabel esp1 = new JLabel("        ");
		esp1.setBackground(null);
		esp1.setSize(5, 70);
		JLabel esp2 = new JLabel("        ");
		esp2.setBackground(null);
		esp2.setSize(5, 70);
		JLabel esp3 = new JLabel("        ");
		esp3.setBackground(null);
		esp3.setSize(5, 70);
		JLabel lblCon = new JLabel("Ligues");
		lblCon.setFont(new Font("Title", Font.BOLD, 15));
		lblCon.setSize(50, 100);
		lblCon.setForeground(Color.white);
		JTextField buscar = new JTextField("Buscar en ligues...");
		buscar.setOpaque(true);
		buscar.setBackground(clr4);
		JPanel search = new JPanel();
		search.setLayout(new BorderLayout());
		search.add(buscar, BorderLayout.WEST);
		search.add(lup2, BorderLayout.EAST);

		cont.add(lblCon, BorderLayout.WEST);
		cont.add(esp1, BorderLayout.CENTER);
		cont.add(search, BorderLayout.EAST);

		JPanel lista = new JPanel();
		lista.setBackground(null);
		lista.setLayout(new BoxLayout(lista, BoxLayout.Y_AXIS));
		JButton cont1 = new JButton(" Eduardo", perfil);
		cont1.setFont(f2);
		cont1.setBackground(null);
		cont1.setBorder(null);
		cont1.setForeground(Color.white);
		JButton cont2 = new JButton(" Juan", perfil);
		cont2.setFont(f2);
		cont2.setBackground(null);
		cont2.setBorder(null);
		cont2.setForeground(Color.white);
		JButton cont3 = new JButton(" Paloma", perfil);
		cont3.setFont(f2);
		cont3.setBackground(null);
		cont3.setBorder(null);
		cont3.setForeground(Color.white);
		JButton cont4 = new JButton(" Juana", perfil);
		cont4.setFont(f2);
		cont4.setBackground(null);
		cont4.setBorder(null);
		cont4.setForeground(Color.white);
		JButton cont5 = new JButton(" Bartolomeo", perfil);
		cont5.setFont(f2);
		cont5.setBackground(null);
		cont5.setBorder(null);
		cont5.setForeground(Color.white);
		JLabel lin = new JLabel("                      ");
		lin.setSize(1, 1000);
		lin.setOpaque(true);
		lin.setBackground(clr4);

		lista.add(esp2);
		lista.add(cont1);
		lista.add(cont2);
		lista.add(cont3);
		lista.add(cont4);
		lista.add(cont5);
		lista.add(lin);

		JPanel sur = new JPanel();
		sur.setBackground(null);
		sur.setLayout(new BorderLayout());

		JPanel linea = new JPanel();
		linea.setBackground(null);
		GridLayout prs = new GridLayout(5, 2);
		linea.setLayout(prs);
		JLabel lbllig = new JLabel("En Linea.....");
		lin.setBackground(clr4);
		lbllig.setForeground(Color.white);
		JButton lin1 = new JButton(" Anna", perfil);
		lin1.setFont(f2);
		lin1.setBackground(null);
		lin1.setBorder(null);
		lin1.setForeground(Color.white);
		JButton lin2 = new JButton(" Marisa", perfil);
		lin2.setFont(f2);
		lin2.setBackground(null);
		lin2.setBorder(null);
		lin2.setForeground(Color.white);
		JButton lin3 = new JButton(" Juana", perfil);
		lin3.setFont(f2);
		lin3.setBackground(null);
		lin3.setBorder(null);
		lin3.setForeground(Color.white);
		JButton lin4 = new JButton(" Loto", perfil);
		lin4.setFont(f2);
		lin4.setBackground(null);
		lin4.setBorder(null);
		lin4.setForeground(Color.white);
		JButton lin5 = new JButton(" Luz", perfil);
		lin5.setFont(f2);
		lin5.setBackground(null);
		lin5.setBorder(null);
		lin5.setForeground(Color.white);
		JLabel linb = new JLabel("                                             ");
		linb.setSize(1, 1000);
		linb.setOpaque(true);
		linb.setBackground(clr4);
		ImageIcon i3 = new ImageIcon("Proyecto/Imagenes/imag3.png");
		ImageIcon ig3 = new ImageIcon(i3.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH));
		JLabel gre = new JLabel(ig3);
		JLabel gre1 = new JLabel(ig3);
		JLabel gre2 = new JLabel(ig3);
		JLabel gre3 = new JLabel(ig3);
		JLabel gre4 = new JLabel(ig3);

		linea.add(lin1);
		linea.add(gre);
		linea.add(lin2);
		linea.add(gre1);
		linea.add(lin3);
		linea.add(gre2);
		linea.add(lin4);
		linea.add(gre3);
		linea.add(lin5);
		linea.add(gre4);
		this.add(linea);

		sur.add(lbllig, BorderLayout.NORTH);
		sur.add(linea, BorderLayout.CENTER);
		sur.add(linb, BorderLayout.SOUTH);

		JPanel pub = new JPanel();
		pub.setBackground(clr1);
		pub.setLayout(new BoxLayout(pub, BoxLayout.Y_AXIS));
		JLabel pb = new JLabel("Ultimas Tendencias");
		pb.setFont(f2);
		pb.setForeground(Color.white);
		JLabel pbimg = new JLabel(ig1);
		ImageIcon i2 = new ImageIcon("Proyecto/Imagenes/imag2.png");
		ImageIcon ig2 = new ImageIcon(i2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
		JLabel pbimg1 = new JLabel(ig2);
		ImageIcon i4 = new ImageIcon("Proyecto/Imagenes/imag4.jpg");
		ImageIcon ig4 = new ImageIcon(i4.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
		JLabel pbimg2 = new JLabel(ig4);

		pub.add(pb);
		pub.add(pbimg);
		pub.add(pbimg1);
		pub.add(pbimg2);

		JPanel mid2 = new JPanel();
		mid2.setBackground(null);
		mid2.setLayout(new BorderLayout());
		mid2.add(pub, BorderLayout.NORTH);

		JPanel mid = new JPanel();
		mid.setBackground(null);
		mid.setLayout(new BorderLayout());
		mid.add(lista, BorderLayout.NORTH);
		mid.add(sur, BorderLayout.CENTER);

		JPanel midA = new JPanel();
		midA.setBackground(null);
		midA.setLayout(new BorderLayout());
		midA.add(mid, BorderLayout.NORTH);
		midA.add(mid2, BorderLayout.CENTER);

		JPanel nth = new JPanel();
		nth.setBackground(clr3);
		nth.add(esp3);

		ost.add(nth, BorderLayout.EAST);
		ost.add(cont, BorderLayout.NORTH);
		ost.add(midA, BorderLayout.CENTER);

		fondo.setLayout(forma);

		fondo.add(sup, BorderLayout.NORTH);
		fondo.add(cent, BorderLayout.CENTER);
		fondo.add(ost, BorderLayout.WEST);
		fondo.add(est, BorderLayout.EAST);

		this.add(fondo);

	}

}
