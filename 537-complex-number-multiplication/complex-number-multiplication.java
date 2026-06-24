class Solution {
    public String complexNumberMultiply(String num1, String num2) {

     
        

    
        int plus = num1.indexOf('+');

        
        String real1 = num1.substring(0, plus);
        String img1 = num1.substring(plus + 1, num1.length() - 1);

        int plus2 = num2.indexOf('+');
        String real2 = num2.substring(0, plus2);
        String img2 = num2.substring(plus2 + 1, num2.length() - 1);


        int a = Integer.parseInt(real1);
        int b = Integer.parseInt(img1);

        int x = Integer.parseInt(real2);
        int y = Integer.parseInt(img2);

        int real = (a*x)-(b*y);
        int img = (b*x)+(a*y);

        String ans = real + "+" +img+"i";

        return ans;



        
    }
}