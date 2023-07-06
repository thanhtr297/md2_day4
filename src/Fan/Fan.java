package Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    boolean on = false;
    double ra = 5;
    int speed = SLOW;
    String color = "blue";
    public Fan() {
    }
    public int speed( int speed){
        return speed;
    }
    private void on(){
        on = true;
    }
    private void off(){
        on = false;
    }
    private double radius(double ra) {
       return ra;
    }
    private String color(String color){
        return color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRa() {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (on) {
            return "fan is on";
        } else {
            return "fan is off";
        }
    }

}
