package geometry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Visitor xmlExportVisitor = new XMLExportVisitor();

        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle());
        shapeList.add(new Dot());
        shapeList.add(new Rectangle());
        shapeList.add(new Dot());
        shapeList.add(new CompoundShape());

        for (Shape shape: shapeList) {
            shape.accept(xmlExportVisitor);
        }
    }
}
