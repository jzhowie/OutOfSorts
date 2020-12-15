//TODO: exit early in sort
//ISSUES: TBD

public class Sorts {
/**Bubble sort of an int array.
 * Upon completion, the elements of the array will be in increasing order.
 *@param data  the elements to be sorted.
 */

public static void bubbleSort(int[] data) {
	for (int n = 0; n < data.length; n++) {
		for (int i = 0; i < data.length - n - 1; i++) {
			if (data[i] > data[i+1]) {
				int temp = data[i+1];
				data[i+1] = data[i];
				data[i] = temp;
			}
		}
	}
	return;
}
}
