package Medium;

/**
 * @Description:
 * @Author: J.Y.Zhang
 * @Date: 2018/2/17
 */
public class LongestSubstring3 {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            String sub = "";
            int count = 0;
            for (int j = i; j < s.length(); j++){
                if(isRepeat(String.valueOf(s.charAt(j)),sub)){
                    sub += s.charAt(j);
                    count++;
                }else{
                    break;
                }
            }
            if (result < count){
                result = count;
            }
        }
        return result;
    }

    public static boolean isRepeat(String c, String substring){
        if(substring.contains(c)){
            return  false;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("a"));
    }


}
