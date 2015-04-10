import java.util.*;


public class Random_Access_Memory {
	Scanner scan=new Scanner(System.in);
	private float size=0;
	private ArrayList<Process> process_exec=new ArrayList<Process>();
	private float size_process_exec=0;
	
	public Random_Access_Memory(float size_ram){
		this.size=size_ram;
	}
	
	public Random_Access_Memory(){
		
	}
	
	
	public Random_Access_Memory updateRam(Process processus,int val){
		if(val==1){
			this.size_process_exec+=processus.getSize_process();
			this.process_exec.add(processus);
			processus.setId(process_exec.size()-1);
			
			return this;
		}else{
			this.size_process_exec-=processus.getSize_process();
			this.process_exec.remove(processus.getId());
			System.out.println("Process"+processus.getId());
			int i=0;
			for(Process e:process_exec){
				e.setId(i);
				i++;
			}
			return this;
		}
		
	}
	public float getSize_ram(){
		return size;
		
	}
	
	public float getSize_Process_exec(){
		return size_process_exec;
	}
	
	public ArrayList<Process> getProcess_list(){
		return process_exec;
	}
	
	public ArrayList<Process> update_List(Random_Access_Memory ram,Process processus){
	
		ram.process_exec.add(processus);
		ram.size+=processus.getSize_process();
		ram.size_process_exec+=processus.getSize_process();
		return ram.process_exec;
	}
	
	public void setRam(float size){
		this.size=size;
	}
}
