/*
 * author: poetic programmer
 * date: 20/07/2016
 *
 * shows how to create a text field and get real time info about the 
 * text entered.
 *
 * note that the display isn't well formatted, the input box is gray
 * on the north section of the frame, the info is orange on the south.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BasicTextField{
	public static void main(String [] args){
		BasicTextField program = new BasicTextField();
		program.init();
	}

	private JFrame frame;
	private JLabel keyStatusLabel;
	private JTextField inputTextField;
	private JTextField displayTextField;

	private String currentText;

	public void init(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		inputTextField = new JTextField(20);
		inputTextField.setBackground(Color.GRAY);
		inputTextField.addKeyListener(new onTextListener());

		displayTextField = new JTextField();
		displayTextField.setEditable(false); // no user input allowed!
		displayTextField.setBackground(Color.ORANGE);

		keyStatusLabel = new JLabel("");
		keyStatusLabel.setBackground(Color.YELLOW);

		frame.getContentPane().add(BorderLayout.NORTH, inputTextField);
		frame.getContentPane().add(BorderLayout.SOUTH, displayTextField);
		frame.getContentPane().add(BorderLayout.CENTER, keyStatusLabel);
		frame.setSize(200, 150);
		frame.setVisible(true);
	}

	private class onTextListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent event){
			keyStatusLabel.setText("Key Typed");
		}
		@Override
		public void keyPressed(KeyEvent event){
			keyStatusLabel.setText("Key Pressed");
		}
		@Override
		public void keyReleased(KeyEvent event){
			keyStatusLabel.setText("Key Released");
			currentText = inputTextField.getText();
			displayTextField.setText(currentText.length() + ", characters in the text box.");
		}
	}
}
