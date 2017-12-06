import java.io.*;
import java.util.*;
public class fullname
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What is your first name?");
        String q = kbReader.nextLine();
        System.out.print("What is your last name?");
        String w = kbReader.nextLine();
        System.out.println("Your full name is "+q+w);
    }
}