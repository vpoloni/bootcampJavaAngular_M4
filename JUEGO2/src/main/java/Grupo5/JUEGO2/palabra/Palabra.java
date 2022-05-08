package Grupo5.JUEGO2.palabra;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class Palabra extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JLabel LabelPSecreta = new JLabel("");


	// arrayList para agrupar los botones
	private ArrayList<JButton> botonesTeclado = new ArrayList<JButton>();

	// arrayList de guiones
	private ArrayList<Character> letras_panel = new ArrayList<Character>();

	// arrayList de carácteres de palabra pasada por random
	private ArrayList<Character> letras_palabra = new ArrayList<Character>();

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
		palabras.add("Ovovivíparo");

		int numRandom = (int) (Math.random() * 10);

		return palabras.get(numRandom);
	}

	// el método que añade caracteres de palabra secreta (random) a arrayList de la palabra secreta
	public void añadir(String pSecreta) {

		for (int i = 0; i < pSecreta.length(); i++) {

			letras_palabra.add(i, pSecreta.charAt(i));

			System.out.print(letras_palabra.get(i));
		}
	}

	public void inicializarArray() {

		for (int i = 0; i < letras_palabra.size(); i++) {
			letras_panel.add('_');
		}

		LabelPSecreta.setBounds(20, 289, 245, 14);
		contentPane.add(LabelPSecreta);
		
		LabelPSecreta.setText(String.valueOf(letras_panel));

	}

	
	public void insertarLetras(JButton indexBtn) {
		
		for (int i = 0; i < letras_palabra.size(); i++) {

			if (letras_palabra.get(i) == indexBtn.getName().charAt(0)) {
				System.out.println("QUE ES GETNAME " + indexBtn.getName());
				letras_panel.set(i,indexBtn.getName().charAt(0));
			}
			System.out.println(letras_panel);
		}
		
		/*System.out.println(indexBtn);

		if (indexBtn == 0) {
			insertarLetras1('a');
		}

		if (indexBtn == 1) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'b') {
					letras_panel.set(i, 'b');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 2) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'c') {
					letras_panel.set(i, 'c');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 3) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'd') {
					letras_panel.set(i, 'd');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 4) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'e') {
					letras_panel.set(i, 'e');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 5) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'g') {
					letras_panel.set(i, 'g');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 6) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'h') {
					letras_panel.set(i, 'h');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 7) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'i') {
					letras_panel.set(i, 'i');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 8) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'j') {
					letras_panel.set(i, 'j');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 9) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'f') {
					letras_panel.set(i, 'f');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 10) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'k') {
					letras_panel.set(i, 'k');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 11) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'l') {
					letras_panel.set(i, 'l');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 12) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'm') {
					letras_panel.set(i, 'm');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 13) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'n') {
					letras_panel.set(i, 'n');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 14) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'ñ') {
					letras_panel.set(i, 'ñ');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 15) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'o') {
					letras_panel.set(i, 'o');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 16) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'p') {
					letras_panel.set(i, 'p');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 17) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'q') {
					letras_panel.set(i, 'q');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 18) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'r') {
					letras_panel.set(i, 'r');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 19) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 's') {
					letras_panel.set(i, 's');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 20) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 't') {
					letras_panel.set(i, 't');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 21) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'u') {
					letras_panel.set(i, 'u');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 22) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'v') {
					letras_panel.set(i, 'v');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 23) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'w') {
					letras_panel.set(i, 'w');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 24) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'x') {
					letras_panel.set(i, 'x');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 25) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'y') {
					letras_panel.set(i, 'y');
				}
			}
			System.out.println(letras_panel);
		}

		if (indexBtn == 26) {

			for (int i = 0; i < letras_palabra.size(); i++) {

				if (letras_palabra.get(i) == 'z') {
					letras_panel.set(i, 'z');
				}
			}
			System.out.println(letras_panel);
		}
*/
		LabelPSecreta.setText(String.valueOf(letras_panel));

	}

}
