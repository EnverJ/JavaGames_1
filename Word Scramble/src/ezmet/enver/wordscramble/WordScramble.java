package ezmet.enver.wordscramble;


import ezmet.enver.mywindow.MyWindow;

public class WordScramble extends MyWindow {

	public WordScramble() {
		setFontSize(30);
		String word="ANIMALS";
		String scrambled=scramble(word);
		print(scrambled);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordScramble();

	}
	private String scramble(String word){
		// Please replace the space with the length of the string
     String scrambled="";
      return scrambled;

}
}