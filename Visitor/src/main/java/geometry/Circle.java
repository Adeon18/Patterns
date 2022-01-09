package geometry;

public class Circle implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.printf("Moved Circle to (%d, %d)\n", x, y);
    }

    @Override
    public void draw() {
        System.out.println("The circle was drawn");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
