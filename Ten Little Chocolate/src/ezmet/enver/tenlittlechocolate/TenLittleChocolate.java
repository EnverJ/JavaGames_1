package ezmet.enver.tenlittlechocolate;

import ezmet.enver.mywindow.MyWindow;

public class TenLittleChocolate extends MyWindow {

	public TenLittleChocolate() {
		setFontSize(30);
		for(int i =1;i<4;i++){
			print(i+" little");
			
		}
		print("chocolates");
		for(int i=4;i<7;i++){
			print(i+" little");
		}
		print("chocolates");
		for(int i=7;i<10;i++){
			print(i+" little");
		}
		print("chocolates");
		print("10 little chocolate bars.");
		for(int i=10;i>7;i--){
			print(i+" little");
		}
		print("chocolates");
		for(int i=7;i>4;i-=1){
			print(i+" little");
			
		}
		print("chocolates");
		for(int i=4;i>1;i--){
			print(i+" little");
		}
		print("chocolates");
		print("1 little choclate bar.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenLittleChocolate();

	}

}
