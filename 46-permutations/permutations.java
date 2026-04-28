class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        boolean[] marked = new boolean[nums.length];

        List<Integer> ds = new ArrayList<>();
        permution(nums,ds,ans,marked);
        
        return ans;
    }

    public void permution(int[] nums,List<Integer> ds,List<List<Integer>> ans,boolean[]marked){
        if(ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(!marked[i]){
                marked[i]= true;
                ds.add(nums[i]);
                permution(nums,ds,ans,marked);
                ds.remove(ds.size()-1);
                marked[i]= false;
            }
        }
    }

}