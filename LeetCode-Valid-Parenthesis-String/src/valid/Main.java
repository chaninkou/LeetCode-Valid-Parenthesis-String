package valid;

public class Main {
	public static void main(String[] args){
		String s = "(*)";
		
		System.out.println("Input: " + s);
		
		CheckValidParenthesis solution = new CheckValidParenthesis();
		
		System.out.println("Solution: " + solution.checkValidString(s));
		
	}

}
