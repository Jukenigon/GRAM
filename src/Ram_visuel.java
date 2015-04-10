import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ram_visuel extends JPanel{
	private static final long serialVersionUID = 1L;
	private static Random_Access_Memory ram;
	private Box ram_info;
	private JLabel info_ram,info_process_list;
	
	public Ram_visuel(){
		Border cadre = BorderFactory.createLineBorder(Color.black);
		this.setBorder(cadre);
		setLayout(new BorderLayout());
		
		    ram=new Random_Access_Memory();
		    new Get_Ram();
		    ram_info=Box.createVerticalBox();
		    info_process_list=new JLabel("Total size process: ");
		    info_ram=new JLabel("RAM : "+Ram_visuel.getRam().getSize_ram()+" Mo");
		    
		    ram_info.add(info_process_list);
		    ram_info.add(info_ram);
		    this.add(ram_info);
	}
		  
	    
	
	public static Random_Access_Memory getRam(){
		return ram;
	}
	
	public Box getInfo(){
		return ram_info;
	}
	public JLabel getInfo_Proc(){
		return info_process_list;
	}
	public JLabel getInfo_RAM(){
		return info_ram;
	}
	public void setInfo_RAM(String inf){
		info_ram=new JLabel(inf);
	}
	public void setInfo_Proc(String inf){
		info_process_list=new JLabel(inf);
	}

}
