package exercise9;

public class Ellipse {
  private Point startPoint;
  private double a;
  private double b;

  public Ellipse(){
    startPoint = new Point(0, 0);
    a = 1;
    b = 1;
  }

  public Ellipse(Point startPoint, double a, double b){
    this.a = a;
    this.b = b;
    this.startPoint = new Point(startPoint);
  }

  public Ellipse(Ellipse other){
    startPoint = new Point(other.startPoint);
    a = other.a;
    b = other.b;
  }

  public boolean isValid(){
    if (a > 0 && b > 0){
      return true;
    }
    return false;
  }

  public void initialize(){
    do {
      startPoint.initialize();
      a = Utils.INPUT.nextDouble();
      b = Utils.INPUT.nextDouble();
    } while (isValid() == false);
  }

  public double calculatePerimeter(){
    double Umfang = 3.14 * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    return Umfang;
  }

  public double calculateArea(){
    double Flaeche = 3.14 * a * b;
    return Flaeche;
  }

  public String getType(){
    if (a == b){
      return "Circle";
    }
    return "Ellipse";
  }

  public String toString(){
    return String.format("(%s)-[%s, %s], %s, P=%s, A=%s", startPoint, a, b, getType(), calculatePerimeter(), calculateArea());
  }

  public boolean equals(Ellipse otherEllipse){
    if (this.a == otherEllipse.a && this.b == otherEllipse.b){
      return true;
    }
    return false;
  } 
}
