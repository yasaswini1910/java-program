public class Arrays {
    void parameter(int arr[]){
        int z=0;
        for(int i : arr){
            z=z+i;
        }
        System.out.println("Sum of elements in array is "+z);
    }
    int[] returnArr(int arr[]){
        for(int i=0;i < arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Arrays a = new Arrays();
        a.parameter(arr);
            System.out.println("Squares of Array");

        for(int i : a.returnArr(arr)){
            System.out.println(i);
        }
    }
}