public class SelectionSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,4,9,7,8,3};

        //selection sort
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int smallest = i;
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }

                //swap
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
                }
        }
        printArray(arr);
    }
}