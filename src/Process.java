import java.util.*;


public class Process {
		private int id;
		private float size_process;
		Scanner scan=new Scanner(System.in);
		public Process(float size_processus){
			
			this.size_process=size_processus;
		}
		public Process(){
			
		}
		
		public int getId(){
			return id;
		}
		
		public float getSize_process(){
			return size_process;
		}
		
		public void setProcess(){
			this.size_process=scan.nextFloat();
			this.id=2;//A modifier	
		}
		
		public void setId(int val){
			this.id=val;
		}
		
}
