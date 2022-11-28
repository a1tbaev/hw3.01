import java.util.InputMismatchException;

public class Parallelepiped extends Exception{
    private int height;
    private int width;
    private int length;

    public Parallelepiped(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void getArea(){
        System.out.println("area of parallelepiped " + 2*((height * length) + (length * width) + (height * width)));
    }
    public void getVolume(){
        System.out.println("volume of parallelepiped " + (length*width*height));
    }
}
