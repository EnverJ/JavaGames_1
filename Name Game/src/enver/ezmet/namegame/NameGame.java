package enver.ezmet.namegame;

import com.godtsoft.diyjava.DIYWindow;

public class NameGame extends DIYWindow {

	public NameGame() {
		setFontSize(25);
		// TODO Auto-generated constructor stub
		//1. Print "Jack be Nimble"
		print("Jack be Nimble,");
		print("Jack be quick,");
		print("Jack jump over the candlestick. ");
		// 2. name="Jack"
		print("###########name=Jack#########");
        String name="Jack";
        String name2="Enver";
    	print(name2+" be Nimble,");
		print(name2+" be quick,");
		print(name2+" jump over the candlestick. ");
		print("__________");
		print("______________________________");
		// project 5 is statement
		
		if(name.equals("Jack")){
			print(name + ", your Jumaping skills are famouse!");
		}
		else{
			print(name+ ", I've never heard about you.");
		}
		
		if(name2.startsWith("E")){
			print(name2+", Go to the front of the line.");
			
		}
		else{
			print(name2+", You are the highness.");
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
