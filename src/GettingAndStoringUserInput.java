import java.util.Scanner;
public class GettingAndStoringUserInput {
 public static void main (String [] args) {
  Scanner keyboard = new Scanner(System.in);
  int houseNumber;
  String  firstInitial,
          lastName,
          streetName,
          streetType,
          city;
  System.out.print("Enter your first initial: ");
     firstInitial = keyboard.next();
  System.out.print("Enter your last name: ");
  lastName = keyboard.nextLine();
  System.out.print("Enter your house number: ");
  houseNumber = keyboard.nextInt();
  System.out.print("Enter your street name: ");
  streetName = keyboard.next();
  System.out.print("Enter your street type: ");
  streetType = keyboard.next();
  System.out.print("Enter your city: ");
  city = keyboard.next();
  System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
  System.out.println(streetName + " " + streetType + " " + city);
 }
}
