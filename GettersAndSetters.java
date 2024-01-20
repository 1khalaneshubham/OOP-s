// import java.util.*;
import java.net.PasswordAuthentication;

public class GettersAndSetters {  
    public static void main(String[] args) {
     
        Pen p1 = new Pen(); // created a pen object 
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5); 
        System.out.println(p1.getTip()); 
        p1.setColor("Yello");
        System.out.println(p1.getColor());

    }
}


class Pen {

    private String color;
    private int tip;

    String getColor(){        
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {   
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

