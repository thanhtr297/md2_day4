package Fan;



public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRa(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());
        // --------------------------------
        // fan2
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRa(5);
        fan2.setColor("blue");
        fan2.setOn(false);

    }
}
