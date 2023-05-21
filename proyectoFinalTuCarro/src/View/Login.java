package View;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame {

	private JPanel contentPane;
	private ImageIcon imagen;
	private JLabel lblLogo , lblCandado;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblMensaje;
	private JButton btnInisiarSesion;
	private JButton btnRegistarse;
	private JLabel lblNombre ;
	private JLabel lblContrasena;
	private JLabel lblIniciarSesion;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 251, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(0, 0, 224, 203);
		panel.add(lblLogo);
		
		lblCandado = new JLabel("");
		lblCandado.setBounds(0, 0, 224, 203);
		panel.add(lblLogo);
		
		//Generar la imagen en el label deseado
		
		setimagenLabel(lblLogo, "C:\\Users\\camil\\git\\repository\\proyectoFinalTuCarro\\src\\img\\logo.png");
		
		panel_1 = new JPanel();
		panel_1.setBounds(253, 0, 633, 533);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(192, 183, 220, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 216, 220, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(192, 263, 220, 14);
		panel_1.add(lblMensaje);
		
		btnInisiarSesion = new JButton("Aceptar");
		btnInisiarSesion.setBounds(253, 305, 89, 23);
		panel_1.add(btnInisiarSesion);
		
		btnRegistarse = new JButton("Registrarse");
		btnRegistarse.setBounds(516, 487, 89, 23);
		panel_1.add(btnRegistarse);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(70, 186, 49, 14);
		panel_1.add(lblNombre);
		
		lblContrasena = new JLabel("Contraseña");
		lblContrasena.setBounds(70, 219, 63, 14);
		panel_1.add(lblContrasena);
		
		lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setFont(new Font("Arial", Font.BOLD, 30));
		lblIniciarSesion.setBounds(192, 75, 220, 69);
		panel_1.add(lblIniciarSesion);
		
	
		
		
		
	}
	
	
	/** Coloca una imagen en un lebel
	 * 
	 * @param label
	 * @param root
	 */
	public void setimagenLabel(JLabel label, String root) {
		imagen = new ImageIcon(root);
		Icon icon = new ImageIcon(
				imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
		label.setIcon(icon);
		this.repaint();

	}
}
