class Rectangle implements GeometricFigure {
    private double side1;
    private double side2;

    Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSquare() {
        return side1 * side2;
    };
    public double getPerimeter() {
        return side1 * 2 + side2 * 2;
    };

    public String backgroundColour() {
        return "Red";
    }

    public String boundaryColour() {
        return "Gray";
    }
}
