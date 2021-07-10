public class QuickSort {
    void swap(int[] vector, int i, int j){
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }

    int partition(int[] vector, int low, int high){
        int pivot = vector[high];
        int i = (low - 1);

        for(int j = low; j <= high; j++){
            if (vector[j]<pivot){
                i++;
                swap(vector,i,j);
            }
        }
        swap(vector,i+1,high);
        return (i+1);
    }

    void quickSort(int[] vector, int low, int high){
        if (low < high){
            int pi = partition(vector,low,high);
            quickSort(vector,low,pi-1);
            quickSort(vector,pi+1,high);
        }
    }

    void printer(int[] vector){
        int size = vector.length;
        for (int i = 0; i < size; i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vector = {23,24,25,1235,3,3,62,256,7,9,5,2};
        QuickSort qs = new QuickSort();
        System.out.print("\nReceived array: ");
        qs.printer(vector);
        qs.quickSort(vector,0,vector.length-1);
        System.out.print("\nResult: ");
        qs.printer(vector);
    }
}