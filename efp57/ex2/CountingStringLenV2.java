/*
 * author: poetic_programmer
 * date: 20/07/2016
 *
 * creates a text box for user input and shows how many
 * characters are in the input in real time. 
 *
 * note some care was taken to create a user friendly gui
 * however, that is not the point of this exercise.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountingStringLenV2{
	public static void main(String [] args){
		CountingStringLenV2 program = new CountingStringLenV2();
		program.init();
	}

	private JFrame frame;
	private JPanel panel;

	private JLabel titleLabel;
	private JLabel inputInstructionLabel;
	private JLabel outputLabel;

	private JTextField inputText;
	private JTextField outputText;

	public void init(){
		frame = new JFrame();
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);

		// make components appear in a top-down list
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		titleLabel = new JLabel("String Counter");
		inputInstructionLabel = new JLabel("Enter a String");
		outputLabel = new JLabel("Output");

		inputText = new JTextField("");
		inputText.setBackground(Color.GRAY);
		inputText.addKeyListener(new onKeyPressListener());

		outputText = new JTextField("");
		outputText.setBackground(Color.BLACK);
		outputText.setForeground(Color.WHITE);
		outputText.setEditable(false); // no user input!
		
		// add components to panel, then panel to frame
		panel.add(titleLabel);
		panel.add(inputInstructionLabel);
		panel.add(inputText);
		panel.add(outputLabel);
		panel.add(outputText);

		frame.getContentPane().add(BorderLayout.CENTER, panel);

		// finish creating frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 300);
		frame.setVisible(true);
	}

	private class onKeyPressListener implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e){
		}

		@Override
		public void keyTyped(KeyEvent e){
		}
		@Override
		public void keyReleased(KeyEvent e){
			String text = inputText.getText();
			outputText.setText(text + " has " + text.length() + " characters.");
		}
	}
}
