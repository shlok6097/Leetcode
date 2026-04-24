class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          List<List<Integer>> ans = new ArrayList<>();
          Arrays.sort(candidates);
        findcombi(0,candidates,target,ans, new ArrayList<>());

        return ans;
    }

    private void findcombi(int ind,int[] can, int tar, List<List<Integer>> ans, List<Integer> ds){
        
        if(tar == 0 ){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i =ind; i<can.length;i++){
            if(i>ind && can[i]==can[i-1])continue;
            if(can[i]>tar)break;
            ds.add(can[i]);

            findcombi(i+1,can,tar-can[i],ans,ds);
            ds.remove(ds.size()-1);
        }
     
    }
}