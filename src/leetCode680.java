/**
 * @author andorFive
 * @date 2023/1/6
 */
public class leetCode680 {
    public static void main(String[] args) {
        new leetCode680().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
    }

    public boolean validPalindrome(String s) {
        //定义两个指针
        char[] chars = s.toCharArray();
        int former = 0, tail = s.length() - 1;
        //表示未进行删除操作
        int flag = 0;
        while (former <= tail) {
            //前后指针数值相同各进1
            if (chars[former] == chars[tail]) {
                former++;
                tail--;
            } else if (chars[former] != chars[tail] && flag == 0) {
                flag = 1;
                //指针数值不同
                //前指针
                boolean deleteFormer = delete(former + 1, tail, chars);
                //后指针
                boolean deleteTail = delete(former, tail - 1, chars);
                if (!deleteFormer && !deleteTail) {
                    return false;
                } else if (deleteFormer) {
                    former++;
                } else {
                    tail--;
                }
            } else {
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

    public boolean delete(int former, int tail, char[] chars) {
        if (chars[former] == chars[tail]) {
            return true;
        }
        return false;
    }
}
