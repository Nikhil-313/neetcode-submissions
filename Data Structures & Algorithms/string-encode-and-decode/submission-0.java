class Solution {

    public String encode(List<String> strs) {
        if(strs==null || strs.isEmpty()){
            return "";
        }
        StringBuilder encode=new StringBuilder();
        for(String str:strs){
            encode.append(str.length()).append('#').append(str);
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> decode=new ArrayList<>();
        if(str==null || str.isEmpty()){
            return decode;
        }
        int i=0;
        while(i<str.length()){
            int ds=str.indexOf('#',i);
            int length=Integer.parseInt(str.substring(i,ds));
            i=ds+1;
            String s=str.substring(i,i+length);
            decode.add(s);
            i+=length;
        }
        return decode;

    }
}
