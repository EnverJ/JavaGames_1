package ezmet.enver.wordscramble;


import ezmet.enver.mywindow.MyWindow;

public class WordScramble extends MyWindow {

	public WordScramble() {
		setFontSize(30);
		String word="ANIMALs";
		String scrambled=scramble(word);
		print(scrambled);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordScramble();

	}
	private String scramble(String word){
     String scrambled="";
      return scrambled;

}
}