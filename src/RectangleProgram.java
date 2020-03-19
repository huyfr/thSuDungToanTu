import java.util.Scanner;

public class RectangleProgram
{
    public static void main(String[] args)
    {
        float width;
        float height;

        Scanner number=new Scanner(System.in);

        System.out.print("Enter width: ");
        width=number.nextFloat();

        System.out.print("Enter width: ");
        height=number.nextFloat();

        float area=width*height;
        System.out.print("Area is: "+area);
    }
}
