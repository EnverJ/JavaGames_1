package enver.ezmet.helloworld;

import com.godtsoft.diyjava.DIYWindow;

public class HelloWorld extends DIYWindow {

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	//	System.out.println("Hellow World");
		setFontSize(30);
		String word1= "Jeff's";
		print(word1);
		String word2= "awesome";
		print(word2);
		String word3= "dog";
		print(word1);
		print(word2);
		print(word3);
		
		print("Hellow earthling.");
		print();
		print ("Take me to your leader");
		print("+++++++1.4++++");
		String statement =word1+" "+word2+" "+word3;
		print(statement);
		print("+++++1.5+++++");
		String greeting= "Hello Ezmet.\nHow are you?";
		print(greeting);
		print("+++++1.6+++");
		print("Ezmet said to you \"hi\".");
		
		print("http:\\\\");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorld();

	}

}
