package entities;

import enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private double height;

    public Rectangle(){
        super();
    }

    public Rectangle(Color color, Double widith, double height) {
        super(color);
        this.width = widith;
        this.height = height;
    }

    public Double getWidith() {
        return width;
    }

    public void setWidith(Double widith) {
        this.width = widith;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
