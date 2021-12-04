package sorting;

public class MergeSort {
	public void mergeSort(int arr[], int l, int r) {
		if (l < r) // (l<r) condition will hold good until getting singleton arrays
		{
			int mid;
			mid = (l + r) / 2;
			mergeSort(arr, l, mid); // calling merge sort on left sub array
			mergeSort(arr, mid + 1, r);// calling merge sort on right sub array
			merge(arr, l, mid, r);// merge operation
		}
	}

	public void merge(int arr[], int l, int mid, int r) {
		int n1 = (mid - l + 1); // getting size of left sub array
		int n2 = r - mid; // getting size of right sub array
		int left[] = new int[n1];
		int right[] = new int[n2];
		int i;
		for (i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (i = 0; i < n2; i++) {
			right[i] = arr[mid + 1 + i];
		}
		int li, ri, ai;
		li = 0; // left index
		ri = 0; // right index
		ai = l; // array index
		while (li < n1 && ri < n2) {
			if (left[li] <= right[ri]) // minimum element will be placed in sorted sub array
			{
				arr[ai] = left[li];
				ai++;
				li++;
			} else {
				arr[ai] = right[ri];
				ai++;
				ri++;
			}
		}
		while (li < n1) // copy remaining elements of left sub array into the merged array
		{
			arr[ai] = left[li];
			ai++;
			li++;
		}
		while (ri < n2) // copy remaining elements of right sub array into the merged array
		{
			arr[ai] = right[ri];
			ai++;
			ri++;
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
