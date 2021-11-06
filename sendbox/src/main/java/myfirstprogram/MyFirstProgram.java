package myfirstprogram;

public class MyFirstProgram{
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");
        
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной: "+s.l+" = "+area(s));
        
        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами: "+ r.a +" и "+ r.b +" = "+area(r));
        
    }
    public static void hello(String somb) {
    	 
    	System.out.println("Hello, "+ somb + "!");
    }
    public static double area(Square s) {
    	return s.l*s.l;
    }
    public static double area(Rectangle d) {
    	return d.a*d.b;
    }
    
}