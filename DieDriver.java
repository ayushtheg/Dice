public class DieDriver {
    public static void main (String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Dice Driver-- Ayush Gaur");
        //Creates new dice
        Die d1 = new Die(); 
        Die d2 = new Die(4);
        Die d3 = new Die(10);
        System.out.println("1. Creation of Die");
        System.out.print("a) ");
        d1.print();
        System.out.println();
        System.out.print("b) ");
        d2.print();
        System.out.println();
        System.out.print("c) ");
        d3.print();
        System.out.println();
       //Sets values
        System.out.println("2. Setting Value of Die");
        d1.setValue(3);
        d2.setValue(5);
        d3.setValue(0);
        System.out.print("a) ");
        d1.print();
        System.out.println();
        System.out.print("b) ");
        d2.print();
        System.out.println();
        System.out.print("c) ");
        d3.print();
        System.out.println();
       //Freezes dice
        System.out.println("3. Freezing a Die");
        d1.freeze();
        d1.setValue(5);
        System.out.print("a) ");
        d1.print();
        System.out.println();
        d1.unfreeze();
        d1.setValue(5);
        System.out.print("b) ");
        d1.print();
        System.out.println();
        //Draws Dice
        System.out.println("4. Drawing a Die");
        System.out.println("a) ");
        d1.draw();
        System.out.println("b) ");
        d2.draw();
        System.out.print("c) ");
        d3.draw();
        System.out.println();
        //Rolls dice using for loops
        System.out.println("5. Rolling a Die");
        System.out.print("a) ");
        for (int i = 1; i<=10; i++) {
            d1.roll();
            d1.print();
        }
        System.out.println("");
        System.out.print("b) ");
         for (int i = 1; i<=3; i++) {
            d2.roll();
            d2.print();
        }
        System.out.println("");
        System.out.print("c) ");
         for (int i = 1; i<=10; i++) {
            d3.roll();
            d3.print();
        }
    }
}