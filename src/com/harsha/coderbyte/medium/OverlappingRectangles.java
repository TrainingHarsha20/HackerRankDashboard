package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Using the Java language, have the function OverlappingRectangles(strArr)
 * read the strArr parameter being passed which will represent two rectangles on a Cartesian coordinate plane
 * and will contain 8 coordinates with the first 4 making up rectangle 1 and the last 4 making up rectange 2.
 *
 * It will be in the following format: ["(0,0),(2,2),(2,0),(0,2),(1,0),(1,2),(6,0),(6,2)"]
 *
 * Your program should determine the area of the space where the two rectangles overlap,
 * and then output the number of times this overlapping region can fit into the first rectangle.
 *
 * For the above example, the overlapping region makes up a rectangle of area 2, and the first rectangle
 * (the first 4 coordinates) makes up a rectangle of area 4, so your program should output 2.
 * The coordinates will all be integers. If there's no overlap between the two rectangles return 0.
 *      0,0   0,2
 *      2,0   2,2   1,0  1,2
 *                  6,0  6,2
 */
public class OverlappingRectangles {

    int OverlappingRectangles(String[] strArr) {

        String[] coordinates = strArr[0].split("[)],[(]");
        coordinates[0] = coordinates[0].substring(1);
        coordinates[7] = coordinates[7].substring(0, coordinates[7].length() - 1);

        String[] rect1Coords = new String[] {coordinates[0], coordinates[1], coordinates[2], coordinates[3]};
        String[] rect2Coords = new String[] {coordinates[4], coordinates[5], coordinates[6], coordinates[7]};


        return 1;
    }

    int numSubarrayProductLessThanK(String[] rect, boolean min, boolean x) {
        int point = min ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        for (String coord : rect) {
            int coordPoint;
            if (x) {
                coordPoint = Integer.parseInt(coord.split(",")[0]);
            } else {
                coordPoint = Integer.parseInt(coord.split(",")[1]);
            }

            if (min && coordPoint < point) {
                point = coordPoint;
            } else if (!min && coordPoint > point) {
                point = coordPoint;
            }
        }
        return point;
    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        OverlappingRectangles c = new OverlappingRectangles();
//        System.out.println(c.OverlappingRectangles(new String[] {"(0,0),(5,0),(0,2),(5,2),(2,1),(5,1),(2,-1),(5,-1)"}));
        System.out.println(c.OverlappingRectangles(new String[] {"(0,0),(2,2),(2,0),(0,2),(1,0),(1,2),(6,0),(6,2)"}));
    }
}
