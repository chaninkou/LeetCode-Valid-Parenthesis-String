package valid;

public class Main {
	public static void main(String[] args){
		String s = "(*)";
		
		System.out.println("Input: " + s);
		
		System.out.println("Solution: " + checkValidString(s));
		
	}
	
    public static boolean checkValidString(String s) {
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
