package triangulo.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		frame.setTitle("Triangulo");
		
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
		btnTipo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent key) {
				if(key.getKeyCode() == KeyEvent.VK_ENTER){
					{
						try{int ladoUno = Integer.parseInt(textLado1.getText());
								int ladoDos = Integer.parseInt(textLado2.getText());
								int ladoTres = Integer.parseInt(textLado3.getText());
								calcularTipo(ladoUno,ladoDos ,ladoTres );
								textLado1.setText("");
								textLado2.setText("");
								textLado3.setText("");
								}
						catch(Exception e){
							JOptionPane.showMessageDialog(null, "Omitio ingresar algun valor o ingreso un valor no numerico, por favor ingrese 3 valores enteros positivos.");
						}			
				}
			}
		}
		});
		btnTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{int ladoUno = Integer.parseInt(textLado1.getText());
						int ladoDos = Integer.parseInt(textLado2.getText());
						int ladoTres = Integer.parseInt(textLado3.getText());
						calcularTipo(ladoUno,ladoDos ,ladoTres );
						textLado1.setText("");
						textLado2.setText("");
						textLado3.setText("");
						}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "Omitio ingresar algun valor o ingreso un valor no numerico, por favor ingrese 3 valores enteros positivos.");
				}
			}
		});
		btnTipo.setBounds(52, 133, 89, 23);
		frame.getContentPane().add(btnTipo);	
		JLabel lblIngreseElTamao = new JLabel("Ingrese el tama\u00F1o de cada lado");
		lblIngreseElTamao.setBounds(10, 11, 177, 14);
		frame.getContentPane().add(lblIngreseElTamao);
	}
	
	private void calcularTipo(int lado1, int lado2, int lado3){
		if(lado1 < 0 || lado2 < 0 || lado3 < 0)
			JOptionPane.showMessageDialog(null, "Ingreso uno o mas numeros negativos, por favor ingrese 3 valores enteros positivos.");
		else{
				if(lado1 == 0 || lado2 == 0 || lado3 == 0)
					JOptionPane.showMessageDialog(null, "Ningun lado puede tener valor 0, por favor ingrese 3 valores enteros positivos.");
				else
					try {
						Triangulo triangulo = new Triangulo();
						triangulo.setLadosTriangulos(lado1, lado2,lado3);
						//System.out.println(triangulo.getTipoTrinagulo());
						JOptionPane.showMessageDialog(null, triangulo.getTipoTrinagulo());
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
			}
		}
	}
;
