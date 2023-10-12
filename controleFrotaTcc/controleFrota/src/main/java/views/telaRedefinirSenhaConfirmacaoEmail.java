package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;



public class telaRedefinirSenhaConfirmacaoEmail extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnviarEmail;
	private JLabel lblControleDeFrota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaRedefinirSenhaConfirmacaoEmail frame = new telaRedefinirSenhaConfirmacaoEmail();
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
	public telaRedefinirSenhaConfirmacaoEmail() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Abraão Lemos LTDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnRedefinirSenha = new JButton("Enviar e-mail de confirmação");
		btnRedefinirSenha.setBounds(349, 389, 238, 32);
		btnRedefinirSenha.setBackground(Color.DARK_GRAY);
		btnRedefinirSenha.setForeground(new Color(255, 255, 255));
		btnRedefinirSenha.setFont(new Font("Arial", Font.BOLD, 14));
		
		txtEnviarEmail = new JTextField();
		txtEnviarEmail.setBounds(336, 328, 259, 26);
		txtEnviarEmail.setForeground(Color.BLACK);
		txtEnviarEmail.setFont(new Font("Arial", Font.ITALIC, 14));
		txtEnviarEmail.setText("Digite seu e-mail");
		txtEnviarEmail.setColumns(10);
		
		JLabel lblTituloEsqueciSenha = new JLabel("REDEFINIR SENHA");
		lblTituloEsqueciSenha.setBounds(367, 127, 218, 32);
		lblTituloEsqueciSenha.setForeground(Color.BLACK);
		lblTituloEsqueciSenha.setFont(new Font("Arial", Font.BOLD, 20));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 917, 91);
		panel.setBackground(new Color(141, 154, 205));
		panel.setLayout(null);
		
		lblControleDeFrota = new JLabel("CONTROLE DE FROTA\r\n");
		lblControleDeFrota.setBounds(228, 26, 485, 43);
		lblControleDeFrota.setForeground(Color.BLACK);
		lblControleDeFrota.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblControleDeFrota);
		contentPane.setLayout(null);
		contentPane.add(btnRedefinirSenha);
		contentPane.add(txtEnviarEmail);
		contentPane.add(lblTituloEsqueciSenha);
		contentPane.add(panel);
	}
}
