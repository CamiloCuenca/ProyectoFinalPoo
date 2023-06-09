package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Cliente;
import Model.Empleados;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class registrar extends JFrame implements ActionListener{


	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JTextField txtCorreo;
	private JTextField txtContrasena;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrar frame = new registrar();
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
	public registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(303, 91, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(303, 135, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cedula");
		lblNewLabel_2.setBounds(303, 182, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setBounds(303, 231, 63, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("contraseña");
		lblNewLabel_4.setBounds(303, 284, 63, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(383, 88, 298, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(383, 132, 298, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(383, 179, 298, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(383, 228, 298, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(383, 281, 298, 20);
		contentPane.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(464, 374, 89, 23);
		contentPane.add(btnRegistrar);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 239, 556);
		contentPane.add(panel);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(612, 324, 224, 203);
		contentPane.add(lblLogo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnRegistrar) {
			
			Cliente cliente = new Cliente(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),txtCorreo.getText(),txtContrasena.getText());
			Empleados em = new Empleados("", "", "", "", "");
			em.registrarCliente(cliente);
			
			
		}
		
		
	}
}
