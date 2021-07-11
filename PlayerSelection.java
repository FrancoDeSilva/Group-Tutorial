import java.util.ArrayList;
import java.util.Scanner;

class PlayerSelection{ 
  public static void main(String[] args) { 
	Scanner input=new Scanner(System.in);
	
	String instruct;
	
	System.out.println("Enter A to add player---");
	System.out.println("Enter V to view player---");
	System.out.println("Enter B to view best batsman---");
	System.out.println("Enter C to View best bowlers---");
	System.out.println("Enter D to View best Keepers---");
	
	instruct=input.next();
	
		ArrayList<String> Allplayers = new ArrayList<String>();
		Allplayers.add("Kumar Sangakkara");
		Allplayers.add("Aaron Finch");
		Allplayers.add("Babar Azam");
		Allplayers.add("Mahel Jaywardena");
		Allplayers.add("Virat Kohli");
		Allplayers.add("Dimuth Karunarathna");
		Allplayers.add("Glenn Maxwell");
		Allplayers.add("Rassie van der Dussen");
		Allplayers.add("Evin Lewis");
		Allplayers.add("Martin Guptill");
		Allplayers.add("Umar Gul");
		Allplayers.add("Lasith Malinga");
		Allplayers.add("Suranga Lakmal");
		Allplayers.add("Dale Steyn");
		Allplayers.add("Shane Warne");
		Allplayers.add("TM Dilshan");
		Allplayers.add("Ab De viliers");
		Allplayers.add("Aaron Finch");
		Allplayers.add("Brendon McCalum");
		Allplayers.add("MS Dhoni");
		Allplayers.add("Kusal Janith");
		Allplayers.add("Martin Guptill");
		if(instruct.equals("A")){
			System.out.print("Add a Player Name:");
			String Player=input.next();
		}
		if(instruct.equals("V")){
			System.out.println(Allplayers);
		}
		if(instruct.equals("B")){
			System.out.println(Allplayers.get(0));
			System.out.println(Allplayers.get(3));
		}
		if(instruct.equals("C")){
			System.out.println(Allplayers.get(11));
			System.out.println(Allplayers.get(13));
		}
		if(instruct.equals("D")){
			System.out.println(Allplayers.get(0));
			System.out.println(Allplayers.get(19));
		

		}
		
	}
	   
   
    
	
    
    
	}

   
  
 

	

