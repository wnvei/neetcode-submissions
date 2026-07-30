class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sSorted = new String(charArray);
            res.putIfAbsent(sSorted, new ArrayList<>());
            res.get(sSorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
