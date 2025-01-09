class Circle implements GeometricFigure {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    };
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    };

    public String backgroundColour() {
        return "Green";
    }

    public String boundaryColour() {
        return "Brown";
    }
}
