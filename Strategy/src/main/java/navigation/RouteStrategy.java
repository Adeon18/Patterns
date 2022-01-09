package navigation;

public interface RouteStrategy {
    void buildRoute(Point from, Point to);
    double calculateTime();
}
