//Maximum Sum Sub Array
public class Kadane {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		findMaxSubArray(intArr);
	}

	public static void findMaxSubArray(int[] inputArray) {

		int maxStartIndex = 0;
		int maxEndIndex = 0;
		int maxSum = Integer.MIN_VALUE;

		int cumulativeSum = 0;
		int maxStartIndexUntilNow = 0;

		for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {

			int eachArrayItem = inputArray[currentIndex];

			cumulativeSum += eachArrayItem;

			if (cumulativeSum > maxSum) {
				maxSum = cumulativeSum;
				maxStartIndex = maxStartIndexUntilNow;
				maxEndIndex = currentIndex;
			} else if (cumulativeSum < 0) {
				maxStartIndexUntilNow = currentIndex + 1;
				cumulativeSum = 0;
			}
		}

		System.out.println("Max sum         : " + maxSum);
		System.out.println("Max start index : " + maxStartIndex);
		System.out.println("Max end index   : " + maxEndIndex);
	}
}