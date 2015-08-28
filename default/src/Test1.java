import javafx.geometry.Point2D;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created with IntelliJ IDEA.
 * Date: 8/26/2015
 * Time: 3:04 PM
 * Goal: find rows in a grid of points. Handle rotation, noise and other systematic problems
 */
public class Test1 {
    public static void main(String[] args) {
        DataGenerator dg = new DataGenerator();
        Grid grid = dg.generatePerfectGrid();
        List<Point2D> xsortedPts = sortGridInX(grid);
    }
    public static List<Point2D> sortGridInX(Grid grid)
    {
        /**
         * Create a stream from the grid.
         * Find approx angle using points in a narrow x range
         * Sort grid by x
         * Sort grid by y
         * Find approx spacing???
         *
         */
        Stream<Point2D> stream = grid.getPoints().stream();
        Stream<Point2D> ptsInX = stream.sorted((o1, o2) -> (int) (o1.getX() - o2.getX()));

        Stream<Point2D> filteredStream = stream.filter(point2D -> point2D.getX() < 50);
        //filteredStream.map(Grid::rowKeyGen);// use map to turn pt into <K,V> where K == row id (or unrotated y)
        Map<Double, List<Point2D>> rows = filteredStream.collect(Collectors.groupingBy(Point2D::getY));// group into lists
        filteredStream.collect(Collectors.groupingBy(Grid::rowClassifier));// group into lists
        return ptsInX.collect(toList());
    }

}
