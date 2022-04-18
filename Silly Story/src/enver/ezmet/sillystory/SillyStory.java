package enver.ezmet.sillystory;

import com.godtsoft.diyjava.DIYWindow;

public class SillyStory extends DIYWindow {

	public SillyStory() {
		setFontSize(30);
		// TODO Auto-generated constructor stub
		print("Mary had a little lamb,");
		print("Whose fleece was white as snow.");
		print("And evrywhere that Mary went,");
		print("The lamb was sure to go.");
		// Replace your name 
		String name="Enver";
		print(name+" had a little lamb,");
		print("Whose fleece was white as snow.");
		print("And evrywhere that "+name+" went,");
		print("The lamb was sure to go.");
		// 3. input
		print("#####input#####");
		
		print("_______________");
		String name2=input();
		print("____");
		print(name2+" had a little lamb,");
		print("Whose fleece was white as snow.");
		print("And evrywhere that "+name2+" went,");
		print("The lamb was sure to go.");
		//4. input animal
		print("_____________________");
		print("Enter a name");
		String name3=input();
		print("Enter an animal name");
		String name4=input();
		print("Enter a color name");
		String name5=input();
		print(name3+" had a little "+name4);
		print("Whose fleece was "+name5+" as snow.");
		print("And evrywhere that "+name3+" went,");
		print("The "+name4+" was sure to go.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SillyStory();
	}

}
