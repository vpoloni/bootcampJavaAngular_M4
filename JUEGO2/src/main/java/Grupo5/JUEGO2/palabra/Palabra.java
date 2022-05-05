package Grupo5.JUEGO2.palabra;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Palabra extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	
	private JButton A, B, C, D, E, G, H, I, J, F, K, L, M, N, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z;
	 
	//variable que controla el número de intentos que tiene el usuario 
	private int numeroIntentos = 10;
	
	// arrayList para agrupar los botones
	private ArrayList<JButton> botonesTeclado = new ArrayList<JButton>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palabra frame = new Palabra();
					frame.setVisible(true);
					// al entrar, desabilitamos los botones
					frame.habilitarODeshabilitar(false);
					
					frame.agregarListenersBotones();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Palabra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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

		textField = new JTextField();
		textField.setBounds(0, 0, 0, 0);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 0, 0);
		contentPane.add(lblNewLabel_1);

		A = new JButton("A");
		A.setBounds(10, 347, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(A);
		contentPane.add(A);

		B = new JButton("B");
		B.setBounds(63, 347, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(B);
		contentPane.add(B);

		C = new JButton("C");
		C.setBounds(116, 347, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(C);
		contentPane.add(C);

		D = new JButton("D");
		D.setBounds(169, 347, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(D);
		contentPane.add(D);

		E = new JButton("E");
		E.setBounds(222, 347, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(E);
		contentPane.add(E);

		G = new JButton("G");
		G.setBounds(63, 379, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(G);
		contentPane.add(G);

		H = new JButton("H");
		H.setBounds(116, 379, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(H);
		contentPane.add(H);

		I = new JButton("I");
		I.setBounds(169, 379, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(I);
		contentPane.add(I);

		J = new JButton("J");
		J.setBounds(222, 381, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(J);
		contentPane.add(J);

		F = new JButton("F");
		F.setBounds(10, 379, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(F);
		contentPane.add(F);

		K = new JButton("K");	
		K.setBounds(10, 413, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(K);
		contentPane.add(K);

		L = new JButton("L");
		L.setBounds(63, 413, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(L);
		contentPane.add(L);

		M = new JButton("M");
		M.setFont(new Font("Tahoma", Font.PLAIN, 10));
		// añadimos el botón al arraylist
		botonesTeclado.add(M);
		M.setBounds(116, 413, 43, 23);
		contentPane.add(M);

		N = new JButton("N");
		N.setBounds(169, 413, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(N);
		contentPane.add(N);

		Ñ = new JButton("Ñ");
		Ñ.setBounds(222, 415, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(Ñ);
		contentPane.add(Ñ);

		O = new JButton("O");
		O.setBounds(10, 447, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(O);
		contentPane.add(O);

		P = new JButton("P");
		P.setBounds(63, 447, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(P);
		contentPane.add(P);

		Q = new JButton("Q");
		Q.setBounds(116, 447, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(Q);
		contentPane.add(Q);

		R = new JButton("R");
		R.setBounds(169, 447, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(R);
		contentPane.add(R);

		S = new JButton("S");
		S.setBounds(222, 447, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(S);
		contentPane.add(S);

		T = new JButton("T");
		T.setBounds(10, 481, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(T);
		contentPane.add(T);

		U = new JButton("U");
		U.setBounds(63, 481, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(U);
		contentPane.add(U);

		V = new JButton("V");
		V.setBounds(116, 481, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(V);
		contentPane.add(V);

		W = new JButton("W");
		W.setFont(new Font("Tahoma", Font.PLAIN, 9));
		// añadimos el botón al arraylist
		botonesTeclado.add(W);
		W.setBounds(169, 481, 43, 23);
		contentPane.add(W);

		X = new JButton("X");
		X.setBounds(222, 481, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(X);
		contentPane.add(X);

		Y = new JButton("Y");
		Y.setBounds(10, 515, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(Y);
		contentPane.add(Y);

		Z = new JButton("Z");
		Z.setBounds(63, 515, 43, 23);
		// añadimos el botón al arraylist
		botonesTeclado.add(Z);
		contentPane.add(Z);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 289, 255, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

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
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\iplan\\Desktop\\Untitled.png"));
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBounds(53, 198, 36, 35);
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\iplan\\Desktop\\Untitled.png"));
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setBounds(99, 198, 36, 35);
		btnNewButton_2_2.setIcon(new ImageIcon("C:\\Users\\iplan\\Desktop\\Untitled.png"));
		contentPane.add(btnNewButton_2_2);

		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.setBounds(145, 198, 36, 35);
		btnNewButton_2_3.setIcon(new ImageIcon("C:\\Users\\iplan\\Desktop\\Untitled.png"));
		contentPane.add(btnNewButton_2_3);

		JButton btnNewButton_2_4 = new JButton("");
		btnNewButton_2_4.setBounds(191, 198, 36, 35);
		btnNewButton_2_4.setIcon(new ImageIcon("C:\\Users\\iplan\\Desktop\\Untitled.png"));
		contentPane.add(btnNewButton_2_4);

		// al pulsar el botón de inicio, habilitamos los botones
		Button_inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// true para habilitar los botones 
				habilitarODeshabilitar(true);
			}

		});
		
	}
	
	// deshabilitamos o habilitamos los botones según la opción pasada como parámetro
	public void habilitarODeshabilitar(boolean opcion) {
			for (int i = 0; i < botonesTeclado.size(); i++) {
				botonesTeclado.get(i).setEnabled(opcion);
				
			}
	}
	
	// función que agrega a cada boton del array botonesTeclado el addActionListener que deshabilita el boton clickado
	public void agregarListenersBotones() {
		
		for (int i = 0; i < botonesTeclado.size(); i++) {
			
			final int indxBtn = i;
			
			botonesTeclado.get(i).addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					botonesTeclado.get(indxBtn).setEnabled(false);
					
					// ** PENDIENTE FUNCIÓN que comprueba:
						// si se ha acertado mostrar letras en el panel 
						// si se ha fallado añadir imagen ahorcado 
					
					//logica();
					
				}
			});
		}
	}
// TODO:
//	public void logica() {
//		if (siHaAcertado()) {
//			abrirLetrasPalabraSecreta();
//		} else {
//			siQuedanIntentosRestantes();
//			añadirSiguienteImagenAhorcado();
//		}
//	}
//	
//	public void siQuedanIntentosRestantes() {
//		if (numeroIntentos == 0) {
//			System.out.println("No tienes mas intentos. Vuelve a jugar.");
//			System.out.println("Reiniciamos el programa, funcion reiniciarJuego() ");
//		} else {
//			numeroIntentos--;
//		}
//	}

}
