class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int k =coins;
        int count =0;


        for(int i =0; i<costs.length;i++){
            if(costs[i]<=k){
                count++;
                k = k-costs[i];
            }
        }
        return count;
        
    }
}