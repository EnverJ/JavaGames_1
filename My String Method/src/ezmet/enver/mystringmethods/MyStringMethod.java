package ezmet.enver.mystringmethods;

import java.util.Random;

public class MyStringMethod {
	public static String scramble(String word){
		// Please replace the space with the length of the string
   String scrambled="";
     Random rand=new Random();
     while(word.length()>0){
     int length=word.length();
     int index=rand.nextInt(length);
     System.out.println("index= "+index);
     String letter=word.substring(index,index+1);
 //    print("letter= "+letter);
    System.out.println("letter= "+letter);
    String firstString=word.substring(0, index);
     String secondString=word.substring(index+1);
     word=firstString+secondString;
   //  print("word= "+word);
     System.out.println("word= "+word);
     scrambled+=letter;
  //   print("scralmbled= "+scrambled);
     System.out.println("scralmbled= "+scrambled);
     }
      return word;

}

}