/*
 * author: poetic programmer
 * date: 20/07/2016
 *
 * simple gui showing the default layout manager of a jpanel 
 * by adding several jcomponents
 */

import javax.swing.*;
import java.awt.BorderLayout;

public class PanelButtons{
	public static void main(String [] args){
		PanelButtons program = new PanelButtons();
		program.init();
	}

	JFrame frame;
	JPanel panel;
	JButton [] buttons;

	public PanelButtons(){
		// create space for 3 button objects
		buttons = new JButton[3];
	}

	public void init(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		
		buttons[0] = new JButton("Button 1");
		buttons[1] = new JButton("Button 2");
		buttons[2] = new JButton("Button 3");

		// test new button adding method
		addNewButton("Button 4");
		addNewButton("Button 5");
		addNewButton("Button 6");
		addNewButton("Button 7");

		// add buttons to panel
		for(JButton b : buttons){
			panel.add(b);
		}
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.getContentPane().add(BorderLayout.CENTER, panel);

		frame.setSize(500, 500);
		frame.setVisible(true);
	}

	private void addNewButton(String name){
		/*
		 *  this method creates a new array and saves it to the 
		 *  'buttons' array. This is inefficient, a better
		 *  alternative is to use an ArrayList. This is for 
		 *  testing purposes only.
		 */

		// set aside memory for new button list
		JButton [] newButtonArray = new JButton[buttons.length+1];

		// copy old buttons into new array and clear old array
		int offset = 0;
		for(JButton b : buttons){
			newButtonArray[offset++] = b;
			b = null;
		}
		
		// add new button
		newButtonArray[offset] = new JButton(name);

		// point old array to new array
		buttons = newButtonArray;	
	}
}
