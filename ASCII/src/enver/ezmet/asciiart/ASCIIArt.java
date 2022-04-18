package enver.ezmet.asciiart;

import com.godtsoft.diyjava.DIYWindow;

public class ASCIIArt extends DIYWindow {

	public ASCIIArt() {
		setFontSize(25);
		// 1. Add large "H"
		print("H    H");
		print("H    H");
		print("HHHHHH");
		print("H    H");
		print("H    H");
		//2.
		print(" @@@@@@");
		print(" |    |");
		print(  "   (o) (o)");
		print("C     _");
		print(" |   __|");
		print(" |   /");
		print("/   \\");
		//3. 
		print("********************************************");
		print("   /\\      ___#_            o");
		print("  //\\\\    /\\____\\        +-(.)-+");
	    print("___||_____|_|___|_________(_:_)__________");
	
		
	}

	public static void main(String[] args) {
		// 1.
		new ASCIIArt();

	}

}
