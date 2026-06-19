public class Ls {
    
    public static void main(String[] args) {
        int[] arr ={1,5,3,4,5};
        System.out.println(ls(arr,0,4));
    }
    static int ls(int[] arr , int i,int target){
        if(i == arr.length -1 && arr[i] != target){
            return -1;
        }

        if(arr[i] == target){
            return i;
        }

        return ls(arr,i+1,target);
    }
}

