/*
  PACKAGE: PACKAGE_NAME
  USER: wang hai
  DATE: 2017/10/10
  TIME: 09:41
  
  Pizza 和它的配料

 */

abstract class PizzaD {
    // 去掉凤尾鱼
    abstract PizzaD remA();

    // 在凤尾鱼顶上加上奶酪
    abstract PizzaD topAwC();

    // 将凤尾鱼替换为奶酪
    abstract PizzaD subAbC();

    @Override
    public String toString() {
        return getClass().getName() + "()";
    }
}

// 面包
class Crust extends PizzaD {
    @Override
    PizzaD remA() {
        return new Crust();
    }

    @Override
    PizzaD topAwC() {
        return new Crust();
    }

    @Override
    PizzaD subAbC() {
        return new Crust();
    }
}

// 奶酪
class Cheese extends PizzaD {

    PizzaD p;

    Cheese(PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return new Cheese(p.remA());
    }

    @Override
    PizzaD topAwC() {
        return new Cheese(p.topAwC());
    }

    @Override
    PizzaD subAbC() {
        return new Cheese(p.subAbC());
    }
}

// 橄榄
class Olive extends PizzaD {

    PizzaD p;

    Olive(PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return new Olive(p.remA());
    }

    @Override
    PizzaD topAwC() {
        return new Olive(p.topAwC());
    }

    @Override
    PizzaD subAbC() {
        return new Olive(p.subAbC());
    }
}

// 凤尾鱼
class Anchovy extends PizzaD {

    PizzaD p;

    Anchovy(PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return p.remA();
    }

    @Override
    PizzaD topAwC() {
        return new Cheese(new Anchovy(p.topAwC()));
    }

    @Override
    PizzaD subAbC() {
        return new Cheese(p.subAbC());
    }
}

// 香肠
class Sausage extends PizzaD {
    PizzaD p;

    Sausage(PizzaD _p) {
        p = _p;
    }

    PizzaD remA() {
        return new Sausage(p.remA());
    }

    PizzaD topAwC() {
        return new Sausage(p.topAwC());
    }

    PizzaD subAbC() {
        return new Sausage(p.subAbC());
    }

}

public class Pizza {

    public static void main(String[] args) {
        PizzaD p = new Crust();
        PizzaD p2 = new Sausage(p);
        PizzaD p3 = new Olive(p2);
        PizzaD p4 = new Anchovy(p3);
        PizzaD p5 = new Cheese(p4);

        PizzaD ptop = p4.topAwC();
        PizzaD psub = p5.subAbC();


    }
}
