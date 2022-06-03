package ge.ufc.main;


public class Main {

    public static void main(String[] args) {
        Figure figure = new Figure("Say Hi");
        Rectangle rectangle = new Rectangle();

        Rectangle.sayHello();
        System.out.println("Superclass perimeter: " + figure.perimeter());
        System.out.println("Superclass area: " + figure.area() + "\n");

        System.out.print("Rectangle's static Method: ");
        System.out.println("Subclass perimeter: " + rectangle.perimeter());
        System.out.println("Subclass area: " + rectangle.area() + "\n");

        System.out.println(figure instanceof Figure); // დაბეჭდავს true-ს, რადგან ობექტი არის ფიგურ კლასის და ცხადია მიეკუთვნება მოცემულ კლასს.
        System.out.println(rectangle instanceof Rectangle); // ესეც როგორც ზემოთ აღვწერე ზუსტად იგივეა.
        System.out.println(rectangle instanceof Figure); // ეს კოდი დაბეჭდავს true, რადგან მოცემული ობიექტი მიეკუთვნება არა მხოლოდ მართკუთხედებს არამედ ფიგურებსაც.
        System.out.println(figure instanceof Rectangle); // მოცემული კოდი დაბეჭდავს false, რადგან მოცემული ობიექტი არ მიეკუთვნება მართკუთხედთა კლასს.

        System.out.println("Overloaded Rectangle's perimeter Method: " + rectangle.perimeter(4, 8));
        System.out.println("Overloaded Rectangle's area Method: " + rectangle.area(7, 9));
    }
}
