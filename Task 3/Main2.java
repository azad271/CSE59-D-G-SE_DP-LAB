public class Main2 {

    interface Shape {
        double calculateArea();
    }

    static class Rectangle implements Shape {
        public double length;
        public double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    static class Circle implements Shape {
        public double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class AreaCalculator {
        public double calculateTotalArea(Shape[] shapes) {
            double totalArea = 0;
            for (Shape shape : shapes) {
                totalArea += shape.calculateArea();
            }
            return totalArea;
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5.0, 4.0),
            new Circle(3.0)
        };

        AreaCalculator calculator = new AreaCalculator();
        double total = calculator.calculateTotalArea(shapes);

        System.out.println("Total Area: " + total);
    }
}
