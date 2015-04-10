import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

public class Black_theme {
	
	public static void initLookAndFeel()
	{
		UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());
		try
		{
			String key = new String(new byte[] { 
					67, 49, 52, 49, 48, 50, 57, 52, 45, 54, 49, 66, 54, 52, 65, 65,
					67, 45, 52, 66, 55, 68, 51, 48, 51, 57, 45, 56, 51, 52, 65,
					56, 50, 65, 49, 45, 51, 55, 69, 53, 68, 54, 57, 53 
					},
					"UTF-8");
			if(key != null)
			{
				String[] license = { 
						"Licensee=AppWork UG",
						"LicenseRegistrationNumber=289416475",
						"Product=Synthetica",
						"LicenseType=Small Business License",
						"ExpireDate=--.--.----", "MaxVersion=2.999.999" };
				UIManager.put("Synthetica.license.info", license);
				UIManager.put("Synthetica.license.key", key);
			}
			UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
		} 
		catch (UnsupportedLookAndFeelException | ParseException e)
		{
			((Throwable) e).printStackTrace();
		} 
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
	}
}
