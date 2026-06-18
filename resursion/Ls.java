public class Ls {
    
    public static void main(String[] args) {
        int[] arr ={1,5,3,4,5};
        System.out.println(ls(arr,0,4));
    }
    static int ls(int[] arr , int index,int target){
        if(index == arr.length -1 && arr[index] != target){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return ls(arr,index+1,target);
    }
}

