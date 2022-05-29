import java.util.Scanner;

public class MicroProject extends Accept {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many product do you want to enter:=");
    int count = sc.nextInt();

    float payableAmount = 0;
    String name;
    long p_no;

    String sh_name = "Web Studio 3.0";
    long gstNO = 54564854826l;

    System.out.println("Enter the customer Name:=");
    name = sc.next();

    System.out.println("Enter the customer Phone no:=");
    p_no = sc.nextLong();

    Accept[] a = new Accept[count];
    for (int i = 0; i < a.length; i++) {
      System.out.println("enter the details for " + i + "th product");
      a[i] = new Accept();
    }

    System.out.println("\n \n \n \n");
    System.out.println(
      "Shop Name :=\t" + sh_name + "\n" + "GST No:=\t" + gstNO
    );
    a[0].line();

    System.out.println(
      "Customer Name:=\t" + name + "\nCustomer phone number  :=\t" + p_no
    );
    a[0].line();

    for (int i = 0; i < a.length; i++) {
      System.out.println("Details of " + i + "th product");
      a[i].show();
      a[i].line();
    }
    for (int i = 0; i < a.length; i++) {
      payableAmount += a[i].total;
    }
    System.out.println("Payable amount :=\t" + payableAmount);
  }
}
