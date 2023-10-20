class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int tot = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < tokens.length; i++) {
            int curr = 0;
            if (Character.isDigit(tokens[i].charAt(0)) || tokens[i].length() > 1) {
                st.push(tokens[i]);
            }
           
            else {
                switch (tokens[i]){
                    case "+":
                        one = Integer.parseInt(st.pop());
                        two = Integer.parseInt(st.pop());
                        curr = one + two;
                        st.push(String.valueOf(curr));
                        break;
                    case "-":
                        one = Integer.parseInt(st.pop());
                        two = Integer.parseInt(st.pop());
                        curr = two - one;
                        st.push(String.valueOf(curr));
                        break;
                    case "*":
                        one = Integer.parseInt(st.pop());
                        two = Integer.parseInt(st.pop());
                        curr = two * one;
                        st.push(String.valueOf(curr));
                        break;  
                    case "/":
                        one = Integer.parseInt(st.pop());
                        two = Integer.parseInt(st.pop());
                        curr = two/one;
                        st.push(String.valueOf(curr));
                        break;
                }
                    
            }
            
        }
        return Integer.parseInt(st.pop());
    }
}