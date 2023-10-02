package controleDeFrota;

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



public class telaRedefinirSenha extends JFrame {

	private JPanel contentPane;
	private JTextField txtConfirmarSenha;
	private JTextField txtInsiraSenha;
	private JLabel lblControleDeFrota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaRedefinirSenha frame = new telaRedefinirSenha();
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
	public telaRedefinirSenha() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Abraão Lemos LTDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConfirmarSenha = new JButton("Confirmar nova senha");
		btnConfirmarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaInicial telaCadastro = new telaInicial();
				telaCadastro.setVisible(true);
			}
		});
		btnConfirmarSenha.setBackground(Color.DARK_GRAY);
		btnConfirmarSenha.setForeground(Color.WHITE);
		btnConfirmarSenha.setFont(new Font("Arial", Font.BOLD, 14));
		btnConfirmarSenha.setBounds(347, 456, 208, 32);
		contentPane.add(btnConfirmarSenha);
		
		txtConfirmarSenha = new JTextField();
		txtConfirmarSenha.setFont(new Font("Arial", Font.ITALIC, 14));
		txtConfirmarSenha.setText("Confirme sua senha");
		txtConfirmarSenha.setBounds(325, 380, 259, 26);
		contentPane.add(txtConfirmarSenha);
		txtConfirmarSenha.setColumns(10);
		
		txtInsiraSenha = new JTextField();
		txtInsiraSenha.setFont(new Font("Arial", Font.ITALIC, 14));
		txtInsiraSenha.setText("Insira a nova senha");
		txtInsiraSenha.setColumns(10);
		txtInsiraSenha.setBounds(325, 332, 259, 26);
		contentPane.add(txtInsiraSenha);
		
		JLabel lblRedefinirSenha = new JLabel("REDEFINIR SENHA");
		lblRedefinirSenha.setForeground(Color.BLACK);
		lblRedefinirSenha.setFont(new Font("Arial", Font.BOLD, 20));
		lblRedefinirSenha.setBounds(360, 120, 208, 26);
		contentPane.add(lblRedefinirSenha);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(141, 154, 205));
		panel.setBounds(-1, -2, 922, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblControleDeFrota = new JLabel("CONTROLE DE FROTA\r\n");
		lblControleDeFrota.setBounds(228, 26, 485, 43);
		lblControleDeFrota.setForeground(Color.BLACK);
		lblControleDeFrota.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblControleDeFrota);
	}
}
