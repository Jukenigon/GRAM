import java.awt.Dimension;

import javax.swing.JFrame;

public class Main_frame extends JFrame{
	private static final long serialVersionUID = 1L;
	private Main_Pane main_p=new Main_Pane();
	
	public Main_frame(){
		super();
		
		build();
	}
	
	private void build(){
		setTitle("Gestionnaire de la RAM");
		Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int)screen.getWidth(),(int)screen.getHeight());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(main_p);
		setVisible(true);
	}
}
