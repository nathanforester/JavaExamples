class TestClass { 
public int array[];
    public int length;
    public void sort(int[] inputArr) {
      if (inputArr == null || inputArr.length == 0) {
        return;
      }
      this.array = inputArr;
      length = inputArr.length;
      quickSort(0, length - 1);
     }
    public void quickSort(int lowerIndex, int higherIndex) {
     int i = lowerIndex;
     int j = higherIndex;
     int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
       while (i <= j) {
         while (array[i] < pivot) {
           i++;
         }
         while (array[j] > pivot) {
           j--;
         }
         if (i <= j) {
           exchangeNumbers(i, j);
           i++;
           j--;
         }
       }
       if (lowerIndex < j)
         quickSort(lowerIndex, j);
       if (i < higherIndex) 
         quickSort(i, higherIndex);
    }
    public int exchangeNumbers(int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
      while (temp > Integer.MAX_VALUE) {
      break;
    }
      return temp;
    }
	public static void main(String args[]) throws Exception { 
        int K = Integer.parseInt(args[0]);
		int myArray[] = FastRead.FastReadArray(args[1]);
		Stopwatch st = new Stopwatch();
		int n = myArray.length; 
        TestClass ob = new TestClass(); 
		ob.sort(myArray);
		int[] A = new int [K];
		int[] B = new int [K];
		 for (int i = 0; i < K; i++) {
		    A[i] = myArray[i]; 
         }
         for (int i = n-1; i > n-K-1; i--) {
            B[n-1-i] = myArray[i];
       }
        System.out.println(xorsum(A, B));
        double time = st.elapsedTime();System.err.println("Elapsed Time: "+time+" s");
	}
    public static int xorsum(int[] A, int[] B) {
      int[] N = A;
      int[] M = B;
      int sum = 0;
        for (int i = 0; i < N.length; i++) {
          sum = sum ^ A[i];
        }
        for (int i = 0; i < M.length; i++) {
        sum = sum ^ B[i];
        }
      return sum;
    }
}


