public interface GeometricFigure {
    public double getSquare();
    public double getPerimeter();
    default void infoGeometricFigure() {
        System.out.println("Figure: " + getClass());
        System.out.println("Square: " + String.format("%.2f", getSquare()));
        System.out.println("Perimeter: " + String.format("%.2f", getPerimeter()));
        System.out.println("Background colour: " + backgroundColour());
        System.out.println("Boundary colour: " + boundaryColour());
        System.out.println();
    };

    default String backgroundColour() {
        return "White";
    }
    default String boundaryColour() {
        return "Black";
    }
}
