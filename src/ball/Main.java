package ball;

class Ball {
    private String type;
    private String color;
    private int diametr;

    Ball (String type,String color, int diametr){
        this.type=type;
        this.color=color;
        this.diametr=diametr;
    }
    public int getDiametr() {
        return diametr;
    }
    @Override
    public String toString() {
        return this.type+ "," + this.color+ ","  + getDiametr() + "см";
    }
}

public class Main {
    public static void main(String[] args) {
        Ball ball= new Ball("Футбольный","Белый", 20);
        System.out.println(ball);
    }
}
