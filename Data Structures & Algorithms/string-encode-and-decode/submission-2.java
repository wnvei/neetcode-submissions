class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int hashIndex = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i,hashIndex));
            int start = hashIndex + 1;
            int end = start + length;

            res.add(str.substring(start,end));
            i = end; 
        }
        return res;
    }
}
