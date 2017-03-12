package triangle;

public class triangles {
	
    public static String triangles(int a,int b,int c){
    	
    	if(a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
    		
    		return "Not a triangle";
    	
    	else {
    	    
    		if(a == b && a == c)
    			return "equilateral";
    		
    		else if(a == b || b == c || a == c)
    	        return "isosceles";
    		
    	    else
    	        return "scalene";
    		
    	}
    }
}
