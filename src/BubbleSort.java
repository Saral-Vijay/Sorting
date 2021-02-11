public class BubbleSort
{  
    public static void main(String[] args) 
    {  
                int arr[]= {76,43,90,7,1};
                int n = arr.length;
                System.out.print("unsorted array");
                System.out.println();
                for (int i=0; i<n; ++i)
                    System.out.print(arr[i] + " ");
                System.out.println();
                for (int i = 0; i < n-1; i++)
                {
                    for (int j = 0; j < n-i-1; j++)
                    {
                        if (arr[j] > arr[j+1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
                System.out.print("Sorted array");
                System.out.println();
                for (int i=0; i<n; ++i)
                    System.out.print(arr[i] + " ");
   
      }  
}