package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
			try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Metal".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	          System.err.println(ex);
	        } 
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(126, 88, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(126, 118, 162, 42);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(126, 188, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(126, 214, 162, 42);
		frame.getContentPane().add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) { 
				  JOptionPane.showMessageDialog(null,"Bem Vindo ao sistema!" );
				}
				
			 else {
			
				  JOptionPane.showMessageDialog(null,"Dados Invalidos!","Meu T?tulo",JOptionPane.WARNING_MESSAGE);

			}
			}});
		btnEntrar.setBounds(164, 296, 89, 23);
		frame.getContentPane().add(btnEntrar);
	
	}
	
	public boolean checkLogin(String login, String senha) {
	
	return login.equals("usuario") && senha.equals("123");
}

}






