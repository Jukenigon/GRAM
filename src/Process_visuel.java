import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Process_visuel extends JPanel{

	private static final long serialVersionUID = 1L;
	private Box process_b,list_process,add_b;
	
	public Process_visuel(){
		Border cadre = BorderFactory.createLineBorder(Color.black);
		this.setBorder(cadre);
		setLayout(new BorderLayout());
		
		Process eclipse=new Process((float) 500.5);
		Process skype=new Process((float) 73.5);
		/*Processus ‡ rajouter */
		
		
		process_b=Box.createVerticalBox();
		
		list_process=Box.createVerticalBox();
		
		JButton proc1=new JButton("Eclipse");
			proc1.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					
					try{
						Ram_verif(Gestion.launch_process(eclipse,Ram_visuel.getRam()));
						launch(eclipse,Ram_visuel.getRam(),"Eclipse");
						Main_Pane.getGraphe().update();
						
					}catch(Error_ram e){
						new Error_mes();
					}
					updateUI();
				}	
			}) ;
		
		JButton proc2=new JButton("Notepad ++");
		proc2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				try{
					Ram_verif(Gestion.launch_process(skype,Ram_visuel.getRam()));
					launch(skype,Ram_visuel.getRam(),"Notepad ++");
					Main_Pane.getGraphe().update();
				}catch(Error_ram e){
					new Error_mes();
				}
				updateUI();
				
			}	
		}) ;
		
		list_process.add(proc1);
		list_process.add(proc2);
		
		process_b.add(list_process);
		
		add_b=Box.createHorizontalBox();
		
		JButton add_process=new JButton("Add Process");
		
		add_b.add(add_process);
		
		process_b.add(add_b);
		
		this.add(process_b);
		
		
	}
	
	public void launch(Process process,Random_Access_Memory ram,String name){
		
			ram.updateRam(process,1);//Rajout du processus dans la liste et incrÈmentation des processus exÈcutÈ
			
			Box proc_supp=Box.createHorizontalBox();
			
			JLabel nam=new JLabel(name);
			JButton supp=new JButton("x");
			
			proc_supp.add(supp);
			proc_supp.add(nam);
			
			Main_Pane.getTable().getBox().add(proc_supp);
			
			supp.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					
					
					ram.updateRam(process, 2);
					Main_Pane.getGraphe().update();
					
					Main_Pane.getRam_vis().getInfo().remove(Main_Pane.getRam_vis().getInfo_Proc());
					Main_Pane.getRam_vis().getInfo().remove(Main_Pane.getRam_vis().getInfo_RAM());
					
					Main_Pane.getRam_vis().setInfo_Proc("Total size process: "+ram.getSize_Process_exec()+" Mo");
					Main_Pane.getRam_vis().getInfo().add(Main_Pane.getRam_vis().getInfo_Proc());
					
					Main_Pane.getRam_vis().setInfo_RAM("Size RAM: "+ram.getSize_ram()+" Mo");
					Main_Pane.getRam_vis().getInfo().add(Main_Pane.getRam_vis().getInfo_RAM());
					
					Main_Pane.getTable().getBox().remove(proc_supp);
					
					
					updateUI();
				}	
			}) ;
			
			
			Main_Pane.getRam_vis().getInfo().remove(Main_Pane.getRam_vis().getInfo_Proc());
			Main_Pane.getRam_vis().getInfo().remove(Main_Pane.getRam_vis().getInfo_RAM());
			
			Main_Pane.getRam_vis().setInfo_Proc("Total size process: "+ram.getSize_Process_exec()+" Mo");
			Main_Pane.getRam_vis().getInfo().add(Main_Pane.getRam_vis().getInfo_Proc());
			
			Main_Pane.getRam_vis().setInfo_RAM("Size RAM: "+ram.getSize_ram()+" Mo");
			Main_Pane.getRam_vis().getInfo().add(Main_Pane.getRam_vis().getInfo_RAM());
				
	}
	

public void Ram_verif(boolean val)throws Error_ram{
	if(val==false)throw new Error_ram();
}


}

class Error_ram extends Exception{
	private static final long serialVersionUID = 1L;

	public Error_ram(){
		super();
	}
}
	
	

