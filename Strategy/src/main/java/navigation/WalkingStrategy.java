package navigation;

public class WalkingStrategy implements RouteStrategy{
    private double routeLength = 0;
    @Override
    public void buildRoute(Point from, Point to) {
        routeLength = from.distanceToOtherPoint(to) * 0.5;
        System.out.printf("The route of length %.2f km was built. Walk there.\n", routeLength);
    }

    @Override
    public double calculateTime() {
        return routeLength * 15;
    }
}
