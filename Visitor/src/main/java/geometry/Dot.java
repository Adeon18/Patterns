package geometry;

public class Dot implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.printf("Moved Dot to (%d, %d)\n", x, y);
    }

    @Override
    public void draw() {
        System.out.println("The dot was drawn");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
