package valid;

public class CheckValidParenthesis {
	public boolean checkValidString(String s) {
        int high = 0;
        
        int low = 0;
        
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) == '('){
                low++;
                high++;
            } else if (s.charAt(j) == ')'){
                if(low > 0){
                    low--;
                }
                
                high--;
            } else{
                if(low > 0){
                    low--;
                }
                high++;
            }
            if(high < 0){
                return false;
            }
        }
        return low == 0;
    }
}
