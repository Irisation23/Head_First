package chapter1.strategy.duck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
