class shape {
    // String color;
    public void area() {
        System.out.println("Display area");
    }

}

class Triangle extends shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);

    }

}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Triangle T1 = new Triangle();
        // T1.color = "Red";

    }
}
