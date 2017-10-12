abstract class PointD {

    int x;
    int y;

    PointD(int _x, int _y) {
        x = _x;
        y = _y;
    }

    abstract double distanceTo0();

    boolean closerTo0(PointD p) {
        return distanceTo0() <= p.distanceTo0();
    }
}

class CartesianPt extends PointD {

    CartesianPt(int _x, int _y) {
        super(_x, _y);
    }

    double distanceTo0() {
        return Math.sqrt(x * x + y * y);
    }
}

class ManhattanPt extends PointD {

    ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }

    double distanceTo0() {
        return x + y;
    }
}

abstract class NumD {
}

class Zero extends NumD {
}

class OneMoreThan extends NumD {
        NumD predecessor;

        OneMoreThan(NumD _d) {
            predecessor = _d;
        }
    }

public class ModernToys {

    public static void main(String[] args) {
        PointD pc = new CartesianPt(3, 4);
        PointD pm = new ManhattanPt(3, 4);
        System.out.println("dis1: " + pc.distanceTo0() + "\n" +
                "dis2: " + pm.distanceTo0() + "\n" +
                "dis1 Closer to dis2 ? " + pc.closerTo0(pm));
    }
}
