package ezmet.enver.calcualter;

import com.godtsoft.diyjava.DIYWindow;

public class Calculater extends DIYWindow {

	public Calculater() {
		setFontSize(25);
		print(5);
		// declare an int
		int a=10;
		int b=7;
		print("a is "+a);
		print("b is "+b);
		
		int c=b+5;
		print(c);
		

	}

	public static void main(String[] args) {
		new Calculater();

	}

}
