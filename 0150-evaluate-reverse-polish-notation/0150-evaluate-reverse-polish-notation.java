class Solution {
    public int evalRPN(String[] tokens) {

        if( tokens.length == 1 ) return Integer.valueOf( tokens[0] );
        
        Stack<Integer> s = new Stack<>();

        int ans = 0;

        int op1 = 0;

        int op2 = 0;

        for( String str : tokens ){

            if( Character.isDigit( str.charAt(0) ) || str.length() > 1 ){
                s.push( Integer.parseInt( str ) );
            }
            else{


                if( !s.isEmpty() ){
                    op2 = s.pop();
                }
                if( !s.isEmpty() ){
                    op1 = s.pop();
                }

                if( str.equals("+") ) ans = op1 + op2;
                else if( str.equals("-") ) ans = op1 - op2;
                else if( str.equals("*") ) ans = op1 * op2;
                else if( str.equals("/") && op2 != 0 ) ans = op1 / op2;
                s.push( ans );
            }
        }

    return s.pop();

    }
}