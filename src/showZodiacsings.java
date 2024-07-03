import java.util.Scanner;

public class showZodiacsings {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = null;
        try {
            do {
                System.out.print("Enter your birthday month :");
                int month = sc.nextInt();
                determinedate(month);
                System.out.println("Do you want to know again?(Yes or No)");
                ans = sc.next();
                if (!ans.equals("Yes") && !ans.equals("yes")) {
                    System.out.println("Thanks!");
                }
            } while (ans.equals("Yes") || ans.equals("yes"));
        }catch(Exception ex){
            System.out.println("Error! Make sure your input!");
        }

    }


    public static void determinedate(int month) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birthday date: ");
        int date = sc.nextInt();

        switch(month) {
            case 1:
                determineZodiacsing.mont1(date);
                break;
            case 2:
                determineZodiacsing.mont2(date);
                break;
            case 3:
                determineZodiacsing.mont3(date);
                break;
            case 4:
                determineZodiacsing.mont4(date);
                break;
            case 5:
                determineZodiacsing.mont5(date);
                break;
            case 6:
                determineZodiacsing.mont6(date);
                break;
            case 7:
                determineZodiacsing.mont7(date);
                break;
            case 8:
                determineZodiacsing.mont8(date);
                break;
            case 9:
                determineZodiacsing.mont9(date);
                break;
            case 10:
                determineZodiacsing.mont10(date);
                break;
            case 11:
                determineZodiacsing.mont11(date);
                break;
            case 12:
                determineZodiacsing.mont12(date);
                break;
            default:
                System.out.println("Invalid month.");
        }


    }
}




