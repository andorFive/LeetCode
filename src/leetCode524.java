import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author andorFive
 * @date 2023/1/12
 */
public class leetCode524 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("plea");
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        new leetCode524().findLongestWord("abpcplea", list);
    }

    public String findLongestWord(String s, List<String> dictionary) {
        //找到符合单词存入数组中
        //双指针查找单词
        char[] chars = s.toCharArray();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < dictionary.size(); i++) {
            int sPointer = 0;
            int dPointer = 0;
            char[] chars1 = dictionary.get(i).toCharArray();
            //双指针
            while (sPointer < s.length() - 1) {
                if (chars1[dPointer] != chars[sPointer]) {
                    sPointer++;
                } else {
                    dPointer++;
                    sPointer++;
                }
                //符合要求放入数组
                if (dPointer == chars1.length - 1) {
                    arrayList.add(dictionary.get(i));
                }
            }
        }

        for (String ss:arrayList){
            System.out.println(ss);
        }


        //通过数组找到最长的单词
        //有两个以上的单词查找字母序最小的字符串
        return null;
    }
}
