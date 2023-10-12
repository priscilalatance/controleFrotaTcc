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
import java.awt.Cursor;



public class telaLogin extends JFrame {
	private JTextField txtDigitarSenha;
	private JTextField txtDigitarEmail;
	private JLabel lblControleDeFrota;
	private JPanel contentPane;
	private JButton btnEsqueciSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaLogin frame = new telaLogin();
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
	public telaLogin() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Abraão Lemos LTDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-1, -24, 931, 599);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaInicial telaInicialMenu = new telaInicial();
				telaInicialMenu.setVisible(true);
			}
		});
		btnLogin.setBounds(406, 440, 91, 32);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBackground(Color.BLUE);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(btnLogin);
		
		txtDigitarSenha = new JTextField();
		txtDigitarSenha.setBounds(320, 361, 259, 26);
		txtDigitarSenha.setFont(new Font("Arial", Font.ITALIC, 14));
		txtDigitarSenha.setText("Digite sua senha");
		contentPane.add(txtDigitarSenha);
		txtDigitarSenha.setColumns(10);
		
		txtDigitarEmail = new JTextField();
		txtDigitarEmail.setBounds(320, 312, 259, 26);
		txtDigitarEmail.setFont(new Font("Arial", Font.ITALIC, 14));
		txtDigitarEmail.setText("Digite seu e-mail");
		txtDigitarEmail.setColumns(10);
		contentPane.add(txtDigitarEmail);
		
		JLabel lblEsqueciSenha = new JLabel("Esqueci minha senha");
		lblEsqueciSenha.setBounds(383, 416, 137, 14);
		lblEsqueciSenha.setForeground(Color.BLUE);
		lblEsqueciSenha.setFont(new Font("Arial", Font.ITALIC, 13));
		contentPane.add(lblEsqueciSenha);
		
		JPanel panel = new JPanel();
		panel.setBounds(-1, -2, 922, 91);
		panel.setBackground(new Color(141, 154, 205));
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblControleDeFrota = new JLabel("CONTROLE DE FROTA\r\n");
		lblControleDeFrota.setBounds(228, 26, 485, 43);
		lblControleDeFrota.setForeground(Color.BLACK);
		lblControleDeFrota.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblControleDeFrota);
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar Usuário");
		btnCadastrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			telaCadastroUsuario telaCadastro = new telaCadastroUsuario();
			telaCadastro.setVisible(true);
			}
		});
		btnCadastrarUsuario.setForeground(new Color(0, 0, 0));
		btnCadastrarUsuario.setBackground(new Color(255, 255, 255));
		btnCadastrarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrarUsuario.setBounds(383, 501, 143, 21);
		contentPane.add(btnCadastrarUsuario);
		
		btnEsqueciSenha = new JButton("");
		btnEsqueciSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaRedefinirSenhaConfirmacaoEmail redefinirSenhaEmail = new telaRedefinirSenhaConfirmacaoEmail();
				redefinirSenhaEmail.setVisible(true);
			}
		});
		btnEsqueciSenha.setBounds(377, 416, 143, 14);
		contentPane.add(btnEsqueciSenha);
	}
}
