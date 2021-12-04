package ex01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	int[] na= {2,2,3,1,1,4,9,5,6};
	int[] arr;
	int n;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập số phần tử của mảng!!!\n");
	n=scanner.nextInt();
	Random random = new Random();
	arr = new int[n];
	int count =0;
	while(count<n) {
		arr[count++]=random.nextInt(100);
	}
	System.out.println("Mảng ban đầu: \n"+Arrays.toString(arr));
	int[] brr=delete(arr,n);
	sortASC(brr);
	System.out.println("Mảng sau khi loại bỏ những phần tử trùng nhau: \n"+Arrays.toString(brr));
    if(compare(arr)) {
    	if(n%2==0) {
    	System.out.println("Trung bình cộng của "+n/2+ " phần tử đầu tiên lớn hơn "+n/2+" phần tử cuối cùng");}
    	else {
    		System.out.println("Trung bình cộng của "+ ((n+1)/2-1)+ " phần tử đầu tiên lớn hơn "+((n+1)/2-1)+" phần tử cuối cùng");
    	}
    }else {
    	if(n%2==0) {
        	System.out.println("Trung bình cộng của "+n/2+ " phần tử đầu tiên nhỏ hơn "+n/2+" phần tử cuối cùng");}
        	else {
        		System.out.println("Trung bình cộng của "+ ((n+1)/2-1)+ " phần tử đầu tiên nhỏ hơn "+((n+1)/2-1)+" phần tử cuối cùng");
        	}
    }
    System.out.println("Phần tử lớn thứ 3 là: "+search(brr));
    
}
private static int[] delete(int[] origin,int n) {
	int[] intermediary= new int[n];
	boolean search;
	int count=0;
	
	for(int i=0;i<n;i++) {
		search=false;
		for(int j=0;j<n-1;j++) {
			if(intermediary[j]==origin[i]) {
			search=true;
			break;
			}
		}
		if(!search) {
			intermediary[count++]=origin[i];
			
			
		}
	}
	int brr[]=new int[count];
	for(int b=0;b<count;b++) {
		brr[b]=intermediary[b];
	}
	return brr;
}
public static void sortASC(int [] arr) {
    int temp = arr[0];
    for (int i = 0 ; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
private static boolean compare(int[] origin) {
	float trc=0;
	float sau=0;
	if(origin.length%2==0) {
		for(int i=0;i<origin.length/2;i++) {
			trc+=origin[i];
		}
		for(int i=origin.length/2;i<origin.length;i++) {
			sau+=origin[i];
		}
	}else {
		for(int i=0;i<(origin.length+1)/2;i++) {
			trc+=origin[i];
		}
		for(int i=(origin.length+1)/2;i<origin.length;i++) {
			sau+=origin[i];
		}
	}
	if(trc>sau) {
	return true;}
	else {
		return false;
	}
}
private static int search(int[] origin) {
	return origin[origin.length-3];
}
}
