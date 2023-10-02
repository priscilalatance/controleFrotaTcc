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
import javax.swing.border.LineBorder;



public class telaInicial extends JFrame {

	private JPanel contentPane;
	private JLabel lblControleDeFrota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	public telaInicial() {
		setBackground(new Color(240, 240, 240));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Abraão Lemos LTDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaLogin Login = new telaLogin();
				Login.setVisible(true);
			}
		});
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 14));
		btnVoltar.setBounds(26, 503, 127, 32);
		contentPane.add(btnVoltar);
		
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
		
		JButton btnGerenciarVeculo = new JButton("GERENCIAR VEÍCULO");
		btnGerenciarVeculo.setForeground(Color.WHITE);
		btnGerenciarVeculo.setFont(new Font("Arial", Font.BOLD, 14));
		btnGerenciarVeculo.setBackground(Color.DARK_GRAY);
		btnGerenciarVeculo.setBounds(61, 374, 193, 63);
		contentPane.add(btnGerenciarVeculo);
		
		JButton btnControleDeManuteno = new JButton("CONTROLE DE MANUTENÇÃO");
		btnControleDeManuteno.setForeground(Color.WHITE);
		btnControleDeManuteno.setFont(new Font("Arial", Font.BOLD, 14));
		btnControleDeManuteno.setBackground(Color.DARK_GRAY);
		btnControleDeManuteno.setBounds(323, 374, 268, 63);
		contentPane.add(btnControleDeManuteno);
		
		JButton btnGerenciarItens = new JButton("GERENCIAR ITENS");
		btnGerenciarItens.setForeground(Color.WHITE);
		btnGerenciarItens.setFont(new Font("Arial", Font.BOLD, 14));
		btnGerenciarItens.setBackground(Color.DARK_GRAY);
		btnGerenciarItens.setBounds(662, 374, 193, 63);
		contentPane.add(btnGerenciarItens);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(37, 116, 828, 2);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(37, 480, 828, 2);
		contentPane.add(panel_1_1);
	}
}
