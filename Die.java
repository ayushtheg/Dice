import java.util.*;
public class Die {
    private boolean freeze;
    private int nSides;
    private int value;
    public Die (int numSides) {
        //initializes dice object with num sides
        freeze = false;
        value = 1;
        if (numSides < 1) {
            System.out.println("Sides must be more than 1-- deafulted to 6");
            nSides = 6;
        } else {
             nSides = numSides;
          }
    }
    public Die() { //initializes dice object without num sides
        freeze = false;
        value = 1;
        nSides = 6;
    }
    public void setValue(int v) {
        //Sets value if unfrozen
        if (freeze == false) {
            if (v>0 && v<=nSides) {
            value = v;
            }
         else if (v<=0 || v>nSides) {
            System.out.println("Num sides not in range");
            value = 1;
         }
        }
    }
    public int getValue() {
        //Gets values
        return value;
    }
    public void roll() {
        //Rolls the dice and return random value
        if (freeze == false) {
            int a = (int)(1 + (Math.random()*(nSides)));
            value = a;
        }
    }
    public void print() {
        //Return dice matrix
        System.out.print("["+value+":"+nSides+"]");
    }
    public void draw() {
        //Returns dice picture
        if (nSides < 7) {  
            if (value == 1) {
                  System.out.println(".......");
                  System.out.println(".     .");
                  System.out.println(".     .");
                  System.out.println(".  *  .");
                  System.out.println(".     .");
                  System.out.println(".     .");
                  System.out.println(".......");
              }
              if (value == 2) {
                  System.out.println(".......");
                  System.out.println(".     .");
                  System.out.println(". *   .");
                  System.out.println(".     .");
                  System.out.println(".   * .");
                  System.out.println(".     .");
                  System.out.println(".......");
              }
              if (value == 3) {
                  System.out.println(".......");
                  System.out.println(". *   .");
                  System.out.println(".     .");
                  System.out.println(".  *  .");
                  System.out.println(".     .");
                  System.out.println(".    *.");
                  System.out.println(".......");
              }
              if (value == 4) {
                  System.out.println(".......");
                  System.out.println(".     .");
                  System.out.println(".*   *.");
                  System.out.println(".     .");
                  System.out.println(".     .");
                  System.out.println(".*   *.");
                  System.out.println(".......");
              }
              if (value == 5) {
                  System.out.println(".......");
                  System.out.println(".*   *.");
                  System.out.println(".     .");
                  System.out.println(".  *  .");
                  System.out.println(".     .");
                  System.out.println(".*   *.");
                  System.out.println(".......");
              }
              if (value == 6) {
                  System.out.println(".......");
                  System.out.println(".*   *.");
                  System.out.println(".     .");
                  System.out.println(".*   *.");
                  System.out.println(".     .");
                  System.out.println(".*   *.");
                  System.out.println(".......");
              }
          }
          else if (nSides > 6) {
              print();
          }
    }
    public void freeze() {
        //Freezes dice
        freeze = true;
    }
    public void unfreeze() {
        //Unfreezes dice
        freeze = false;
    }
} 