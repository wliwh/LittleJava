class OnlyOnionsV {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(VShishD s) {
        return s.onlyOnions();
    }

    boolean forLamb(VShishD s) {
        return false;
    }

    boolean forTomato(VShishD s) {
        return false;
    }
}

class IsVegetarianV {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(VShishD s) {
        return s.IsVegetarian();
    }

    boolean forLamb(VShishD s) {
        return false;
    }

    boolean forTomato(VShishD s) {
        return s.IsVegetarian();
    }
}

abstract class VShishD {
    OnlyOnionsV ooFn = new OnlyOnionsV();
    IsVegetarianV ivFn = new IsVegetarianV();

    abstract boolean onlyOnions();

    abstract boolean IsVegetarian();
}

class VSkewer extends VShishD {
    @Override
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }

    @Override
    boolean IsVegetarian() {
        return ivFn.forSkewer();
    }
}

class VOnion extends VShishD {

    VShishD s;

    VOnion(VShishD _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forOnion(s);
    }

    @Override
    boolean IsVegetarian() {
        return ivFn.forOnion(s);
    }
}

class VLamb extends VShishD {

    VShishD s;

    VLamb(VShishD _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forLamb(s);
    }

    @Override
    boolean IsVegetarian() {
        return ivFn.forLamb(s);
    }
}

class VTomato extends VShishD {

    VShishD s;

    VTomato(VShishD _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forTomato(s);
    }

    @Override
    boolean IsVegetarian() {
        return ivFn.forTomato(s);
    }
}

public class VShish {
    public static void main(String[] args) {
        VShishD vs = new VTomato(new VLamb(new VSkewer()));
        System.out.println(vs.IsVegetarian() + " " + vs.onlyOnions());
    }
}