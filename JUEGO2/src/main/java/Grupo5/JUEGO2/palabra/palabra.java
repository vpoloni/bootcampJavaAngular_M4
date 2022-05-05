package Grupo5.JUEGO2.palabra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class palabra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					palabra frame = new palabra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public palabra() {
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
		
		
		JButton A = new JButton("A");
		A.setBounds(10, 347, 43, 23);
		contentPane.add(A);
		
		JButton B = new JButton("B");
		B.setBounds(63, 347, 43, 23);
		contentPane.add(B);
		
		JButton C = new JButton("C");
		C.setBounds(116, 347, 43, 23);
		contentPane.add(C);
		
		JButton D = new JButton("D");
		D.setBounds(169, 347, 43, 23);
		contentPane.add(D);
		
		JButton E = new JButton("E");
		E.setBounds(222, 347, 43, 23);
		contentPane.add(E);
		
		JButton G = new JButton("G");
		G.setBounds(63, 379, 43, 23);
		contentPane.add(G);
		
		JButton H = new JButton("H");
		H.setBounds(116, 379, 43, 23);
		contentPane.add(H);
		
		JButton I = new JButton("I");
		I.setBounds(169, 379, 43, 23);
		contentPane.add(I);
		
		JButton J = new JButton("J");
		J.setBounds(222, 381, 43, 23);
		contentPane.add(J);
		
		JButton F = new JButton("F");
		F.setBounds(10, 379, 43, 23);
		contentPane.add(F);
		
		JButton K = new JButton("K");
		K.setBounds(10, 413, 43, 23);
		contentPane.add(K);
		
		JButton L = new JButton("L");
		L.setBounds(63, 413, 43, 23);
		contentPane.add(L);
		
		JButton M = new JButton("M");
		M.setFont(new Font("Tahoma", Font.PLAIN, 10));
		M.setBounds(116, 413, 43, 23);
		contentPane.add(M);
		
		JButton N = new JButton("N");
		N.setBounds(169, 413, 43, 23);
		contentPane.add(N);
		
		JButton Ñ = new JButton("Ñ");
		Ñ.setBounds(222, 415, 43, 23);
		contentPane.add(Ñ);
		
		JButton O = new JButton("O");
		O.setBounds(10, 447, 43, 23);
		contentPane.add(O);
		
		JButton P = new JButton("P");
		P.setBounds(63, 447, 43, 23);
		contentPane.add(P);
		
		JButton Q = new JButton("Q");
		Q.setBounds(116, 447, 43, 23);
		contentPane.add(Q);
		
		JButton R = new JButton("R");
		R.setBounds(169, 447, 43, 23);
		contentPane.add(R);
		
		JButton S = new JButton("S");
		S.setBounds(222, 447, 43, 23);
		contentPane.add(S);
		
		JButton T = new JButton("T");
		T.setBounds(10, 481, 43, 23);
		contentPane.add(T);
		
		JButton U = new JButton("U");
		U.setBounds(63, 481, 43, 23);
		contentPane.add(U);
		
		JButton V = new JButton("V");
		V.setBounds(116, 481, 43, 23);
		contentPane.add(V);
		
		JButton W = new JButton("W");
		W.setFont(new Font("Tahoma", Font.PLAIN, 9));
		W.setBounds(169, 481, 43, 23);
		contentPane.add(W);
		
		JButton X = new JButton("X");
		X.setBounds(222, 481, 43, 23);
		contentPane.add(X);
		
		JButton Y = new JButton("Y");
		Y.setBounds(10, 515, 43, 23);
		contentPane.add(Y);
		
		JButton Z = new JButton("Z");
		Z.setBounds(63, 515, 43, 23);
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
		


	}
}
