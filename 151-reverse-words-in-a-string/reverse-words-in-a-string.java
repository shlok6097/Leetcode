class Solution {
    public String reverseWords(String s) {
      // s = s.trim();
        String[] arr = s.split("\\s+");
        // int i=0;
        // int j= arr.length-1;
        StringBuilder sb = new StringBuilder();
        // while(i<j){
        //     String temp = arr[i];
        //     arr[i]=arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;

        // }
        // for(int k =0; k<arr.length;k++){
        //   if(k > 0) sb.append(" ");
        //    sb.append(arr[k]);

        // }
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
}