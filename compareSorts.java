package sortPackage;

import java.util.*;


public class compareSorts {
	
	
	static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static Random rnd = new Random();
	final int len = 10;

	public String randomString(){
		
		StringBuilder sb = new StringBuilder(len);
		for(int i = 0; i < len; i++) 
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		    return sb.toString();
	}

	public String [] generateArray(){
		String[] randomArr= new String[len];
		for(int i = 0; i < randomArr.length; i++){
			randomArr[i]= randomString();
			
		}
		return randomArr;
	}
	
	public String[] mergeSort(String [] list) {
        if (list.length <= 1) {
            return list;
        }
        
        // Split the array in half
        String[] first = new String[list.length / 2];
        String[] second = new String[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // Sort each half
        mergeSort(first);
        mergeSort(second);
        
        // Merge the halves together, overwriting the original array
        merge(first, second, list);
        return list;
    }
	
	public  void merge(String[] first, String[] second, String [] result) {
		
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;
        
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareToIgnoreCase(second[iSecond]) > 0) {
                result[j] = first[iFirst];
                iFirst++;
                } else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
    }
	
	
	public static int [] generateIntArrray(int len){
		 int[] array = new int[len];
	        Random random = new Random();
	        for (int i = 0; i < len; i++) {
	            array[i] = random.nextInt(100000);
	        }
	        return array;
		
	}
	
	  public static void insertionSort(int[] a) {
	        int n = a.length;
	        for (int i = 0; i < n-1; i++) {
	            for (int j = i+1; j > 0; j--) {
	                if (a[j] > a[j-1]) {
	                    break;
	                }
	                swap(a, j-1, j);
	            }
	        }
	    }

	  private static void swap(int[] a, int i, int j) {
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	    }
	
	 public static void main(String[] args)throws Exception {
		 	compareSorts trigger = new compareSorts();
		 	String a [];
		 	a = trigger.generateArray();
		 	
		 	
		 	System.out.println("Values before Merge Sort : ");
		 	System.out.println(Arrays.toString(a));
		 	
		
	        
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println("Values after Merge Sort : ");
	       
	        System.out.println(Arrays.toString(trigger.mergeSort(a)));
	        
	        /*for (int j=0;j < a.length;j++) {
	            System.out.println(mergeSort(a[j]) + " ");
		 	*/
		 	
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println("Integer values after Insertion Sort : ");
	        System.out.println(Arrays.toString(insertionSort(generateIntArrray(100))));
	        
	 }

}

