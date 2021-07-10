public class selectionSort {
    void sorter(int[] vector){
        int size = vector.length;

        for (int i = 0; i < size-1; i++){
            int indexTarget = i;

            for (int j = i + 1; j < size;j++){
                if (vector[j] < vector[indexTarget]){
                    indexTarget = j;
                }
            }
            int aux = vector[indexTarget];
            vector[indexTarget] = vector[i];
            vector[i] = aux;
        }

    }
    void printer(int[] vector){
        int size = vector.length;

        for(int i = 0; i < size;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] vector = {64,25,12,22,11};

        selectionSort ss = new selectionSort();
        ss.sorter(vector);
        ss.printer(vector);
    }
}