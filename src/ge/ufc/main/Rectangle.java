package ge.ufc.main;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private static double maxLength;
    private static double maxWidth;

    static {
        maxLength = 10;
        maxWidth = 15;
    }

    public Rectangle() {
        this(3, 4);
    }

    public Rectangle(double length, double width) {
        super("But here comes Sebastian Vettel !");
        this.length = length;
        this.width = width;
    }

    public static Rectangle maxArea(Rectangle[] rectangles) {
        Rectangle maxAreaRect = new Rectangle();

        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[i].area() > maxAreaRect.area()) {
                maxAreaRect = rectangles[i];
            }
        }

        return maxAreaRect;
    }

    @Override
    protected double perimeter() {
        return 2 * (length + width);
    }

    protected double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    @Override
    protected double area() {
        return length * width;
    }

    protected double area(double length, double width) {
        return length * width;
    }

    public void setLength(double length) {
        if (length <= maxLength) {
            this.length = length;
        } else {
            this.length = maxLength;
        }
    }

    public void setWidth(double width) {
        if (width <= maxWidth) {
            this.width = width;
        } else {
            this.width = maxWidth;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int moreThan(Rectangle other) {
        return (int) Math.signum(this.area() - other.area());
    }
}

