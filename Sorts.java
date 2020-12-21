//TODO:
//ISSUES: TBD
import java.util.*;
public class Sorts {

public static void bubbleSort(int[] data) {
	for (int n = 0; n < data.length; n++) {
		Boolean noSwap = true;
		for (int i = 0; i < data.length - n - 1; i++) {
			if (data[i] > data[i+1]) {
				int temp = data[i+1];
				data[i+1] = data[i];
				data[i] = temp;
				noSwap = false;
			}
		}
		if (noSwap == true) {
			return;
		}
	}
	return;
}

public static void selectionSort(int[] data) {
	for (int n = 0; n < data.length; n++) {
		int least = n;
		for (int i = n; i < data.length; i++) {
			if (data[i] < data[least]) {
				least = i;
			}
		}
		int temp = data[n];
		data[n] = data[least];
		data[least] = temp;
	}
	return;
}

public static void insertionSort(int[] data) {
	for (int n = 1; n < data.length; n++) {
		if (data[n] < data[n-1]) {
			for (int k = 0; k < n; k++) {
				if ((k == 0 || data[n] > data[k-1]) && data[n] <= data[k]) {
					int index = k;
					int temp = data[n];
					for (int i = n - 1; i >= index; i--) {
						data[i+1] = data[i];
					}
					data[index] = temp;
				}
			}
		}
	}
	return;
}
}
