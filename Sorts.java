//TODO:
//ISSUES: TBD

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
}
