package ezmet.enver.mywindow;

import com.godtsoft.diyjava.DIYWindow;

public class MyWindow extends DIYWindow {
	
	protected int promtForInt(String prompt){
		
		int i=0;
		print(prompt);
		String s=input();
		try{
			i=Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			print(s + " Is not a valid number. try again.");
			i=promtForInt(prompt);
		}
		
		return i;
		
		
	}
	protected String promtFor(String prompt){
		print(prompt);
		String s=input();
		return s;
	}
	
	protected double promtForDouble(String promt){
		double d=0;
		print(promt);
		String s=input();
		try{
			d=Double.parseDouble(s);
		}
		catch(NumberFormatException e){
			print(s + " is not a valid number. Try again.");
			
		}
		return d;
	}

}
