package PenP;

public class Pen4 {
    String vender;
    String color;
    int price;

    public Pen4(){
    }
    public Pen4(String name){
        vender = name;
    }

    public Pen4(String name,String col, int pp){
        vender = name;
        color = col;
        price = pp;
    }
    public void write() {
        System.out.println("Pen: write()");
        System.out.printf("Pen Vender: %s",vender);
        System.out.printf(", Pen Color: %s",color);
        System.out.printf(", Pen Price: %d\n",price);
    }

    public void write(int xx) {
        System.out.println("Pen: write(int xx)");
        System.out.printf("Pen Vender: %s",vender);
        System.out.printf(", Pen Color: %s",color);
        System.out.printf(", Pen Price: %d\n",xx);
    }

    public void write(int xx,String yy) {
        System.out.println("Pen: write(int xx,String yy)");
        System.out.printf("Pen Vender: %s",yy);
        System.out.printf(", Pen Color: %s",color);
        System.out.printf(", Pen Price: %d\n",xx);
    }

    public void write(int xx,String yy,String zz) {
        System.out.println("Pen: write(int xx,String yy, String zz)");
        System.out.printf("Pen Vender: %s",yy);
        System.out.printf(", Pen Color: %s",zz);
        System.out.printf(", Pen Price: %d\n",xx);
    }

    public void erase() {
        System.out.println("Pen:erase()");
    }
}
