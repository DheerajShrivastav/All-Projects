import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
import javax.print.event.PrintJobListener;
import javax.xml.stream.util.StreamReaderDelegate;

public class Accept {
  public String pro_name;
  public int quantity;
  public float price;
  public float total;

  Accept() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Product Name:=");
    pro_name = sc.nextLine();
    System.out.println("Enter the product quentity");
    quantity = sc.nextInt();

    System.out.println("Enter the product price of one unit:=");
    price = sc.nextFloat();
    total = price * (float) quantity;
  }

  public void show() {
    System.out.println("Name of the product:=\t" + pro_name);
    System.out.println("Quantity of the product:=\t" + quantity);
    System.out.println("Price of the product of one unit:=\t" + price);
    System.out.println("Total amount of the product:=\t" + total);
  }

  public void line() {
    System.out.println(
      "\n ---------------------------------------------------------------------\n"
    );
  }
}
