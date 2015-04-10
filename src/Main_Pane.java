import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;


public class Main_Pane extends JPanel{
	private static final long serialVersionUID = 1L;
	private static Process_visuel proc;
	private static Ram_visuel ram;
	private static Graphe_pan graphe;
	private static Table_pan table;
	
	public Main_Pane(){
		super();
		
		this.setLayout(new BorderLayout());
		Top top=new Top();
		this.add(top,BorderLayout.NORTH);
		
		ram=new Ram_visuel();
		table=new Table_pan();
		this.add(table,BorderLayout.WEST);
	
		
		this.add(ram,BorderLayout.CENTER);
		
		proc=new Process_visuel();
		this.add(proc,BorderLayout.EAST);
		
		graphe=new Graphe_pan();
		JScrollPane scrollPane = new JScrollPane(graphe);
		this.add(scrollPane, BorderLayout.SOUTH);
	}
	
	public static Table_pan getTable(){
		return table;
	}
	
	public static Ram_visuel getRam_vis(){
		return ram;
	}
	
	public static Graphe_pan getGraphe(){
		return graphe;
	}
}
