public class specialCipher {
     public static char rotate(char c,int by){
         if(Character.isUpperCase(c)){
             return (char)((c-'A' + by)%26 + 'A');
         }else if(Character.isLowerCase(c)){
             return (char)((c-'a'+by)%26 + 'a');
         }
         return c;
     }
    public static String specialCipherFun(String s,int n) {
        StringBuilder ans = new StringBuilder();
        int count = 1,i = 0;
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(i) != s.charAt(j)) {
                ans.append(rotate(s.charAt(i), n));
                if (count > 1) ans.append(count);
                count = 1;
                i = j;
            } else {
                count++;
            }
        }
        ans.append(rotate(s.charAt(i), n));
        if (count > 1)ans.append(count);
        return ans.toString();
    }
 public static void main(String[] args) {
     String s = "AABCCC";
     System.out.println(specialCipherFun(s,3));
 }
    
}