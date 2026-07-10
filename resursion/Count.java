public class Count {
    public static void main(String[] args) {
        int[] arr = {10,20,10,50,10,10};
        int n = arr.length;
        int i = 0;
        int count = 0;
        int target = 10;
        countElement(arr,n,i,count,target);
    }
    static void countElement(int[] arr , int n, int i,int count,int target){
            if(i>=n){
                System.out.println(count);
                return;
            }
            if(arr[i] == target){
                count++;
            }
            countElement(arr, n, i+1, count, target);
        }
}
