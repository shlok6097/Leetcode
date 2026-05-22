class Solution {
    public String solveEquation(String equation) {
        
        String[] sides = equation.split("=");
        
      
        int[] lhs = evaluateSide(sides[0]);
        int[] rhs = evaluateSide(sides[1]);
        
      
        int totalX = lhs[0] - rhs[0];
        int totalConst = rhs[1] - lhs[1];
        
        if (totalX == 0) {
            if (totalConst == 0) {
                return "Infinite solutions";
            } else {
                return "No solution";
            }
        }
        
        return "x=" + (totalConst / totalX);
    }
    
    private int[] evaluateSide(String side) {
        int xCoeff = 0;
        int constant = 0;
        
       
        String[] tokens = side.split("(?=[+-])");
        
        for (String token : tokens) {
            if (token.isEmpty()) continue;
            
            if (token.contains("x")) {

                String coeffStr = token.replace("x", "");
                if (coeffStr.equals("") || coeffStr.equals("+")) {
                    xCoeff += 1;
                } else if (coeffStr.equals("-")) {
                    xCoeff -= 1;
                } else {
                    xCoeff += Integer.parseInt(coeffStr);
                }
            } else {
                
                constant += Integer.parseInt(token);
            }
        }
        
        return new int[]{xCoeff, constant};
    }
}