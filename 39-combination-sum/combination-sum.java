class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findcombi(0,candidates,target,ans, new ArrayList<>());

        return ans;
        
    }
    private void findcombi(int ind,int[] can, int tar, List<List<Integer>> ans, List<Integer> ds){
        
        if(ind == can.length){
        if(tar == 0 ){
            ans.add(new ArrayList<>(ds));

        }
        return ;
        }
        if(can[ind]<=tar){
            ds.add(can[ind]);
            findcombi(ind,can,tar-can[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findcombi(ind+1,can,tar,ans,ds);
    }
}