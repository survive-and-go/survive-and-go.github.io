public class MallardDuck extends Duck {
    public MallardDuck() {
      // 모든 행동은 지정된 행동 클래스로 위임된다.
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
    }

    public void display() {
      System.out.println("I am a mallard duck.");
    }
}