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

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import model.Usuario;

import javax.swing.JCheckBox;
import java.awt.SystemColor;



public class telaCadastroUsuario extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtRE;
	private JTextField txtEndereco;
	private JLabel lblControleDeFrota;
	private JTextField txtDigitarRE;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtConfirmarSenha;
	private JTextField txtSenha;
	private JTextField txtEmail;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtCpf2;
	private JLabel lblCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastroUsuario frame = new telaCadastroUsuario();
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
	public telaCadastroUsuario() {
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
		btnVoltar.setBackground(SystemColor.controlHighlight);
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 13));
		btnVoltar.setBounds(24, 519, 91, 32);
		contentPane.add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(141, 154, 205));
		panel.setBounds(-1, -2, 922, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblControleDeFrota = new JLabel("GERENCIAR USUÁRIO");
		lblControleDeFrota.setBounds(252, 23, 485, 43);
		lblControleDeFrota.setForeground(Color.BLACK);
		lblControleDeFrota.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(lblControleDeFrota);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(24, 100, 870, 106);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblConsultarReDo = new JLabel("Consultar RE do colaborador");
		lblConsultarReDo.setBounds(109, 23, 182, 16);
		panel_1.add(lblConsultarReDo);
		lblConsultarReDo.setForeground(new Color(0, 0, 0));
		lblConsultarReDo.setFont(new Font("Arial", Font.BOLD, 12));
		
		txtDigitarRE = new JTextField();
		txtDigitarRE.setText("Digite o RE do colaborador");
		txtDigitarRE.setFont(new Font("Arial", Font.ITALIC, 14));
		txtDigitarRE.setColumns(10);
		txtDigitarRE.setBounds(109, 49, 182, 23);
		panel_1.add(txtDigitarRE);
		
		JCheckBox chckbxInativarUsuario = new JCheckBox("Inativar Usuário");
		chckbxInativarUsuario.setBounds(557, 50, 144, 23);
		panel_1.add(chckbxInativarUsuario);
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(0, -1, 137, 14);
		panel_1.add(lblColaborador);
		lblColaborador.setForeground(new Color(128, 128, 255));
		lblColaborador.setFont(new Font("Arial", Font.BOLD, 13));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1_1.setBounds(24, 222, 870, 278);
		contentPane.add(panel_1_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Arial", Font.BOLD, 12));
		lblNome.setBounds(10, 35, 56, 16);
		panel_1_1.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.ITALIC, 14));
		txtNome.setColumns(10);
		txtNome.setBounds(56, 31, 364, 26);
		panel_1_1.add(txtNome);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setBounds(0, 0, 137, 14);
		panel_1_1.add(lblCadastrar);
		lblCadastrar.setForeground(new Color(128, 128, 255));
		lblCadastrar.setFont(new Font("Arial", Font.BOLD, 13));
		
		txtRE = new JTextField();
		txtRE.setBounds(463, 31, 101, 26);
		panel_1_1.add(txtRE);
		txtRE.setFont(new Font("Arial", Font.ITALIC, 14));
		txtRE.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(84, 65, 480, 26);
		panel_1_1.add(txtEndereco);
		txtEndereco.setFont(new Font("Arial", Font.ITALIC, 14));
		txtEndereco.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setFont(new Font("Arial", Font.ITALIC, 14));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(84, 102, 199, 23);
		panel_1_1.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.ITALIC, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(56, 132, 462, 23);
		panel_1_1.add(txtEmail);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(10, 136, 45, 16);
		panel_1_1.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		lblTelefone.setBounds(10, 106, 74, 16);
		panel_1_1.add(lblTelefone);
		
		JLabel lblRE = new JLabel("RE:");
		lblRE.setForeground(Color.BLACK);
		lblRE.setFont(new Font("Arial", Font.BOLD, 12));
		lblRE.setBounds(430, 36, 35, 16);
		panel_1_1.add(lblRE);
		
		JLabel lblEnderco = new JLabel("Endereço:");
		lblEnderco.setForeground(Color.BLACK);
		lblEnderco.setFont(new Font("Arial", Font.BOLD, 12));
		lblEnderco.setBounds(10, 70, 64, 16);
		panel_1_1.add(lblEnderco);
		
		JLabel txtCpf;
		lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Arial", Font.BOLD, 12));
		lblCpf.setBounds(285, 106, 35, 16);
		panel_1_1.add(lblCpf);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setForeground(Color.BLACK);
		lblBairro.setFont(new Font("Arial", Font.BOLD, 12));
		lblBairro.setBounds(574, 70, 45, 16);
		panel_1_1.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setFont(new Font("Arial", Font.ITALIC, 14));
		txtBairro.setColumns(10);
		txtBairro.setBounds(629, 65, 160, 26);
		panel_1_1.add(txtBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.BLACK);
		lblCidade.setFont(new Font("Arial", Font.BOLD, 12));
		lblCidade.setBounds(574, 36, 50, 16);
		panel_1_1.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setFont(new Font("Arial", Font.ITALIC, 14));
		txtCidade.setColumns(10);
		txtCidade.setBounds(629, 33, 160, 26);
		panel_1_1.add(txtCidade);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(388, 179, 453, 88);
		panel_1_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblConsultarReDo_1_1_1 = new JLabel("Senha:");
		lblConsultarReDo_1_1_1.setBounds(10, 11, 48, 14);
		panel_2.add(lblConsultarReDo_1_1_1);
		lblConsultarReDo_1_1_1.setForeground(Color.BLACK);
		lblConsultarReDo_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		txtSenha = new JTextField();
		txtSenha.setBounds(10, 35, 182, 23);
		panel_2.add(txtSenha);
		txtSenha.setFont(new Font("Arial", Font.ITALIC, 14));
		txtSenha.setColumns(10);
		
		JLabel lblConsultarReDo_1_1 = new JLabel("Confirme sua senha:");
		lblConsultarReDo_1_1.setBounds(212, 10, 182, 16);
		panel_2.add(lblConsultarReDo_1_1);
		lblConsultarReDo_1_1.setForeground(Color.BLACK);
		lblConsultarReDo_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		txtConfirmarSenha = new JTextField();
		txtConfirmarSenha.setBounds(212, 35, 203, 23);
		panel_2.add(txtConfirmarSenha);
		txtConfirmarSenha.setFont(new Font("Arial", Font.ITALIC, 14));
		txtConfirmarSenha.setColumns(10);
		
		txtCpf2 = new JTextField();
		txtCpf2.setFont(new Font("Arial", Font.ITALIC, 14));
		txtCpf2.setColumns(10);
		txtCpf2.setBounds(319, 102, 199, 23);
		panel_1_1.add(txtCpf2);
		
		JButton btnSalvar = new JButton("SALVAR");
		
		btnSalvar.addActionListener(e -> {
            //try {
            	
				Usuario novoUsuario = new Usuario();
				novoUsuario.setNome(txtNome.toString());
				novoUsuario.setEmail(txtEmail.toString());
				novoUsuario.setCpf(txtCpf2.toString());
				novoUsuario.setEndereco(txtEndereco.toString());
				novoUsuario.setRe(txtRE.toString());
				novoUsuario.setTelefone(txtTelefone.toString());
				novoUsuario.setSenha(txtSenha.toString());
				novoUsuario.setInativarUsuario(false);
				
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle-frota");
				EntityManager em = emf.createEntityManager();
				
				
				em.getTransaction().begin();
				em.persist(novoUsuario);
				em.getTransaction().commit();
				
				emf.close();
				em.close();
				
            //}catch (NumberFormatException ex) {

			//}
		});
		/*btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario novoUsuario = new Usuario();
				novoUsuario.setNome(txtNome.toString());
				novoUsuario.setEmail(txtEmail.toString());
				novoUsuario.setCpf(txtCpf2.toString());
				novoUsuario.setEndereco(txtEndereco.toString());
				novoUsuario.setRe(txtRE.toString());
				novoUsuario.setTelefone(txtTelefone.toString());
				novoUsuario.setSenha(txtSenha.toString());
				novoUsuario.setInativarUsuario(false);
				
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("controle-frota");
				EntityManager em = emf.createEntityManager();
				
				
				em.getTransaction().begin();
				em.persist(novoUsuario);
				em.getTransaction().commit();
				
				//telaInicial telaCadastro = new telaInicial();
				//telaCadastro.setVisible(true);
			}
		});*/
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Arial", Font.BOLD, 13));
		btnSalvar.setBackground(SystemColor.windowBorder);
		btnSalvar.setBounds(803, 519, 91, 32);
		contentPane.add(btnSalvar);
	}
}
