package geometry;

public class XMLExportVisitor implements Visitor{
    @Override
    public void visitDot(Dot dot) {
        dot.draw();
        dot.move(0, 0);
        System.out.println("Insert converting dot to XML or something...");
    }

    @Override
    public void visitCircle(Circle circle) {
        circle.draw();
        circle.move(1, 1);
        System.out.println("Insert converting circle to XML or something...");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        rectangle.draw();
        rectangle.move(-1, 1);
        System.out.println("Insert converting rect to XML or something...");
    }

    @Override
    public void visitCompoundShape(CompoundShape compoundShape) {
        compoundShape.draw();
        compoundShape.move(-1, -1);
        System.out.println("Insert converting this shit to XML or something...");
    }
}
