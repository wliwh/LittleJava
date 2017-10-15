/*
  PACKAGE: PACKAGE_NAME
  USER: wang hai
  DATE: 2017/10/15
  TIME: 15:14
  
  
 */

class RemAV {
    VPizzaD forCrust() {
        return new VCrust();
    }

    VPizzaD forCheese(VPizzaD p) {
        return new VCheese(p.remA());
    }

    VPizzaD forOlive(VPizzaD p) {
        return new VOlive(p.remA());
    }

    VPizzaD forAnchovy(VPizzaD p) {
        return p.remA();
    }

    VPizzaD forSausage(VPizzaD p) {
        return new VSausage(p.remA());
    }
}

class TopAwCV {
    VPizzaD forCrust() {
        return new VCrust();
    }

    VPizzaD forCheese(VPizzaD p) {
        return new VCheese(p.topAwC());
    }

    VPizzaD forOlive(VPizzaD p) {
        return new VOlive(p.topAwC());
    }

    VPizzaD forAnchovy(VPizzaD p) {
        return new VCheese(new VAnchovy(p.topAwC()));
    }

    VPizzaD forSausage(VPizzaD p) {
        return new VSausage(p.topAwC());
    }
}

class SubAbCV {
    VPizzaD forCrust() {
        return new VCrust();
    }

    VPizzaD forCheese(VPizzaD p) {
        return new VCheese(p.subAbC());
    }

    VPizzaD forOlive(VPizzaD p) {
        return new VOlive(p.subAbC());
    }

    VPizzaD forAnchovy(VPizzaD p) {
        return new VCheese(p.subAbC());
    }

    VPizzaD forSausage(VPizzaD p) {
        return new VSausage(p.subAbC());
    }
}

abstract class VPizzaD {
    RemAV remfn = new RemAV();
    TopAwCV topfn = new TopAwCV();
    SubAbCV subfn = new SubAbCV();

    abstract VPizzaD remA();

    abstract VPizzaD topAwC();

    abstract VPizzaD subAbC();
}

class VCrust extends VPizzaD {

    @Override
    VPizzaD remA() {
        return remfn.forCrust();
    }

    @Override
    VPizzaD topAwC() {
        return topfn.forCrust();
    }

    @Override
    VPizzaD subAbC() {
        return subfn.forCrust();
    }
}

class VCheese extends VPizzaD {
    VPizzaD p;

    VCheese(VPizzaD _p) {
        p = _p;
    }

    @Override
    VPizzaD remA() {
        return remfn.forCheese(p);
    }

    @Override
    VPizzaD topAwC() {
        return topfn.forCheese(p);
    }

    @Override
    VPizzaD subAbC() {
        return subfn.forCheese(p);
    }
}

class VOlive extends VPizzaD {
    VPizzaD p;

    VOlive(VPizzaD _p) {
        p = _p;
    }

    @Override
    VPizzaD remA() {
        return remfn.forOlive(p);
    }

    @Override
    VPizzaD topAwC() {
        return topfn.forOlive(p);
    }

    @Override
    VPizzaD subAbC() {
        return subfn.forOlive(p);
    }
}

class VAnchovy extends VPizzaD {
    VPizzaD p;

    VAnchovy(VPizzaD _p) {
        p = _p;
    }

    @Override
    VPizzaD remA() {
        return remfn.forAnchovy(p);
    }

    @Override
    VPizzaD topAwC() {
        return topfn.forAnchovy(p);
    }

    @Override
    VPizzaD subAbC() {
        return subfn.forAnchovy(p);
    }
}

class VSausage extends VPizzaD {
    VPizzaD p;

    VSausage(VPizzaD _p) {
        p = _p;
    }

    @Override
    VPizzaD remA() {
        return remfn.forSausage(p);
    }

    @Override
    VPizzaD topAwC() {
        return topfn.forSausage(p);
    }

    @Override
    VPizzaD subAbC() {
        return subfn.forSausage(p);
    }
}

public class VPizza {

    public static void main(String[] args) {

    }
}
