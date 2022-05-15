package ezmet.enver.cards;

public class Card {
	private char rank=' ';
	private char suit=' ';
	private static final String RANKS="A23456789TJQK";
	private static final String SUITS="HDCS";
	
	public Card(int id){
		id=id%52;
		if(id<0){
			id=id*-1;
		}
		rank=RANKS.charAt(id%13);
		suit=SUITS.charAt(id/13);
		
	}
	
	public Card(String rs){
		if(rs.length()==2){
			char r=rs.charAt(0);
			char s=rs.charAt(1);
			int ri=RANKS.indexOf(r);
			int si=SUITS.indexOf(s);
			if(ri>-1&&si>-1){
				rank=r;
				suit=s;
			}
		}
	
	}

	
	public String toString(){
		String rs=""+rank+suit;
		return rs;
		
	}

}
