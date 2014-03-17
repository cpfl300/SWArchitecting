package sorting;

public class QuickSort implements Sort {

	private int[] numbers;
	private int number;

	@Override
	public int[] doSorting(int[] inputArray) {
		System.out.println("====Quick Sort====");
		
		if (inputArray == null || inputArray.length == 0)
			return null;

		this.numbers = inputArray;
		this.number = inputArray.length;

		quickSort(0, number - 1);
		return numbers;
	}

	private void quickSort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];

		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(low, j);
		if (i < high)
			quickSort(i, high);

	}

	private void swap(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

}
