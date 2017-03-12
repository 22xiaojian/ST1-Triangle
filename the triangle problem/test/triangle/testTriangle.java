package triangle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testTriangle {

    private int a;
    private int b;
    private int c;
    private String expected;

    
    public testTriangle(int a,int b, int c, String expected){
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected= expected;
        
        }
    
    @Parameters
    public static Collection<Object[]> getData(){
    	return Arrays.asList(new Object[][]{
    	
    		{-1, 1, 2, "Not a triangle"},
    		{3, 2, 5, "Not a triangle"},
    		{6, 6, 6, "equilateral"},
    		{2, 5, 5, "isosceles"},
    		{7, 8, 9, "scalene"}
    	
    	});
    }
    
    @Test
    public void test() {
    assertEquals(this.expected,triangles.triangles(a,b,c));
    }
    
}