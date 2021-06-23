package br.com.vinicio.model;

public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSquare(){
        return Math.pow(this.width, 2);
    }
}
