package sorting;

public class SelectionSort {
	public void selectionSort(int arr[]) {
        int indexMin, i, j;
 
        // lap qua ta ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            indexMin = i;
 
            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
 
            if (indexMin != i) {
                System.out.println(" ==> Trao doi phan tu: [" + arr[i] 
                        + ", " + arr[indexMin] + "]");
                // Trao doi cac so
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
 
            System.out.println("Vong lap thu " + (i + 1));
            display(arr);
        }
    }
	 public void display(int arr[]) {
	        int i;
	        System.out.print("[");
	 
	        // Duyet qua tat ca phan tu
	        for (i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	 
	        System.out.print("]\n");
	    }
	 
}
