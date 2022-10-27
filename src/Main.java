public class Main {
    public static void main(String[] args) {

            Boss boss = new Boss();
            boss.sethIt(150);
            boss.sethEalth(400);
            System.out.println(boss.printInfo());

            Skeleton skeleton = new Skeleton();
            skeleton.setStrely(35);
            System.out.println(skeleton.printInfo());

    }
}