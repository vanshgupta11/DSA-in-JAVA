

public class EvenDigitInArray {
    public static void main(String[] args) {
        int arr[] = {1,12,14,154,1520,346578};
        System.out.println(digits(arr));
    }
    static int digits(int[]arr){
        
        int countIndex = 0;
        for(int i = 0;i <arr.length;i++){
            int num = arr[i];
            int count = 0;
            while(num >0){
                count++;
                num = num/10;
            }
            if(count % 2 == 0){
                countIndex++;
            }
        }
        return countIndex;
    }
}
