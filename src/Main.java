import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

public class Main {
	public static void main(String[] args){
		
		try 
		{
		  UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
		} 
		catch (Exception e) 
		{
		  e.printStackTrace();
		}
		
		Black_theme.initLookAndFeel();
		
		
		 new Main_frame();
	}

}
