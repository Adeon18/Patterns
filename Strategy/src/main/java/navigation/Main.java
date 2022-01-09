package navigation;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setRouteStrategy(new RoadStrategy());
        navigator.buildRoute(new Point(0, 0), new Point(3, 4));

        navigator.setRouteStrategy(new PublicTransportStrategy());
        navigator.buildRoute(new Point(0, 0), new Point(3, 4));

        navigator.setRouteStrategy(new WalkingStrategy());
        navigator.buildRoute(new Point(0, 0), new Point(3, 4));
    }
}
