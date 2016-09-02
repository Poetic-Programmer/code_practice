/*
 * author: poetic programmer
 * date: 19/07/2016
 *
 * this is a simple gui program which displays various swing components
 */

import javax.swing.*;
import java.awt.*;

public class BasicGUI{
   	JFrame frame;
	BasicBackgroundPanel panel;

	public static void main(String [] args){
		BasicGUI gui = new BasicGUI();
		gui.init();
	}

	public void init(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new BasicBackgroundPanel();

		frame.getContentPane().add(BorderLayout.CENTER, panel);

		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
