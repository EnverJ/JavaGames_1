package ezmet.enver.wordscramble;
import ezmet.enver.mystringmethods.MyStringMethod;
import ezmet.enver.mywindow.MyWindow;

public class WordScramble extends MyWindow {

	public WordScramble() {
		setFontSize(30);
		String words[]={"ANIMALS","ELEPHANT","GIRAFEE","PENGUIN","GORILLA","HIPPOPOTAMUS","COUGAR","KANAGAROO","OSTRICH",
				"BUFFALO","LEOPARD","OCTUPUS"};
		int numberOfWords=words.length;
		for(int i=0;i<numberOfWords;i++){
		String scrambled=MyStringMethod.scramble(words[i]);
		print(scrambled);
	//	System.out.println(scrambled);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordScramble();

	}
	
}