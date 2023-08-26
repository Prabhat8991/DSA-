package phase1.arrays;

import java.util.HashMap;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 */
public class ArrayRomanToInteger {
    public static void main(String[] args) {
        System.out.print(romanToInt("MDCXCV"));
    }

    public static int romanToInt(String s) {
        char [] romanArray = s.toCharArray();
        HashMap<Character, Integer> romanMapping = new HashMap<>() ;
        romanMapping.put('I', 1);
        romanMapping.put('V', 5);
        romanMapping.put('X', 10);
        romanMapping.put('L', 50);
        romanMapping.put('C', 100);
        romanMapping.put('D', 500);
        romanMapping.put('M', 1000);

        int result = 0;
        if (romanArray.length == 1) {
            result+=romanMapping.get(romanArray[0]);
            return result;
        }
      for (int i = 0; i < romanArray.length; i++ ) {
          if (i < romanArray.length-1) {
              if (romanArray[i] == 'I' && romanArray[i + 1] == 'V') {
                  result += 4;
                  i += 1;
                  continue;
              } else if (romanArray[i] == 'I' && romanArray[i + 1] == 'X') {
                  result += 9;
                  i += 1;
                  continue;
              } else if (romanArray[i] == 'X' && romanArray[i + 1] == 'L') {
                  result += 40;
                  i += 1;
                  continue;
              } else if (romanArray[i] == 'X' && romanArray[i + 1] == 'C') {
                  result += 90;
                  i += 1;
                  continue;
              } else if (romanArray[i] == 'C' && romanArray[i + 1] == 'D') {
                  result += 400;
                  i += 1;
                  continue;
              } else if (romanArray[i] == 'C' && romanArray[i + 1] == 'M') {
                  result += 900;
                  i += 1;
                  continue;
              }
          }
          result+=romanMapping.get(romanArray[i]);

      }
        return result;
    }
}
