package Medium;

/**
 * @Description:
 * @Author: J.Y.Zhang
 * @Date: 2018/2/18
 */
public class LongestPalindromicSubstring5 {// bruce
    public static String longestPalindrome(String s) {
        String result = "";
        int maxlength = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = s.length() -1; j >= i; j--){
                int low = i;
                int high = j;
                int count = 0;
                while(low < high){
                    if( s.charAt(low) == s.charAt(high)){
                        low++;
                        high--;
                        count+=2;
                    }else {
                        count = 0;
                        high--;
                        low = i;
                    }
                }
                if (low == high){
                    count++;
                }
                if (maxlength < count){
                    maxlength = count;
                    result = s.substring(i,i+count);
                }
            }

        }
        System.out.println(result);
        return result;
    }

    public static void main(String args[]){
        longestPalindrome("babaddtattarrattatddetartrateedredividerb");
    }
}
