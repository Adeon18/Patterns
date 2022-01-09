package navigation;

public class Point{
    private int xCoordinate;
    private int yCoordinate;

    public Point() {
    }

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double distanceToOtherPoint(Point other) {
        return Math.sqrt(Math.pow(other.xCoordinate - this.xCoordinate, 2) + Math.pow(other.yCoordinate - this.xCoordinate, 2));
    }
}
