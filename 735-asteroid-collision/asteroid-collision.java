class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ast : asteroids){
           boolean des = false;
           while(!st.isEmpty() && st.peek() >0 && ast <0){
            if(st.peek() < -ast){
                st.pop();
                continue;
            }else if(st.peek() == -ast){
                st.pop();
            }
            des = true; 
            break;
           }
           if(!des){
            st.push(ast);
           }
        }
       
        int[] k = new int[st.size()];
        for(int i =k.length-1; i>=0; i--){
            k[i] = st.pop();
        }
        
        return k;
        
    }
}