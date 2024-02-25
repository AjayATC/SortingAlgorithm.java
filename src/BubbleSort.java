public class BubbleSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 7, 3, 2, 4, 8};

        //bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}