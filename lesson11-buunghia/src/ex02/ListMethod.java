package ex02;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ListMethod {
public  boolean add(List<CD> songList, CD newCD) {
	for(CD cd:songList) 
		if(cd.getCode()==newCD.getCode()) 
				return false;
	 songList.add(newCD); 
	 return true;
	}
	public static double getSumPrice(List<CD> songList) {
		
		double sum = 0;
		for(CD cd : songList) {
			sum += cd.getPrice();
		}
		return sum;
		
	}
	public List<CD> sortByPrice(List<CD> songList){
		
		List<CD> result = songList;
		Collections.sort(result, Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		
		return result;
	}
	public List<CD> sortBycode(List<CD> songList){
		
		List<CD> result = songList;
		Collections.sort(result, Comparator.comparing(CD::getCode));
		
		return result;
	}
	public void printf(List<CD> songList) {
		for(CD cd:songList) {
			System.out.println(cd);
		}
	}
}

