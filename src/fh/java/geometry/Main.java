package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.quadrilateral.Square;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();

    }

    private void doIt() {

        List<GeometricShape> shapeListBetter = new ArrayList<>();

        fillList(shapeList);

        printList(shapeList);

        List<Circle> circleList = new ArrayList<>();

        for (GeometricShape shape : shapeList) {
            if (shape instanceof Circle){


                circleList.add((Circle)shape);

            }

        }
        System.out.println("------------------------");
        for (Circle circle : circleList) {
            System.out.println(Circle);
        }


    }


    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Circle(1,2,3.0));
        shapeList.add(new Rectangle(1,2,3,4));
        shapeList.add(new Rectangle(1,2,3,4));
        shapeList.add(new Rectangle(2,4,3,1));
        shapeList.add(new RightTriangle(2,4,3,1));
        shapeList.add(new RightTriangle(2,4,3,1));
        shapeList.add(new Square(1,2,3));




    }


    public void printList(List<GeometricShape> shapeList) {

        System.out.println("----- for ----- ");
        for (int pos = 0; pos < shapeList.size(); pos++) {
            System.out.println(shapeList.get(pos));


        }


        System.out.println("----- for each----- ");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }

        System.out.println("----- stream 1 ----- ");
        shapeList.stream()
                .forEach(shape -> System.out.println(shape));


        System.out.println("----- for ----- ");
        shapeList.stream().forEach(System.out::println);

    }

}
