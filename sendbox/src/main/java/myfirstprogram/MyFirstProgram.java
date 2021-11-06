package myfirstprogram;

public class MyFirstProgram{
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");
        
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной: "+s.l+" = "+s.area());
        
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами: "+ r.a +" и "+ r.b +" = "+ s.area());
        
    }
    public static void hello(String somb) {
    	 
    	System.out.println("Hello, "+ somb + "!");
    }
 
   
    
}