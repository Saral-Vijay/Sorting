
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {76,45,90,7,2};
		int n = arr.length;
		System.out.println("Unsorted array");
		System.out.println();
		for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " ");
		System.out.println();
        for (int i = 1; i < n; ++i)
        { 
            int key = arr[i]; 
            int j = i - 1;
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        }  
        System.out.println("Sorted array");
        System.out.println();
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " ");
	}

}
