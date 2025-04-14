public class UsingThis {
    public static void main(String[] args) {
         Pen p1=new Pen();//created a Pen class object called p1.

         p1.setColor("Blue");
         System.out.println(p1.getColor());

         p1.setTip(5);
         System.out.println(p1.getTip());

         //p1.setColor("yellow");
         
         p1.setColor("yellow");
         System.out.println(p1.getColor());
    }
    
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color=color;
    }

    void setTip(int tip){
        this.tip=tip; 
    }
}