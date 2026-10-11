import java.util.*;
class Pen{
  String color;
  String type;

  public void write(){
    System.out.println("Writing something");
  }
}
public class oops {
  public static void main(String[] args) {
    Pen pen1=new Pen();
    pen1.color="blue";
    pen1.type="Gel";

    pen1.write();
  }
}
