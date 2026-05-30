class Solution {
    public int lengthOfLastWord(String s) {
        
    //     int length = 0;
    //    // int i = s.length() - 1;

    //     String[] arr = s.trim().split("\\s+");

    //     String lastWord= arr[arr.length-1];

    //     for(int i =0; i<lastWord.length();i++){
    //         length++;
    //     }



        // Skip trailing spaces
        // while (i >= 0 && s.charAt(i) == ' ') {
        //     i--;
        // }

       
        // while (i >= 0 && s.charAt(i) != ' ') {
        //     length++;
        //     i--;
        // }

        String k = s.trim();

        int len = k.length()-1;

        int count =0;

        for(int i =len;i>=0;i--){
            char ch = k.charAt(i);
            if(ch==' ') break;
            count++;
        }
       

        return count;
    }
}