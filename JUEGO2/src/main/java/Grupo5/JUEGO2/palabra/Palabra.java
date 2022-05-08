package Grupo5.JUEGO2.palabra;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class Palabra extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private int contador = 11;
	private int contador_2 = 0;
	private JButton btnNext;
	private JLabel LabelPSecreta = new JLabel("");

	// arrayList para agrupar los botones
	private ArrayList<JButton> botonesTeclado = new ArrayList<JButton>();

	// private ArrayList<JLabel> letras_panel = new ArrayList<JLabel>();
	private ArrayList<Character> letras_panel = new ArrayList<Character>();

	private ArrayList<Character> letras_palabra = new ArrayList<Character>();

	// Array de numeros aleatorios no repetidos
	Stack<Integer> sinRepetir = new Stack<Integer>();

	private JLabel LabelContador;
	private JLabel lblNewLabel_6;

	public Palabra() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JButton Button_inicio = new JButton("Iniciar juego");
		Button_inicio.setBounds(50, 50, 200, 50);
		contentPane.add(Button_inicio);

		JButton Button_Resolver = new JButton("Resolver");
		Button_Resolver.setBounds(50, 100, 200, 50);
		contentPane.add(Button_Resolver);
		Button_Resolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		JLabel Label_teclado = new JLabel("Teclado");
		Label_teclado.setBounds(0, 0, 0, 0);
		contentPane.add(Label_teclado);

		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel_1);

		// creamos los botones
		int x = 10;
		int y = 347;
		int contadorSaltos = 0;

		String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

		for (int i = 0; i < letras.length(); i++) {
			JButton buton = new JButton(String.valueOf(letras.charAt(i)));
			botonesTeclado.add(buton);
			botonesTeclado.get(i).setName(String.valueOf(letras.charAt(i)).toLowerCase());
			botonesTeclado.get(i).setBounds(x, y, 50, 30);
			contentPane.add(botonesTeclado.get(i));

			if (contadorSaltos == 4) {
				y += 32;
				x = 10;
				contadorSaltos = 0;
			} else {
				x += 55;
				contadorSaltos++;
			}

		}

		JLabel lblNewLabel_2 = new JLabel("Teclado");
		lblNewLabel_2.setBounds(10, 322, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Menu");
		lblNewLabel_3.setBounds(10, 25, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Palabra secreta");
		lblNewLabel_4.setBounds(10, 264, 96, 14);
		contentPane.add(lblNewLabel_4);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(10, 198, 36, 35);
		btnNewButton_2.setIcon(new ImageIcon(Palabra.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBounds(53, 198, 36, 35);
		btnNewButton_2_1.setIcon(new ImageIcon(Palabra.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setBounds(99, 198, 36, 35);
		btnNewButton_2_2.setIcon(new ImageIcon(Palabra.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_2);

		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.setBounds(145, 198, 36, 35);
		btnNewButton_2_3.setIcon(new ImageIcon(Palabra.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_3);

		JButton btnNewButton_2_4 = new JButton("");
		btnNewButton_2_4.setBounds(191, 198, 36, 35);
		btnNewButton_2_4.setIcon(new ImageIcon(Palabra.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_4);

		LabelContador = new JLabel("");
		LabelContador.setBounds(191, 264, 22, 14);
		contentPane.add(LabelContador);

		lblNewLabel_6 = new JLabel("Palabras");
		lblNewLabel_6.setBounds(216, 264, 52, 14);
		contentPane.add(lblNewLabel_6);

		btnNext = new JButton("Sig. Palabra");
		btnNext.setVisible(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNext.setVisible(false);
				System.out.println("siguiente palabra clicked! despues de setVisible");
				habilitarODeshabilitar(true);
				System.out.println("siguiente palabra clicked! despues de habilitarODeshabilitar");
				agregarListenersBotones();
				System.out.println("siguiente palabra clicked! despues de agregarListenersBotones");
				contador_2++;
				añadir(palabrasSecretas());
				System.out.println("siguiente palabra clicked! despues de añadir");
				inicializarArray();
				System.out.println("siguiente palabra clicked! despues de inicializarArray");
				contador();
				System.out.println("siguiente palabra clicked! despues de contador");

			}
		});
		btnNext.setBounds(116, 515, 149, 23);
		contentPane.add(btnNext);

		// al pulsar el botón de inicio, habilitamos los botones
		Button_inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// true para habilitar los botones
				habilitarODeshabilitar(true);
				inicializarArray();
			}

		});

	}

	// deshabilitamos o habilitamos los botones según la opción pasada como
	// parámetro
	public void habilitarODeshabilitar(boolean opcion) {
		for (int i = 0; i < botonesTeclado.size(); i++) {
			botonesTeclado.get(i).setEnabled(opcion);

		}
	}

	// función que agrega a cada boton del array botonesTeclado el addActionListener
	// que deshabilita el boton clickado
	public void agregarListenersBotones() {

		for (int i = 0; i < botonesTeclado.size(); i++) {

			final int indxBtn = i;

			botonesTeclado.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					botonesTeclado.get(indxBtn).setEnabled(false);

					insertarLetras(botonesTeclado.get(indxBtn));

				}
			});
		}
	}

	public boolean verificar(JButton a) {
		boolean igual = false;

		for (int n = 0; n < letras_palabra.size(); n++) {

			if (a.getText().equals(letras_palabra.get(n).toString())) {

				igual = true;
			}
		}
		return igual;
	}

	public String palabrasSecretas() {

		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("murcielago");
		palabras.add("television");
		palabras.add("computadora");
		palabras.add("electricista");
		palabras.add("emprendedor");
		palabras.add("empresario");
		palabras.add("artificiero");
		palabras.add("combustibles");
		palabras.add("ecualizador");
		palabras.add("espectador");

		if(contador==11) {
			
		    int pos;
		    int nNumeros = 10;
		    
		    for (int i = 0; i < nNumeros ; i++) {
		      pos = (int) Math.floor(Math.random() * nNumeros );
		      while (sinRepetir.contains(pos)) {
		    	  System.out.println("No sale de este while " + i);
		    	  System.out.println("Valor pos " + pos);
		    	  System.out.println("sinRepetir " + sinRepetir);
		        pos = (int) Math.floor(Math.random() * nNumeros );
		      }
		      sinRepetir.push(pos);
		    }
		    System.out.println(sinRepetir.toString());
		}
		
		return palabras.get(sinRepetir.get(contador_2));

	}

	public void añadir(String pAñadir) {

		letras_palabra.clear();

		for (int i = 0; i < pAñadir.length(); i++) {

			letras_palabra.add(i, pAñadir.charAt(i));

			System.out.print(letras_palabra.get(i));
		}
	}

	public void inicializarArray() {

		letras_panel.clear();

		for (int i = 0; i < letras_palabra.size(); i++) {
			letras_panel.add('_');
		}

		LabelPSecreta.setBounds(20, 289, 245, 14);
		contentPane.add(LabelPSecreta);

		LabelPSecreta.setText(String.valueOf(letras_panel));

	}

	public void contador() {

		contador--;
		LabelContador.setText(String.valueOf(contador));

	}

	public void insertarLetras(JButton indexBtn) {

		for (int i = 0; i < letras_palabra.size(); i++) {

			if (letras_palabra.get(i) == indexBtn.getName().charAt(0)) {
				System.out.println("QUE ES GETNAME " + indexBtn.getName());
				letras_panel.set(i, indexBtn.getName().charAt(0));
			}
			System.out.println("LETRAS PANEL" + letras_panel);
		}

		LabelPSecreta.setText(String.valueOf(letras_panel));

		if (!letras_panel.contains('_')) {
			btnNext.setVisible(true);
		}
	}
}
