package ex03;

import java.util.List;
import java.util.Random;

import bean.Card;
import bean.Player;
import model.CardData;
import model.PlayerData;

/**
 * @author Pho Dac Biet
 *	Một lá bài trong bộ bài tây gồm 2 thuộc tính: loại bài (cơ, rô, chuồn, bích) và thứ tự quân
	bài(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A).
	Viết chương trình thực hiện các yêu cầu sau đâu:
	- Tạo lớp mô tả quân bài
	- Tạo lớp kiểm thử chứa bộ bài 52 lá bài và không được trùng nhau List<Card>
	- Thực hiện xào bài, chia bài cho 4 người chơi và in ra danh sách bài của mỗi người chơi.
 */
public class App {
	
	private static final List<Card> SETCARD = CardData.getAll();
	
	public static void main(String[] args) {
		Player[] players = PlayerData.getAll();
		dealCards(players, SETCARD);
		PlayerData.print(players);
	}
	
	private static void dealCards(Player[] players, List<Card> cards) {
		int turn = 0; int index = 0; int devided = 0;
		Random rand = new Random();
		while (devided != cards.size()) {
			index = rand.nextInt(cards.size());
			if (!cards.get(index).isDevided()) {
				players[turn].getCards().add(cards.get(index));
				cards.get(index).setDevided(true);
				turn++; devided++;
				if (turn == 4) {
					turn = 0;
				}
			}
		}
	}
}
