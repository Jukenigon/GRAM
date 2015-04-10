import javax.swing.JOptionPane;


public class Get_Ram extends JOptionPane{
	private static final long serialVersionUID = 1L;

		public Get_Ram(){
			super();
			
			String[] size = {"4 Go","6 Go","8 Go"};
		    String size_selected = (String)JOptionPane.showInputDialog(null,"Veuillez saisir la taille de la RAM ","Taille de la RAM",JOptionPane.QUESTION_MESSAGE,null,size,size[0]);
		    
		    
		    setRam(Ram_visuel.getRam(),(float)size_returned(size_selected));
		}
		
		public int size_returned(String s){
			switch(s){
			case "4 Go":
					return 4094;
				
			case "6 Go":
				return 6144;
				
			case "8 Go":
				return 8192;
	
			}
			return 0;
		}
		
		public void setRam(Random_Access_Memory ram,float size){
			ram.setRam(size);
		}
		

}
