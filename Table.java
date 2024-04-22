import java.util.*;

public class Table {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number for multiplication table: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        for(int i=1; i<=10;i++)
        System.out.println(number + " * " + i + " = " + (number * i ));
    }


}