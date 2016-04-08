package triangulo.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameMain {

	private JFrame frame;
	private JTextField textLado1;
	private JTextField textLado2;
	private JTextField textLado3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMain window = new FrameMain();
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
	public FrameMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 225, 217);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLado = new JLabel("Lado 1:");
		lblLado.setBounds(10, 34, 46, 14);
		frame.getContentPane().add(lblLado);
		
		JLabel lblLado_1 = new JLabel("Lado 2:");
		lblLado_1.setBounds(10, 59, 46, 14);
		frame.getContentPane().add(lblLado_1);
		
		JLabel lblLado_2 = new JLabel("Lado 3:");
		lblLado_2.setBounds(10, 84, 46, 14);
		frame.getContentPane().add(lblLado_2);
		
		textLado1 = new JTextField();
		textLado1.setBounds(79, 31, 86, 20);
		frame.getContentPane().add(textLado1);
		textLado1.setColumns(10);
		
		textLado2 = new JTextField();
		textLado2.setBounds(79, 56, 86, 20);
		frame.getContentPane().add(textLado2);
		textLado2.setColumns(10);
		
		textLado3 = new JTextField();
		textLado3.setBounds(79, 81, 86, 20);
		frame.getContentPane().add(textLado3);
		textLado3.setColumns(10);
		
		JButton btnTipo = new JButton("Tipo");
		btnTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				calcularTipo(textLado1.getText(), textLado2.getText(), textLado3.getText());
				textLado1.setText("");
				textLado2.setText("");
				textLado3.setText("");
			}
		});
		btnTipo.setBounds(52, 133, 89, 23);
		frame.getContentPane().add(btnTipo);
		
		JLabel lblIngreseElTamao = new JLabel("Ingrese el tama\u00F1o de cada lado");
		lblIngreseElTamao.setBounds(10, 11, 177, 14);
		frame.getContentPane().add(lblIngreseElTamao);
	}
	
	private void calcularTipo(String lado1, String lado2, String lado3){
		try {
			Triangulo triangulo = new Triangulo();
			triangulo.setLadosTriangulos(Integer.parseInt(lado1), Integer.parseInt(lado2),
					Integer.parseInt(lado3));
			//System.out.println(triangulo.getTipoTrinagulo());
			JOptionPane.showMessageDialog(null, triangulo.getTipoTrinagulo());
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Los valores ingresados NO son numéricos");
		}
	}
	}
;
