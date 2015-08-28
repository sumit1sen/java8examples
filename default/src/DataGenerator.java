import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Date: 8/27/2015
 * Time: 2:51 PM
 * This class is for generating test datasets that can be used by the java 8 examples
 */
public class DataGenerator {
    double cellWidth = 10.0;
    double cellHeight = 15.0;

    public Grid generatePerfectGrid() {
        List<Point2D> ptList = new ArrayList<>();
        for (int i=0; i<10; i++)
        {
            for (int j = 0; j < 10; j++) {
                ptList.add(new Point2D(j*cellWidth,i*cellHeight));
            }
        }
        return new Grid(ptList);
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


}
