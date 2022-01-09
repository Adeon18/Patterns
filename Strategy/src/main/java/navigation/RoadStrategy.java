package navigation;

public class RoadStrategy implements RouteStrategy{
    private double routeLength = 0;
    @Override
    public void buildRoute(Point from, Point to) {
        routeLength = from.distanceToOtherPoint(to);
        System.out.printf("The route of length %.2f km was built. Drive there.\n", routeLength);
    }

    @Override
    public double calculateTime() {
        return routeLength * 5;
    }
}
