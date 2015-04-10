import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import java.util.ArrayList;
import java.awt.Graphics2D;

public class Graphe_pan extends JScrollPane
{
	private static final long serialVersionUID = 1L;
	private Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	private ArrayList<Integer> x1 = new ArrayList<Integer>();
	private ArrayList<Integer> y1 = new ArrayList<Integer>();
	private int h = (int)screen.getHeight();
	
	public Graphe_pan()
	{
		setSize((int)screen.getWidth(),(int)screen.getHeight());
		int x = 0;
		int w = (int)screen.getWidth();
		int y = 300;
		
		Border pan = BorderFactory.createEmptyBorder(x, w, y, h);
		this.setBorder(pan);
		x1.add(0);
		y1.add(300);

		updateUI();
	}
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.DARK_GRAY);
		for(int i = 0; i < (int)screen.getWidth(); i+=20)
			g.drawLine(i, 0, i, 300);
		
		for(int i = 0; i < (int)screen.getHeight(); i+=20)
			g.drawLine(0, i, (int)screen.getWidth(), i);
		
		Graphics2D g2d = (Graphics2D)g;  
		g.setColor(Color.GREEN);
		BasicStroke line = new BasicStroke(6.0f);
		g2d.setStroke(line);

		for(int i = 0; i < x1.size(); i++)
		{
			if(i < x1.size() - 1)
				g2d.drawLine(x1.get(i), y1.get(i), x1.get(i+1), y1.get(i+1));
		}
	}
	
	public void update()
	{
		x1.add(x1.get(x1.size() - 1) + 20);
		float process = Ram_visuel.getRam().getSize_Process_exec();
		float ram = Ram_visuel.getRam().getSize_ram();
		int percent = (300 * (int)process) / (int)ram; 
		y1.add(300 - percent);
		updateUI();
	}
}
