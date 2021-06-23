package br.com.vinicio.model;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg){
        return this.getRadius() >= roundPeg.getRadius();
    }
}
