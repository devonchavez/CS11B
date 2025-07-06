import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      double userBase = scnr.nextDouble();
      double userHeight = scnr.nextDouble();

      triangle1.setBase(userBase);
      triangle1.setHeight(userHeight);

      double triangleOne = triangle1.getArea();
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      double nextBase = scnr.nextDouble();
      double nextHeight = scnr.nextDouble();

      triangle2.setBase(nextBase);
      triangle2.setHeight(nextHeight);

      double triangleTwo = triangle2.getArea();
      
      System.out.println("Triangle with smaller area:");
      
      // TODO: Determine smaller triangle (use getArea())
      //       and output smaller triangle's info (use printInfo())
       if (triangleOne < triangleTwo) {
          triangle1.printInfo();
       } else {
          triangle2.printInfo();
       }
   }
}
