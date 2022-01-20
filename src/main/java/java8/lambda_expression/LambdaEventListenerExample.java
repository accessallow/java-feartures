package java8.lambda_expression;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaEventListenerExample {
	public static void main(String[] args) {
		JTextField tf = new JTextField();
		tf.setBounds(50,50,150,20);
		
		JButton b = new JButton("click");
		b.setBounds(80,100,70,30);
		
		b.addActionListener(e -> {
			tf.setText("Hello Swing");
		});
		
		JFrame fr = new JFrame();
		fr.add(tf);
		fr.add(b);
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(300,200);
		fr.setVisible(true);
		
	}
}
