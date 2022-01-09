package geometry;

public class CompoundShape implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.printf("Moved Compound Shape to (%d, %d)\n", x, y);
    }

    @Override
    public void draw() {
        System.out.println("The compound shape was drawn");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}
