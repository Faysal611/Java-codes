public class triangle {
    private int width;
    private int height;

    public triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void area() {
        System.out.println("Area: " + (0.5 * width * height));
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (width + height));
    }
}
