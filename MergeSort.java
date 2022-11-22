import java.util.*;

public class MergeSort {
    static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("~~How many number in your array?: ~~");
        String siz = inp.nextLine();
        int size = Integer.parseInt(siz);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = inp.nextInt();
            arr[i] = num;
        }
        showArr(arr);
        MergeSort mS = new MergeSort();
        mS.sort(arr, 0, arr.length - 1);
        showArr(arr);
    }

    static void showArr(int[] arr){
        int n = arr.length;
        System.out.println("The list of numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("");
    }

    void sort(int[] arr, int l, int r)
    {
        if (l < r) {
        
            int m = l + (r - l) / 2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
    void merge(int[] arr, int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;
 

        int[] L= new int[n1];
        int[] R = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 

    
    
}
