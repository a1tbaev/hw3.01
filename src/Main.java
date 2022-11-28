import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("height: ");
            int height = scanner.nextInt();
            System.out.println("width: ");
            int width = scanner.nextInt();
            System.out.println("length: ");
            int length = scanner.nextInt();
            Parallelepiped parallelepiped = new Parallelepiped(height, width, length);
            if (parallelepiped.getHeight() < 0.1 || parallelepiped.getWidth() < 0.1 || parallelepiped.getLength() < 0.1){
                throw new ArithmeticException("the input must be a positive number");
            } else if (parallelepiped.getHeight() > 20 || parallelepiped.getWidth() > 20 || parallelepiped.getLength() > 20) {
                throw new ArithmeticException("the input must be a less then 20 ");
            } else {
                parallelepiped.getArea();
                parallelepiped.getVolume();
            }
        }catch (InputMismatchException e){
            System.out.println("the input must be a number");
        }
    }
}