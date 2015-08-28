# java8examples
Try out java 8
Start by seeing how to transform my row-finding problem from traditional declarative programming to functional programming

The problem:
    We have a set of points that fall on a regularly spaced grid.  The grid can be rotated and the location measurements can be noisy
    - Assign each point to a row
    - Assign each point to a column
    - Handle ambiguity where the rotation is large enough to change the y coordinate of a point so that it can be assigned to the wrong row
    - Similar ambiguity exists with columns
    

1. Generate a test data set of a simple grid of points