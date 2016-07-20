import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class BasicBackgroundPanel extends JPanel{
	public void paintComponent(Graphics g){
		Color randColour = new Color(
				(int) (Math.random() * 256),
				(int) (Math.random() * 256),
				(int) (Math.random() * 256));

		g.setColor(randColour);
		g.fillRect(0, 0, 200, 200); 
	}
}
