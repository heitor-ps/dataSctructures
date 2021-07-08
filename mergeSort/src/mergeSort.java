public class mergeSort {
    void merge(int[] vector, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        //Arrays de operação
        int[] L = new int[n1];
        int[] R = new int[n2];

        //copiando dados para o array
        for (int i = 0; i < n1; i++){
            L[i] = vector[left + i];
        }
        for (int j = 0; j < n2; j++){
            R[j] = vector[mid+1+j];
        }

        //ponteiros
        int i = 0, j = 0;
        int k = left;

        //mergeando
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                vector[k] = L[i];
                i++;
            }else{
                vector[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            vector[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){
            vector[k] = R[j];
            j++;
            k++;
        }

    }

    void sort(int[] vector, int left, int right){
        if (left < right){
            int mid = left + (right-left)/2;
            sort(vector,left,mid);
            sort(vector,mid+1,right);
            merge(vector,left,mid,right);
        }
    }

    static void printArray(int[] vector){
        int n = vector.length;

        for (int i = 0; i < n; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vector = {12,11,13,5,6,7};
        System.out.println("Array recebido");
        printArray(vector);

        mergeSort mg = new mergeSort();
        mg.sort(vector,0,vector.length - 1);
        System.out.println("\nArray arrumado");
        printArray(vector);
    }
}