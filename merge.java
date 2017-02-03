public class MyMergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
	int count;
 
    public static void main(String a[]){
         
      int[] inputArr = {4,1,0,2,3};
        MyMergeSort mms = new MyMergeSort();
        mms.sort(inputArr);
        System.out.print("Array = ");
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        count = doMergeSort(0, length - 1);
      System.out.println("Count = "+count);
    }
 
    private int doMergeSort(int lowerIndex, int higherIndex) {
      
      int c=0;   
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            c= doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            c+=doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            c+= mergeParts(lowerIndex, middle, higherIndex);        
          
        }
      return c;
		
    }
 
    private int mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
		int c=0;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
				c=c++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
		return c;
 
    }
}