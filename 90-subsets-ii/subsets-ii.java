class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        find(0,nums,new ArrayList<>(),ans);
        return ans;
        
    }
    public void find(int k, int[]num, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        for(int i =k;i<num.length;i++){
            if(i !=k && num[i]==num[i-1]) continue;
            //check the uniqueness 
            ds.add(num[i]);
            find(i+1,num,ds,ans);
            ds.remove(ds.size()-1);


        }
    }
}