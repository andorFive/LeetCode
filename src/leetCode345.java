import java.nio.charset.StandardCharsets;

/**
 * @author andorFive
 * @date 2023/1/6
 */
public class leetCode345 {
    public static void main(String[] args) {
        new leetCode345().reverseVowels("aA");
    }

    public String reverseVowels(String s) {
        char[] bytes = s.toCharArray();
        int former = 0, tail = bytes.length - 1;
        char temp;
        while (former <tail) {
            //前指针为元音字母 后指针为元音字母 转换 同时+1
            //如果只有一个指针找到元音字母 另一个指针+1直到找到元音字母
            //所有转换为小写字母
            char aByte =  Character.toLowerCase(bytes[former]);
            char bByte = Character.toLowerCase(bytes[tail]);
            if (isVowel(aByte) && isVowel(bByte)) {
                temp = bytes[former];
                bytes[former] = bytes[tail];
                bytes[tail] = temp;
                former++;
                tail--;
            } else if (isVowel(aByte)) {
                //前指针找到元音字母
                tail--;
            } else if (isVowel(bByte)) {
                //后指针找到元音字母
                former++;
            } else {
                //都没有找到元音字母
                former++;
                tail--;
            }
        }
        System.out.println(String.valueOf(bytes));
        return String.valueOf(bytes);
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
