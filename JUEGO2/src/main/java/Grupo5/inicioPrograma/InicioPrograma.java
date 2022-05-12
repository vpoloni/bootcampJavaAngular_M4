package Grupo5.inicioPrograma;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Grupo5.palabraSecreta.PalabraSecreta;

public class InicioPrograma extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	//panel inicio
	private JPanel contentPane;
	//panel de boton ayuda
	private JPanel contentPaneAyuda;
	//panel de dificultad
	private JPanel contentPaneDificultad;
	//panel de acerca de o sobre el juego
	private JPanel contentAcercaDe;
	private JLabel Newlabel1;
	private JLabel Newlabel2;
	private JLabel Newlabel3;
	public ImageIcon imgThisImg;

	final JButton boton1;
	final JButton boton2;
	final JButton boton3;
	final JButton boton4;
	final JButton boton5;
	final JButton boton6;
	
	//Botones con niveles de dificultad
	final JButton principiante;
	final JButton intermedio;
	final JButton experto;

	public InicioPrograma() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 500, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setVisible(true);

		boton1 = new JButton("Iniciar Juego");
		boton1.setBounds(300, 100, 150, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Como se juega?");
		boton2.setBounds(300, 150, 150, 30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("Acerca de");
		boton3.setBounds(300, 200, 150, 30);
		add(boton3);
		boton3.addActionListener(this);

		contentPaneDificultad = new JPanel();
		Border border = BorderFactory.createTitledBorder("Niveles de dificultad");
		contentPaneDificultad.setBorder(border);

		principiante = new JButton("PRINCIPIANTE");

		contentPaneDificultad.add(principiante, BorderLayout.SOUTH);
		principiante.addActionListener(this);

		intermedio = new JButton("INTERMEDIO");
		contentPaneDificultad.add(intermedio, BorderLayout.SOUTH);
		intermedio.addActionListener(this);

		experto = new JButton("EXPERTO");
		contentPaneDificultad.add(experto, BorderLayout.SOUTH);
		experto.addActionListener(this);

		boton4 = new JButton("Atrás");
		boton5 = new JButton("Atrás");
		boton6 = new JButton("Atrás");
		boton4.setBounds(100, 200, 150, 30);
		contentPaneDificultad.add(boton5);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		boton6.addActionListener(this);

		contentPaneAyuda = new JPanel();
		Newlabel1 = new JLabel();
		Border border1 = BorderFactory.createTitledBorder("AYUDA");
		contentPaneAyuda.setBorder(border1);
		contentPaneAyuda.add(boton4);
		
        //imagen de instrucciones
		imgThisImg = new ImageIcon("C:\\Users\\newga\\Desktop\\Instrucciones.PNG");
		Newlabel1.setIcon(imgThisImg);
		contentPaneAyuda.add(Newlabel1);

		contentAcercaDe = new JPanel();

		//borde del titulo del panel
		Border border2 = BorderFactory.createTitledBorder("ACERCA DE");
		contentAcercaDe.setBorder(border2);
		Newlabel3 = new JLabel("Data: 05/05/2022");
		Newlabel2 = new JLabel("Creado por: Marc, Veronika, Isidre");

		contentAcercaDe.add(Newlabel2);
		contentAcercaDe.add(Newlabel3);
		contentAcercaDe.add(boton6);
	}

	//aqui suceden todos los eventos de botones
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {

			setContentPane(contentPaneDificultad);
			setVisible(true);
		}
		if (e.getSource() == boton2) {
			setContentPane(contentPaneAyuda);
			setVisible(true);
		}
		if (e.getSource() == boton3) {
			setContentPane(contentAcercaDe);
			setVisible(true);

		} //escogemos dificultad 
		if (e.getSource() == boton4 || e.getSource() == boton5 || e.getSource() == boton6) {
			setContentPane(contentPane);
			setVisible(true);
		}

		if (e.getSource() == principiante) {
			//iniciamos clase palabra secreta es nivel principiante
			 PalabraSecreta palabra = new PalabraSecreta();
			palabra.habilitarODeshabilitar(false);
			palabra.agregarListenersBotones();
			palabra.añadir(palabra.palabrasSecretas());
			palabra.contador();
			setVisible(false);

		}
		if (e.getSource() == intermedio) {
			new PalabraSecreta();
			setVisible(false);
		}

		if (e.getSource() == experto) {
			new PalabraSecreta();
			setVisible(false);

		}

	}
}
