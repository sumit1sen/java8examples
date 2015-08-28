import javafx.geometry.Point2D;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Date: 8/27/2015
 * Time: 2:51 PM
 * This class is for generating test datasets that can be used by the java 8 examples
 */
public class DataGenerator {
    public Grid generatePerfectGrid() {

        return null;
    }

    public Grid generateRotatedGrid(double angleInDegrees) {

        return null;
    }

    public Grid addNoiseToGrid(Grid grid) {
        //TODO add random noise to every point
        return grid;
    }

    public Grid addDistortionToGrid(Grid grid) {
        //TODO add optical distortion to grid points. The distortion is a quadratic (or higher order) function of distance from the center of the grid
        return grid;
    }

    private class Grid {
        private List<Point2D> points;

    }

}
