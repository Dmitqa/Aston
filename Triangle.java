class Triangle implements GeometricFigure {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSquare() {
        double x = getPerimeter() / 2;
        return Math.sqrt(x*(x-side1)*(x-side2)*(x-side3));
    };
    public double getPerimeter() {
        return side1 + side2 + side3;
    };

    public String backgroundColour() {
        return "Pink";
    }

    public String boundaryColour() {
        return "Yellow";
    }
}
