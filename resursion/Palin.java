public class Palin {
    public static void main(String[] args) {
        String s = "abbbb";
        System.out.println(checkP(s,0, s.length() -1));
    }
    static boolean checkP(String s,int left,int right){
        if(left>= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return checkP(s,left+1,right-1);
    }
}
