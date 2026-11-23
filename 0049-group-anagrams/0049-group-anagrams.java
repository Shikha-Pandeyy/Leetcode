class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> list = new LinkedList<>();

        for(int i=0; i<strs.length; i++){

            char[] stt = strs[i].toCharArray();
            Arrays.sort(stt);
            String st = new String(stt);

            if(map.containsKey(st)){
                map.get(st).add(strs[i]);
            }else{
                List<String> list2 = new LinkedList<>();
                list2.add(strs[i]);
                map.put(st, list2);
            }
        }

        for(String key : map.keySet()){
            list.add(map.get(key));
        }
        return list;
        
    }
}