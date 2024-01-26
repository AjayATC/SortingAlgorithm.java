public class MergeSort {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void conquer(int arr[], int left[], int right[]){
        int l = left.length;
        int r = right.length;
        int i = 0;      //left array
        int j = 0;      //right array
        int k = 0;      //arr

        while(i<l && j<r){
            if(left[i]<= right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while(i<l){
            arr[k] = left[i];
            k++;
            i++;
        }

        while(j<r){
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    public static void divide(int arr[]){
        int n= arr.length;
        if(n<=1){
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0; i<mid; i++){
            left[i] = arr[i];
        }

        for(int i=mid; i<n ; i++){
            right[i-mid] = arr[i];
        }

        divide(left);
        divide(right);
        conquer(arr,left,right);
    }

    public static void main(String[] args) {
        int arr[]={5,9,7,3,2,4,8};
        divide(arr);
        printArray(arr);
    }
}
