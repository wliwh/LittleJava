abstract class ShishD {

    abstract boolean onlyOnions();

    abstract boolean isVegetarian();
}

class Skewer extends ShishD {

    @Override
    boolean onlyOnions() {
        return true;
    }

    @Override
    boolean isVegetarian() {
        return true;
    }
}

class Onion extends ShishD {

    ShishD s;

    Onion(ShishD _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return s.onlyOnions();
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}

class Lamb extends ShishD {

    ShishD s;

    Lamb(ShishD _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return false;
    }

    @Override
    boolean isVegetarian() {
        return false;
    }
}

class test {
    public static void main(String[] args) {
        ShishD s = new Lamb(new Onion(new Skewer()));
        System.out.println(s.toString());
    }
}