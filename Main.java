import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculateVolume();
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculateVolume() {
        return 0; // Triangles are 2D shapes
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return 0; // Circles are 2D shapes
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculateVolume() {
        return 0; // Rectangles are 2D shapes
    }
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cube extends Shape {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 6 * side * side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        do {
            System.out.println("Select a shape (Triangle, Circle, Rectangle, Sphere, Cube):");
            choice = scanner.nextLine().toLowerCase();

            Shape shape;
            double area, volume;

            switch (choice) {
                case "triangle":
                    System.out.println("Enter base and height(cm):");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    area = shape.calculateArea();
                    volume = shape.calculateVolume();
                    break;
                case "circle":
                    System.out.println("Enter radius(cm):");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    area = shape.calculateArea();
                    volume = shape.calculateVolume();
                    break;
                case "rectangle":
                    System.out.println("Enter length and width(cm):");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    area = shape.calculateArea();
                    volume = shape.calculateVolume();
                    break;
                case "sphere":
                    System.out.println("Enter radius(cm):");
                    radius = scanner.nextDouble();
                    shape = new Sphere(radius);
                    area = shape.calculateArea();
                    volume = shape.calculateVolume();
                    break;
                case "cube":
                    System.out.println("Enter side length(cm):");
                    double side = scanner.nextDouble();
                    shape = new Cube(side);
                    area = shape.calculateArea();
                    volume = shape.calculateVolume();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    area = 0;
                    volume = 0;
                    break;
            }

            System.out.println("Area: " + area);
            if (volume != 0) {
                System.out.println("Volume: " + volume);
            }

            scanner.nextLine(); // Consume newline
            System.out.println("Do you want to continue? (yes/no)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
        
        scanner.close();
        System.out.println("Program ended.");
    }
}
