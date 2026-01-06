package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/imagens/calculadora.jpg")));
		frmCalculadora.setTitle("calculadora");
		frmCalculadora.setBackground(new Color(128, 0, 255));
		frmCalculadora.getContentPane().setBackground(new Color(147, 112, 219));
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.TRAILING);
		txtField.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtField.setBounds(10, 11, 326, 63);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC.setBounds(269, 87, 67, 45);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndiv.setBounds(278, 165, 58, 45);
		frmCalculadora.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("x");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmul.setBounds(278, 243, 58, 45);
		frmCalculadora.getContentPane().add(btnmul);
		
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnmenos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmenos.setBounds(278, 314, 58, 45);
		frmCalculadora.getContentPane().add(btnmenos);
		
		JButton btnmais = new JButton("+");
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
			}
		});
		btnmais.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnmais.setBounds(278, 389, 58, 45);
		frmCalculadora.getContentPane().add(btnmais);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(187, 165, 67, 45);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 165, 67, 45);
		frmCalculadora.getContentPane().add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(100, 165, 67, 45);
		frmCalculadora.getContentPane().add(btn8);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(187, 243, 67, 45);
		frmCalculadora.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(187, 314, 67, 45);
		frmCalculadora.getContentPane().add(btn3);
		
		
		JButton btnC_10 = new JButton("=");
		btnC_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecionar;
				numero2 = Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("x")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operacao.equals("/")) {
					resultado = numero1/numero2;
					txtField.setText(String.valueOf(resultado));
				}
			}
		});
		btnC_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnC_10.setBounds(187, 389, 67, 45);
		frmCalculadora.getContentPane().add(btnC_10);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(100, 243, 67, 45);
		frmCalculadora.getContentPane().add(btn5);
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(100, 314, 67, 45);
		frmCalculadora.getContentPane().add(btn2);
		
		
		JButton btn00 = new JButton(".");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ponto =".";
				String IngressarNumero = txtField.getText()+ponto;
				txtField.setText(IngressarNumero);
				}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn00.setBounds(100, 389, 67, 45);
		frmCalculadora.getContentPane().add(btn00);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 243, 67, 45);
		frmCalculadora.getContentPane().add(btn4);
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 314, 67, 45);
		frmCalculadora.getContentPane().add(btn1);
		
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn0.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 389, 67, 45);
		frmCalculadora.getContentPane().add(btn0);
		frmCalculadora.setBounds(100, 100, 362, 491);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
