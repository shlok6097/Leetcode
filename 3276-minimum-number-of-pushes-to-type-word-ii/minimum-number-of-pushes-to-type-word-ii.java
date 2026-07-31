class Solution {
    public int minimumPushes(String word) {
        
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);

        int push =0;
        for(int i = freq.length-1;i>=0;i--){
            if (freq[i]==0){
                break;
            }
            if(i>=18){
                push += freq[i] * 1;
            }else if(i>= 10 && i<18){
                push += freq[i] * 2;
            }else if(i>= 2 && i<10){
                push += freq[i]*3;
            }else {
                push += freq[i]*4;
            }
        }
        return push;
    }
}