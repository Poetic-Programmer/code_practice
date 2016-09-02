/**
 * @author michael dunleavy
 * @since 07/08/2016
 *
 * <h1> Simple Math GUI </h1>
 * <p> a simple math ui, note: there are better ways to 
 * format this program, the following is basic yet 
 * inefficient and inelegant, however it works as needed.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class SimpleMathGUI{
	public static void main(String [] args){
		SimpleMathGUI app = new SimpleMathGUI();

		app.run();
	}

	private JFrame frame;
	private JPanel panel;

	private JTextField inputATextField;
	private JTextField inputBTextField;
	private JTextField answerTextField;

	private float a, b;

	public SimpleMathGUI(){
	}

	public void run(){
		/*
		 * to make the gui slightly more usable and elegent, the jcomponents will
		 * be stored in a jpanel, also it uses a flow layout manger which is left
		 * to right top-to-bottom, which suits our needs.
		 */

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		inputATextField = new JTextField(10);
		inputBTextField = new JTextField(10);

		answerTextField = new JTextField(50);

		panel = new JPanel();
		panel.setBackground(Color.GRAY);

		inputATextField.addKeyListener(new MathKeyListener());
		inputBTextField.addKeyListener(new MathKeyListener());
		answerTextField.setEditable(false);
		panel.add(inputATextField);
		panel.add(inputBTextField);
		panel.add(answerTextField);

		frame.getContentPane().add(BorderLayout.CENTER, panel);

		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	private class MathKeyListener implements KeyListener{
		String inputA;
		String inputB;


		@Override 
		public void keyTyped(KeyEvent event){
			inputA = inputATextField.getText();
			inputB = inputBTextField.getText();

			try{
				a = Float.valueOf(inputA);
				b = Float.valueOf(inputB);

				System.out.println(a + " " + b);
			} catch (NumberFormatException ex){
			    // clear both text fields if unable to convert text	
				inputA = "";
				inputB = "";
			}
		}

		@Override
		public void keyPressed(KeyEvent event){
		}
		
		@Override
		public void keyReleased(KeyEvent event){
			// only present the math if correct inputs were entered
			if(inputA.length() > 0){
				String output = 
					a + " + " + b + " = " + (a + b) + "\n" +
					a + " - " + b + " = " + (a - b) + "\n" +
					a + " * " + b + " = " + (a * b) + "\n" +
					a + " / " + b + " = " + (a / b) + "\n";

				answerTextField.setText(output);
			}
		}
	}
}
