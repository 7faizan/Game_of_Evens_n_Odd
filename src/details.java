import java.util.Scanner;
public class details  {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter name :");
        String name=in.nextLine();
        System.out.println("enter dob");
        String date=in.next();
        customer customer=new customer();
        customer.readData(name,date);
        customer.displayData();
    }
}
