package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {
        Ellipse first = new Ellipse();
        Point secPoint = new Point(2, 3);
        Ellipse sec = new Ellipse(secPoint, 5, 6);
        Ellipse three = new Ellipse(sec);
        Ellipse four = new Ellipse();
        four.initialize();

      System.out.println("Ellipse 1: " + first);
      System.out.println("Ellipse 2: " + sec);
      System.out.println("Ellipse 3: " + three);
      System.out.println("Ellipse 4: " + four);

      System.out.println("Ellipse 2 equals Ellipse 1: " + sec.equals(first));
      System.out.println("Ellipse 2 equals Ellipse 3: " + sec.equals(three));
    }
}
