package enver.ezmet.namegame;

import com.godtsoft.diyjava.DIYWindow;

public class NameGame extends DIYWindow {

	public NameGame() {
		setFontSize(25);
		print("Enter name: ");
		String name=input();
		print("___");
		while(!name.equalsIgnoreCase("quit")){
		checkname(name);
	//	print("__"); // this will result up in infinite loop. So just enter  a new print
		print();
		print("Enter another name");
		name=input();
		}
		   print("Thank you for playing my game");
	}
	
		private void checkname(String name){
    		
		if(name.equals("Jack")){
			print(name + ", your Jumaping skills are famouse!");
		}
		else{
			print(name+ ", I've never heard about you.");
		}
		
		if(name.startsWith("E")){
			print(name+", Go to the front of the line.");
			
		}
		else{
			print(name+", You are the highness.");
		}
		
		if(!name.equals("Ezmet")){
			print(name+", Sorry. I am waiting for Ezmet");
			
		}else{
			print(name+", you are welcome!!!");
		}
		
		if(!name.contains("Ja")){
			print(name+", Don't you have a frist name and last name ");
			
		}else{
         print("is "+name+" your first name?");
		}
		
		//5.7 
		if(name.contains("C")&&name.endsWith("ck")){
			print("This is Jack.");
			
		}else if(name.contains("C")||name.endsWith("lk")){
			print("We may have Jack.");
			
		}
		else{
			print("We have somone else.");
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new NameGame();

	}

}
