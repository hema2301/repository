package com.stackroute.pe4;
import java.util.HashSet;
import java.util.Set;
public class Unique {
   public static final int CHAR_RANGE = 128;
   public String twoUniqueCharacters(String str, int k) {
       int end = 0, begin = 0;
       Set<Character> st = new HashSet<Character>();
       int[] freq = new int[CHAR_RANGE];
       for (int low = 0, high = 0; high < str.length(); high++)  {
           st.add(str.charAt(high));
           freq[str.charAt(high)]++;
           while (st.size() > k)  {
               if (--freq[str.charAt(low)] == 0)
               {
                   st.remove(str.charAt(low));
               }
               low++;       
           }
           if (end - begin < high - low)
           {
               end = high;
               begin = low;
           }
       }
       return str.substring(begin, end + 1);
   }
}