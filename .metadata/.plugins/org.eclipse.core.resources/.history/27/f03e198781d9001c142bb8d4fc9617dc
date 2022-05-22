package ezmet.enver.calcualter;

import ezmet.enver.mywindow.MyWindow;

public class Calculater_2 extends MyWindow {

	public Calculater_2() {
		setFontSize(25);
		String s="Y";
		while(s.startsWith("Y")||s.startsWith("y")){
		double a=promtForDouble("Enter a number");
		String operation=promtFor("Enter +,-,* or /");
		double b=promtForDouble("Enter another number");
		double c=0;
		switch(operation){
		case"-":
			c=(a-b);
			print(a+"-"+b+"="+c);
			break;
		case"+":
			c=(a+b);
			print(a+"+"+b+"="+c);
			break;
		case"*":
			c=a*b;
			print(a+"*"+b+"="+c);
			break;
		case"/":
			try{
				c=a/b;
				print(a+"/"+b+"="+c);
			}
			catch(ArithmeticException e){
				print("Division by zero is not allowed");
				
			}
			break;
		default:
			print("An invalid operation was entered.");
			
		}
		s=promtFor("Do you wan to do another?");
		
			
		
		}
		
	}
	


	public static void main(String[] args) {
		new Calculater_2();

	}

}
