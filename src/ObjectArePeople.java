/*
  PACKAGE: PACKAGE_NAME
  USER: wang hai
  DATE: 2017/10/15
  TIME: 15:03

  5
  
 */


abstract class Pie {
    RemAV rafn = new RemAV();
    RemFish rffn = new RemFish();

    abstract Pie remA();

    abstract Pie remFish(FishD f);

}

class Bot extends Pie {

    @Override
    Pie remA() {
        return null;
    }

    @Override
    Pie remFish(FishD f) {
        return null;
    }
}

class Top extends Pie {
    Object t;
    Pie r;

    Top(Object _t, Pie _r) {
        t = _t;
        r = _r;
    }

    @Override
    Pie remA() {
        return null;
    }

    @Override
    Pie remFish(FishD f) {
        return null;
    }
}

abstract class FishD {
}

class FAnchovy extends FishD {
    public boolean equals(Object o) {
        return (o instanceof FAnchovy);
    }
}

class FSalmon extends FishD {
    public boolean equals(Object o) {
        return (o instanceof FSalmon);
    }
}

class FTuna extends FishD {
    public boolean equals(Object o) {
        return (o instanceof FTuna);
    }
}

class RamAV {
    Pie forBot() {
        return new Bot();
    }

    Pie forTop(Object o, Pie p) {
        if (new FAnchovy().equals(o)) {
            return p.remA();
        } else {
            return new Top(o, p.remA());
        }
    }
}

class RemFish {


}

public class ObjectArePeople {

    public static void main(String[] args) {
        new Top(new Integer(2), new Bot());

    }
}
