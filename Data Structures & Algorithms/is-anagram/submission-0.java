class Solution {
    public static Map<Character, Integer> frequencyCount(String str){
        Map<Character,Integer> charcount=new HashMap<>();
        for(char c : str.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0)+1);
        }
        return charcount;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> smap=frequencyCount(s);
        Map<Character,Integer> tmap=frequencyCount(t);
        if(smap.equals(tmap)){
            return true;
        }
        else{
            return false;
        }
    }      
}
