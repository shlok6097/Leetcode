class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();
        // boolean[] vis = new boolean[strs.length];

        // for(int i =0 ; i<strs.length;i++){
        //     if(vis[i]) continue;
        //     List<String> k = new ArrayList<>();
        //     k.add(strs[i]);
        //     vis[i] = true;
        //     for(int j = i+1; j<strs.length;j++){
        //         if(!vis[j] && isAnagram(strs[i] , strs[j])){
        //             k.add(strs[j]);
        //             vis[j] = true;
        //         }
        //     }
        //     ans.add(k);
        // }
        // return ans;


        Map<String , List<String>> map = new HashMap<>();

        for(String s : strs){
            int [] count = freq(s);
            String key = Arrays.toString(count);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }

    private boolean isAnagram(String w1, String w2){
        int [] fw1 = freq(w1);
        int[] fw2 = freq(w2);

        for(int i =0; i< 26 ;i++){
            if(fw1[i] != fw2[i]) return false;
        }
        return true;
    }

    private int[] freq(String w){
        int[] frw = new int[26];

      for(char ch :w.toCharArray()){
        frw[ch -'a']++;
      }
        return frw;
    }
}