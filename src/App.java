

public class App {
    public static void main(String[] args) throws Exception {
        // boolean result = isPalindrome("racecar");
		// String result = stringReversed("Julio");
		// String result = findbinary( 333,"");
		// int result = sumOfNumbers(5);


		//  int result = binarySearch([124,44,4]);
		//  long result = fibonacci(5);
		// 	System.out.println(result);

		// int[] data = new int[] { -5, 20, 10, 3, 2, 0 };
		// mergeSort(data, 0, data.length - 1);
		// System.out.println("Stop");



	

    }


	public static void mergeSort(int[] data, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(data, start, mid);
			mergeSort(data, mid + 1, end);
			merge(data, start, mid, end);
		}
	}
	
	public static void merge( int[] data, int start, int mid, int end) {
		// build  temp array to not modifie original content

		int[] temp = new int[end - start + 1];
		int i = start, j = mid + 1, k = 0;

		while (i <= mid && j <= end) {
			if (data[i] <= data[j]) {
				temp[k++] = data[i++];
			} else {
				temp[k++] = data[j++];
			}
		}

		// Add res value  left
		while (i <= mid) {
			temp[k] = data[i];
			k++; i++;
		}

		// Add res value  rigth
		while (j <= end) {
			temp[k] = data[j];
			k++; j++;
		}

		for (i = start; i <= end; i++) {
			data[i] = temp[i - start];
		}

	}


	public static long fibonacci(long n) {
		if ((n == 0)  || (n == 1)) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}

	public static int binarySearch(int[] A, int left, int right, int x) {

		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 1;

		if(x == A[mid]) {
			return mid;
		}

		if(x< A[mid]) {
			return binarySearch(A, left, right, x);
		}

		return binarySearch(A, mid +1, right, x);

	}

	public static int sumOfNumbers (int input){
		if (input <= 1) {
			return input;
		}
		return input + sumOfNumbers(input - 1);
	}

	public static String findbinary ( int decimal,  String result){
		// 233 / 2 =  116  rem 1
		// 116 / 2 = 58  rem 0
		// 58 / 2 = 29 rem 1
	
		if (decimal == 0) {
			return result;
		}
	
		result = decimal % 2 + result;
		return findbinary(decimal / 2, result);
	}
	


    public static String stringReversed ( String input){
        // Base case
        // pi piti travail map gen poum fe
        // tankou pi piti bagay pou m retounen

        // -- Empty string
        // julio.charAt(0) - J
        // julio.substr(0) - 'ulio'
        if (input.equals("")) {
            return "";
        }

	    return stringReversed(input.substring(1)) + input.charAt(0);
    }

    public static boolean isPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }
        return false;
    }
    
}


