package enver.ezmet.chooseanadventure;

import com.godtsoft.diyjava.DIYWindow;

public class ChooseAnAdventure extends DIYWindow {

	public ChooseAnAdventure() {
		setFontSize(30);
		// 6.1 add long statement in eclipse
		String story="I was woke up in unfamiliar woods.";
		story=story+" I was hungry and tired.";
		story=story+" I didn't know where I was.";
		story=story+" In my packet where three beans.";
		story=story+" Up the hill was a well.";
		story=story+" To the right was a small cottage.";
		print(story);
		print("Should I: ");
		print("a) Go up the hill?");
		print("b) Check the cottage?");
		print("c) Plan the beans?");
		startStory();
		
		// 6.2 user select an option
	}
	private void startStory(){
		print();
		String choice=input();
		switch(choice){
		case "a":
		//	print("Go up the hill.");
			//6.9
			goUpTheHill65();
			break;
		case "b":
		//	print("Check the cottage.");
			checkTheCottage();
			break;
		case "c":
		//	print("Plan the beans.");
			planTheBeans();
			break;
		default:
			startStory();;
		}
	}
	
	private void goUpTheHill(){
		print("Going up the hill.");
	}
	private void checkTheCottage(){
		print("Check the cottage.");
	}
	private void planTheBeans(){
		print("Plan the beans.");
	}

	
	//6.4
	private void startStory64(){
		String story2="I was woke up in unfamiliar woods.";
		story2=story2+" I was hungry and tired.";
		story2=story2+" I didn't know where I was.";
		story2=story2+" In my packet where three beans.";
		story2=story2+" Up the hill was a well.";
		story2=story2+" To the right was a small cottage.";
		print(story2);
		print("Should I: ");
		print("a) Go up the hill?");
		print("b) Check the cottage?");
		print("c) Plan the beans?");
			
	}
	private void goUpTheHill65(){
		print();
		String story3="On my way up the hill, a girl joined me.";
		story3=story3+" she told me her name was Jill.";
		story3=story3+" She was carring a pail.";
		story3=story3+" There is also a trail of breadcrumbers going down another path.";
		print(story3);
		print("Should I: ");
		print("a) Ask Jill to join me?");
		print("b) Follow the trail of bread crumbs?");
		
		startStorywithJill();
	}
	private void startStorywithJill(){
		String choice3=input();
		switch(choice3){
		case"a":
			goWithJill();
			break;
		case"b":
			followBreadCrumbers();
			break;
		default:
			startStorywithJill();
		}
		}
	private void goWithJill(){
		print("Go with Jill. ");
		String story4=" I was too much enjoying listining to Jill's stories. ";
		story4=story4+" I did not notice the branch acrsoos the path.";
		story4=story4+" I fall down.";
		print(story4);
		 print("What happen next?");
		 print("a) I broke my crown and Jill came tumbiling after. ");
		 print("b) The beans fell out of my pocket and immediately sprouted a bean stalk.");
		 fallSwitch();
	}
	private void fallSwitch(){
		String choice5=input();
		switch(choice5){
		case"a":
			brokeMyCrowed();
			break;
		case "b":
			sproutedABeanStalk();
			break;
		default:
			fallSwitch();
		
		}
	}
	
	
	private void brokeMyCrowed(){
		print("I broke my crown and Jill came tumbiling after.");
	}
	private void sproutedABeanStalk(){
		print("I followed the breag crumb for awhile. ");
		String story5=" Jill had to go to her grandmother's house. ";
		story5=story5+" before she left, Jill warned me about the cottage in the woods.";
		print(story5);
		print("Should I: ");
		print("a) Go with Jill? ");
		print("b) Check out the cottage in the woods?");
		jillOrWoods();
	}
	private void jillOrWoods(){
		String choice6=input();
		switch(choice6){
		case "a":
			goWithJill();
			break;
		case"b":
			checkTheWoods();
			break;
		default:
			jillOrWoods();
		}
		}
		private void checkTheWoods(){
print("I check out the cottage in the woods. ");

		
	}
	private void followBreadCrumbers(){
print("Follow bread crumbs.");
	}	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChooseAnAdventure();
       
	}

}
