package ex03;
import java.util.ArrayList;

public class ListMethod {
	ArrayList<Card> Deck= new ArrayList<>();
	String[] suits= {"Spade","Club","Diamond","Heart"};
	String[] values= {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	public void addCarf(ArrayList<Card> Deck){
		for (int i =0 ;i < 13 ;i ++) {
			for (int j =0 ;j <4 ; j++)
				Deck.add(new Card(suits[j],values[i]));
		}
	}
			
}
