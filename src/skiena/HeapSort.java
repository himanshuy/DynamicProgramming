package skiena;

import util.ArrayUtil;

public class HeapSort {

	private static int heapSize;
	private static int max_size = 64;
	private static int[] heap = new int[n-1];

	public static void main(String[] args) {
		int[] arr = {20, 19 ,25, 3};
		heapSort(arr);
		ArrayUtil.printArray(heap);
	}
	public static void heapSort(int[] a) {
		n = a.length;
		makeHeap(a);
		
	}

	private static int parent(int i) {
		return (i-1)/2;
	}
	private static void makeHeap(int[] a) {
		heap = a;
		for(int i=parent(a.length-1); i>=0; i--) {
			bubbleDown(i);
		}
	}

	private static void bubbleDown(int i) {
		int maxIndex =i;
		int left = 2*i+1;
		int right = 2*i+2;
		
		if(left <= n && heap[left] > heap[maxIndex]) {
			maxIndex = left;
		}
		
		if(right <= n && heap[right] > heap[maxIndex]) {
			maxIndex = right;
		}
		
		if(maxIndex != i) {
			swap(i, maxIndex);
			bubbleDown(maxIndex);
		}
	}

	private static void swap(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
		
	}
}
