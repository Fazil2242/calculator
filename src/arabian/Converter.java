package arabian;

import java.util.TreeMap;

 public class Converter {
     TreeMap<Character, Integer> romanKeyMap = new TreeMap<>();


     public Converter() {
         Integer v = romanKeyMap.put('V', 5);
         Integer x = romanKeyMap.put('X', 10);
         Integer l = romanKeyMap.put('L', 50);
         Integer c = romanKeyMap.put('C', 100);
         Integer d = romanKeyMap.put('D', 500);
         Integer m = romanKeyMap.put('M', 1000);


     }

    public boolean isRoman(String number){
        //"V"->'V'
        boolean b;
        if (romanKeyMap.containsKey(number.charAt(0))) {
            b = true;
        } else {
            b = false;
        }
        boolean b1 = b;
        return b1;
    }



}
