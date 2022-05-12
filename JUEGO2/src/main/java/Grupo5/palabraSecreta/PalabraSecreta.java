package Grupo5.palabraSecreta;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class PalabraSecreta extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
    //imagenes ahorcado
	private int contadorimagenes = 10;
	private int contador = 11;
	private int contador_2 = 0;
	//contador de fallos;
	private int fallos = 1;

	private JButton btnNext;
	private JLabel LabelPSecreta = new JLabel("");
    //label de las imagenes 
	private JLabel NewLabel0, NewLabel1, NewLabel2, NewLabel3, NewLabel4, NewLabel5, NewLabel6, NewLabel7, NewLabel8,
			NewLabel9, NewLabel10;
	//array donde ponemos las imagenes
	ArrayList<JLabel> arrayName = new ArrayList<JLabel>();


	// arrayList para agrupar los botones
	private ArrayList<JButton> botonesTeclado = new ArrayList<JButton>();

	// private ArrayList<JLabel> letras_panel = new ArrayList<JLabel>();
	private ArrayList<Character> letras_panel = new ArrayList<Character>();

	private ArrayList<Character> letras_palabra = new ArrayList<Character>();

	// Array de numeros aleatorios no repetidos
	Stack<Integer> sinRepetir = new Stack<Integer>();

	private JLabel LabelContador;
	private JLabel lblNewLabel_6;
	JLabel labelimage = new JLabel("");

	public PalabraSecreta() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);

		JButton Button_inicio = new JButton("Iniciar juego");
		Button_inicio.setBounds(50, 50, 200, 50);
		contentPane.add(Button_inicio);
		// al pulsar el botón de inicio, habilitamos los botones
		Button_inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// true para habilitar los botones
				reiniciarimagenes();
				habilitarODeshabilitar(true);
				inicializarArray();
			}

		});
        //boton resolver palabra
		JButton Button_Resolver = new JButton("Resolver");
		Button_Resolver.setBounds(50, 100, 200, 50);
		contentPane.add(Button_Resolver);
		Button_Resolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelPSecreta.setText(String.valueOf(letras_palabra));
				if (!letras_palabra.contains('_')) {
					btnNext.setVisible(true);
				}

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
        
		//array imagenes con tamaño contadorimagenes
		arrayName = new ArrayList<JLabel>(contadorimagenes);

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
		
		arrayName.clear();

		//añadimos las imagenes
		NewLabel0 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/0.png")));
		NewLabel1 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/1.png")));
		NewLabel2 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/2.png")));
		NewLabel3 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/3.png")));
		NewLabel4 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/4.png")));
		NewLabel5 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/5.png")));
		NewLabel6 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/6.png")));
		NewLabel7 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/7.png")));
		NewLabel8 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/8.png")));
		NewLabel9 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/9.png")));
		NewLabel10 = new JLabel(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/10.png")));

		//les damos forma dentro el panel
		NewLabel0.setBounds(304, 11, 362, 546);
		NewLabel1.setBounds(304, 11, 362, 546);
		NewLabel2.setBounds(304, 11, 362, 546);
		NewLabel3.setBounds(304, 11, 362, 546);
		NewLabel4.setBounds(304, 11, 362, 546);
		NewLabel5.setBounds(304, 11, 362, 546);
		NewLabel6.setBounds(304, 11, 362, 546);
		NewLabel7.setBounds(304, 11, 362, 546);
		NewLabel8.setBounds(304, 11, 362, 546);
		NewLabel9.setBounds(304, 11, 362, 546);
		NewLabel10.setBounds(304, 11, 362, 546);

		contentPane.add(NewLabel0);
		NewLabel0.setVisible(true);
		contentPane.add(NewLabel1);
		contentPane.add(NewLabel2);
		contentPane.add(NewLabel3);
		contentPane.add(NewLabel4);
		contentPane.add(NewLabel5);
		contentPane.add(NewLabel6);
		contentPane.add(NewLabel7);
		contentPane.add(NewLabel8);
		contentPane.add(NewLabel9);
		contentPane.add(NewLabel10);

		arrayName.add(0, NewLabel0);
		arrayName.add(1, NewLabel1);
		arrayName.add(2, NewLabel2);
		arrayName.add(3, NewLabel3);
		arrayName.add(4, NewLabel4);
		arrayName.add(5, NewLabel5);
		arrayName.add(6, NewLabel6);
		arrayName.add(7, NewLabel7);
		arrayName.add(8, NewLabel8);
		arrayName.add(9, NewLabel9);
		arrayName.add(10, NewLabel10);

		


		//inciamos boton y le ponemos la imagen de la bombilla
		final JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(10, 198, 36, 35);
		btnNewButton_2.setIcon(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setVisible(false);
				LabelPSecreta.setText(String.valueOf(letras_palabra));
				if (!letras_palabra.contains('_')) {
					btnNext.setVisible(true);
				}
			}
		});

		final JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBounds(53, 198, 36, 35);
		btnNewButton_2_1.setIcon(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_1);
		
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2_1.setVisible(false);
				LabelPSecreta.setText(String.valueOf(letras_palabra));
				if (!letras_palabra.contains('_')) {
					btnNext.setVisible(true);
				}
			}
		});

		final JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setBounds(99, 198, 36, 35);
		btnNewButton_2_2.setIcon(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_2);
		
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2_2.setVisible(false);
				LabelPSecreta.setText(String.valueOf(letras_palabra));
				if (!letras_palabra.contains('_')) {
					btnNext.setVisible(true);
				}
			}
		});

		final JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.setBounds(145, 198, 36, 35);
		btnNewButton_2_3.setIcon(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_3);
		
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2_3.setVisible(false);
				LabelPSecreta.setText(String.valueOf(letras_palabra));
				if (!letras_palabra.contains('_')) {
					btnNext.setVisible(true);
				}
			}
		});

		final JButton btnNewButton_2_4 = new JButton("");
		btnNewButton_2_4.setBounds(191, 198, 36, 35);
		btnNewButton_2_4.setIcon(new ImageIcon(PalabraSecreta.class.getResource("/Grupo5/img/Untitled.png")));
		contentPane.add(btnNewButton_2_4);
		
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2_4.setVisible(false);
				LabelPSecreta.setText(String.valueOf(letras_palabra));
				if (!letras_palabra.contains('_')) {
					btnNext.setVisible(true);
				}
			}
		});

		LabelContador = new JLabel("");
		LabelContador.setBounds(191, 264, 22, 14);
		contentPane.add(LabelContador);

		lblNewLabel_6 = new JLabel("Palabras");
		lblNewLabel_6.setBounds(216, 264, 52, 14);
		contentPane.add(lblNewLabel_6);
        
		//empieza la siguiente palabra
		btnNext = new JButton("Sig. Palabra");
		btnNext.setVisible(false);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fallos = 1;
				
				reiniciarimagenes();
				btnNext.setVisible(false);
				habilitarODeshabilitar(true);
			//	agregarListenersBotones();
				contador_2++;
				añadir(palabrasSecretas());
				inicializarArray();
				contador();
				
					
				

			}
		});
		btnNext.setBounds(134, 515, 149, 23);
		contentPane.add(btnNext);

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
					insertarImagen(botonesTeclado.get(indxBtn));
				}
			});
		
		}
	}
// verificamos si la la letra del boton apretado es igual a alguna letra de la palabaa secreta
	public boolean verificar(JButton a) {
		

		for (int n = 0; n < letras_palabra.size(); n++) {

			if (a.getText().toLowerCase().equals(letras_palabra.get(n).toString())) {

				return  true;
			}
		}
		return false;
	}

	public String palabrasSecretas() {
         //array de palabras secretas (el juego consta de 10 palabras hasta que finaliza)
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

		if (contador == 11) {

			int pos;
			int nNumeros = 10;

			for (int i = 0; i < nNumeros; i++) {
				pos = (int) Math.floor(Math.random() * nNumeros);
				while (sinRepetir.contains(pos)) {
					pos = (int) Math.floor(Math.random() * nNumeros);
				}
				sinRepetir.push(pos);
			}
			System.out.println(sinRepetir.toString());
		}

		return palabras.get(sinRepetir.get(contador_2));

	}
    //añadimos si encuentra la letra al slot vacio de la palabra secreta
	public void añadir(String pAñadir) {

		letras_palabra.clear();

		for (int i = 0; i < pAñadir.length(); i++) {

			letras_palabra.add(i, pAñadir.charAt(i));

			System.out.print(letras_palabra.get(i));
		}
		System.out.println("\n");
	}
    //ponermos barra baja  y setamos valores
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
				// System.out.println("QUE ES GETNAME " + indexBtn.getName());
				letras_panel.set(i, indexBtn.getName().charAt(0));
			}
			// System.out.println("LETRAS PANEL" + letras_panel);
		}

		LabelPSecreta.setText(String.valueOf(letras_panel));

		if (!letras_panel.contains('_')) {
			btnNext.setVisible(true);
		}
	}

	//metodo qe inserta imagen cuando hay fallo
	public void insertarImagen(JButton indexBtn) {

//TODO:resetear var fallo cuando llege a 10 adivine la palabra
		if (!verificar(indexBtn)) {
			labelimage = arrayName.get(fallos);
			labelimage.setBounds(304, 11, 362, 546);
			contentPane.add(labelimage);
		
			if(fallos > 0) {
				arrayName.get(fallos-1).setVisible(false);
				System.out.println(fallos);
			}
			arrayName.get(fallos).setVisible(true);	
       	fallos++;
		}
		if (fallos == arrayName.size()) {
			JOptionPane.showMessageDialog(null, "HAS PERDIDO! XD");
			btnNext.setVisible(true);
			fallos=0;
			
		}
	
	}

	//metodo qe reincia imagenes cuando se han enctroado o no la palabra secreta
	public void reiniciarimagenes() {
		for (int i = 0; i < arrayName.size(); i++) {
			if (i == 0) {
				arrayName.get(i).setVisible(true);
			}
			arrayName.get(i).setVisible(false);
		}
	}
	
}
