class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            int val = extractNum(s);
            System.out.print(val);
            if(!st.isEmpty() && s.equals("+") ){
                int a = st.pop();
                int b = st.pop();
                st.push(a + b);
            }else if(!st.isEmpty() && s.equals("-") ){
                int a = st.pop();
                int b = st.pop();
                st.push(b-a);
            }else if(!st.isEmpty() && s.equals("*") ){
                int a = st.pop();
                int b = st.pop();
                st.push(a * b);
            }else if(!st.isEmpty() && s.equals("/") ){
                int a = st.pop();
                int b = st.pop();
                st.push(Math.round(b / a));
            }
            if(val != Integer.MIN_VALUE) st.push(val);
        }

        return st.pop();
    }

    public int extractNum(String s){

        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            return Integer.MIN_VALUE;
        }

        int res = 0;
        int sign = 1;
        int i = 0;

        if(s.charAt(0) == '-'){
            sign = -1;
            i=1;
        }
        for(;i<s.length();i++){
            char c = s.charAt(i);
            res = res * 10 + (c-'0');
        }
        return res * sign;
    }
}
