class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;

        int[][] arr = new int[n][2];

        for(int i =0;i<n;i++){
            for(int j =0;j<2;j++){
                if(j == 0){
                    arr[i][j]=score[i];
                }else
                arr[i][j]= i;

            }
        }
        Arrays.sort(arr,(a,b) -> Integer.compare(b[0],a[0]));

        String[] ans = new String[n];

        for(int i =0; i<n; i++){

            int k = arr[i][1];

            if(i == 0){
                ans[k]="Gold Medal";
            }else if(i ==1){
                ans[k]="Silver Medal";
            }else if(i ==2){
                ans[k]="Bronze Medal";
            }else
            ans[k]= String.valueOf(i+1);

        }
        return ans;
        
    }
}