package co.unicauca.figures.domain;

public class Triangle implements Figure {
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double calculatePerimeter() {
        return side*3; 
    }

    @Override
    public double calculateArea() {
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow((side/2), 2));
        return (side*height)/2;
    }
}
