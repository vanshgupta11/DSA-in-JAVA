public class ArrayLR {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length ;
        int i = 0;
        leftToRight(arr, n, i);

    }
    static void leftToRight(int[] arr ,int n,int i){
        if(i>= n){
            return;
        }
        System.out.println(arr[i]);
        leftToRight(arr, n, i +1);
    }
}
