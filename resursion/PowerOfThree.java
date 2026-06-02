
class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    static boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }
        if(n <= 0 || n%3 != 0 ){
            return false;
        }
        
        return isPowerOfThree(n/3);
    }
}