package ezmet.enver.wordscramble;


import java.util.Random;

import ezmet.enver.mywindow.MyWindow;

public class WordScramble extends MyWindow {

	public WordScramble() {
		setFontSize(30);
		String word="ELEPHANT";
		String scrambled=scramble(word);
	//	print(scrambled);
		System.out.println(scrambled);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordScramble();

	}
	private String scramble(String word){
		// Please replace the space with the length of the string
   String scrambled="";
     Random rand=new Random();
     while(word.length()>0){
     int length=word.length();
     int index=rand.nextInt(length);
     System.out.println("index= "+index);
     String letter=word.substring(index,index+1);
    System.out.println("letter= "+letter);
    String firstString=word.substring(0, index);
     String secondString=word.substring(index+1);
     word=firstString+secondString;
     System.out.println("word= "+word);
     scrambled+=letter;
     System.out.println("scralmbled= "+scrambled);
     }
      return word;

}
}