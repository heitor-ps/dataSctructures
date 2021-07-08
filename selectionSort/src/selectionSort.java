import java.util.Arrays;

public class selectionSort {
    void selection(int[] vector){
        int n = vector.length;
        int i=0, j=0;
        int[] sorted = new int[n];

        while (j<n && i<n-1){
            if(vector[i]<vector[i+1]){
                sorted[j] = vector[i];
                i++;
                j++;
            }else {
                sorted[j] = vector[i+1];
                i++;
                j++;
            }
       }

        for (int k = 0; k<n-1;k++){
            vector[k] = sorted[k];
        }

    }

    void printer(int[] vector){
        int n = vector.length;
        for (int i = 0; i < n;i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,4,1,6,8};
        selectionSort ss = new selectionSort();

        ss.selection(arr);
        ss.printer(arr);
    }
}
