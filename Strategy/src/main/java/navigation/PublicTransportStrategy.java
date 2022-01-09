package navigation;

public class PublicTransportStrategy implements RouteStrategy{
    private double routeLength = 0;
    @Override
    public void buildRoute(Point from, Point to) {
        routeLength = from.distanceToOtherPoint(to) * 0.8;
        System.out.printf("The route of length %.2f km was built. Get on the bus.\n", routeLength);
    }

    @Override
    public double calculateTime() {
        return routeLength * 8;
    }
}
