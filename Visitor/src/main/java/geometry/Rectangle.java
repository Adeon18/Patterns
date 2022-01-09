package geometry;

public class Rectangle implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.printf("Moved Rectangle to (%d, %d)\n", x, y);
    }

    @Override
    public void draw() {
        System.out.println("The rectangle was drawn");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
