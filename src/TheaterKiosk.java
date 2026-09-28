import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Pseudocode:
        // class TheaterKiosk
        //   main()
        //     num age = 0
        //     String trash = ""
        //     output "Please enter your age: "
        //     if hasNextInt() then
        //       input age
        //       if age >= 21 then
        //         output "You get a paper wristband."
        //       endIf
        //     else
        //       input trash
        //       output "Invalid age: " + trash
        //     endIf
        //   return
        // endClass

        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Please enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // clear buffer

            if (age >= 21) {
                System.out.println("You get a paper wristband.");
            }
            // Note: Does nothing if under 21
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid input: " + trash);
        }
    }
}