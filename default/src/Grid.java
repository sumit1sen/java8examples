import javafx.geometry.Point2D;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by ssen on 8/27/2015.
 * Container for a grid of points
 */
public class Grid {
    private final List<Point2D>  points;

    public Grid(List<Point2D> points) {
        this.points = points;
    }

    public List<Point2D> getPoints() {
        return Collections.unmodifiableList(points);
    }


    public static Map.Entry<Double, Point2D> rowKeyGen(Point2D point2D) {
        return new AbstractMap.SimpleEntry<>(point2D.getY(),point2D);
    }

    /**
     * TODO classifier can use y grid spacing to determine row. Need to determine an origin as well and pass that
     * TODO in to the classifier
     */
    public static double rowClassifier(Point2D p) {
        return p.getY();
    }
}
