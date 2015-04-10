import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Top extends JPanel{
	private static final long serialVersionUID = 1L;

	public Top(){
		Border cadre = BorderFactory.createLineBorder(Color.black);
		this.setBorder(cadre);
		setLayout(new BorderLayout());
		JLabel logo=new JLabel(new ImageIcon("./images/GRAM.png"));
		this.add(logo,BorderLayout.WEST);
		
		JLabel txt=new JLabel("<html><b>by DTA</b></html>");
		this.add(txt);
	}

}
