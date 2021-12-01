package sorting;

import java.util.Arrays;

public class Ex01 {
public static void main(String[] args) {
	int[] origin = {1,5,11,9,4,6};
	sort(origin,(int o1,int o2)->{
		return o1>o2;
	});
	
		System.out.println("Bubble Sort-asc: "+Arrays.toString(origin));
	
}
private static void sort(int[] origin,Strategy strategy) {
	for(int round=0;round<origin.length;round++) {
		for(int i=0;i<origin.length-round-1;i++) {
			if(strategy.compare(origin[i], origin[i+1])) {
				swap(origin,i,i+1);
			}
		}}
}
private static void sortASC(int[] origin) {
	for(int round=0;round<origin.length;round++) {
		for(int i=0;i<origin.length-round-1;i++) {
			if(origin[i]>origin[i+1]) {
				swap(origin,i,i+1);
			}
		}}
}
private static void swap(int[] origin,int before,int after) {
	int tmp = origin[before];
	origin[before]=origin[after];
	origin[after]=tmp;
}
}
