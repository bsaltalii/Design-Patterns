package InterfaceSegregationPrinciple;

//interface Worker{
//    void work();
//    void eat();
//    void sleep();
//}
//class Robot implements Worker{
//    @Override
//    public void work() {
//        System.out.println("Robot is working");
//    }
//
//    @Override
//    public void eat() {
//        throw new UnsupportedOperationException("Robots don't eat");
//    }
//
//    @Override
//    public void sleep() {
//        throw new UnsupportedOperationException("Robots don't sleep");
//    }
//}
//
//class Human implements Worker{
//    @Override
//    public void work() {
//        System.out.println("Human is working");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Human is eating");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Human is sleeping");
//    }
//}

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}
interface Sleepable{
    void sleep();
}

public class Robot implements Workable{
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

class Human implements Workable,Eatable,Sleepable{

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

class Main{
    public static void main(String[] args) {
        Robot robot = new Robot();
        Human human = new Human();

        robot.work();
        human.eat();
        human.work();
        human.sleep();
    }
}

//What we did:
//We split the large Worker interface into smaller,
// more specific interfaces (Workable, Eatable, and Sleepable).
//Now, classes only implement the
// interfaces that are relevant to them.