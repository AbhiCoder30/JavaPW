import java.util.Scanner;  // use to bring the reserve code in java

public class L3_UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);          // System.in means that we want to take the input from the user
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();

//        int sum = a +b;
//        float sum = a +b;
//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);


//        boolean b1 = sc.hasNextInt();      // this is use to check the validity
//        System.out.println(b1);


        System.out.println("Enter any String: ");
//        String str = sc.next();            // this reads till the 1st space
        String str = sc.nextLine();          // this reads whole string
        System.out.println(str);
    }
}
