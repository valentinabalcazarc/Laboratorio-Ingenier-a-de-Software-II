package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author valeb
 */
public class testSquare {
    
    public testSquare() {
    }
    
    @Test
    public void testPerimeter(){
        System.out.println("calculate Perimeter");
        Square square = new Square(1);
        double expResult = 1*4;
        double result = square.calculatePerimeter();
        assertEquals(expResult, result, 0.01);
    }
    
    @Test
    public void testArea(){
        System.out.println("calculate Area");
        Square square = new Square(1);
        double expResult = 1;
        double result = square.calculateArea();
        assertEquals(expResult, result, 0.01);
    }
}
