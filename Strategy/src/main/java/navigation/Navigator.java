package navigation;

import lombok.Getter;
import lombok.Setter;

public class Navigator {
    @Getter @Setter
    private RouteStrategy routeStrategy;

    public void buildRoute(Point from, Point to) {
        routeStrategy.buildRoute(from, to);
        double time = routeStrategy.calculateTime();

        System.out.printf("The Estimated time is: %.2f Minutes\n", time);
    }
}
