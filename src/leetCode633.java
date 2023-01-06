/**
 * @author andorFive
 * @date 2023/1/6
 */
public class leetCode633 {
    public static void main(String[] args) {
        //1 2 3 4 5
        judgeSquareSum(2147483600);
    }

    public static boolean judgeSquareSum(int c) {
        long former = 0;
        long tail = (long) Math.sqrt(c);
        while (former <= tail) {
            if (former * former + tail * tail == c){
                System.out.println("t");
                return true;
            }
            if(former * former + tail * tail > c){
                tail--;
            }
            if(former * former + tail * tail < c){
                former++;
            }
        }
        System.out.println("f");
        return false;
    }
}
