public class Rectangle {
    Point A;
    Point B;
    Point C;
    Point D;

    public Rectangle(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);

        return dAB * 2 + dBC * 2;
    }

    public double area(){
        double dAB = A.distance(B);
        double dBC = B.distance(C);

        return dAB * dBC;
    }

    public boolean isRectangle() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCD = C.distance(D);
        double dDA = D.distance(A);

        return dAB == dCD && dBC == dDA;
    }

    public boolean isSquare() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCD = C.distance(D);
        double dDA = D.distance(A);

        return dAB == dBC && dBC == dCD && dCD == dDA && dDA == dAB;
    }
}