import java.util.Scanner;

public class showZodiacsings {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthday month :");
        int month = sc.nextInt();
        determineZodiacSign(month);



        }

public static void determineZodiacSign(int month) {
    Scanner sc = new Scanner(System.in);
    int date;
    System.out.print("Enter your birthday date: ");
    date = sc.nextInt();

    switch(month) {
        case 1:
            if (date >= 1 && date <= 19) {
                System.out.println("Your zodiac sign is Capricorn.");
            } else if (date >= 20 && date <= 31) {
                System.out.println("Your zodiac sign is Aquarius.");
            }
            break;
        case 2:
            if (date >= 1 && date <= 18) {
                System.out.println("Your zodiac sign is Aquarius.");
            } else if (date >= 19 && date <= 29) { // Adjusted for February
                System.out.println("Your zodiac sign is Pisces.");
            } else {
                System.out.println("Invalid date.");
            }
            break;
        case 3:
            if (date >= 1 && date <= 20) {
                System.out.println("Your zodiac sign is Pisces.");
            } else if (date >= 21 && date <= 31) {
                System.out.println("Your zodiac sign is Aries.");
            }
            break;
        case 4:
            if (date >= 1 && date <= 19) {
                System.out.println("Your zodiac sign is Aries.");
            } else if (date >= 20 && date <= 30) {
                System.out.println("Your zodiac sign is Taurus.");
            }
            break;
        case 5:
            if (date >= 1 && date <= 20) {
                System.out.println("Your zodiac sign is Taurus.");
            } else if (date >= 21 && date <= 31) {
                System.out.println("Your zodiac sign is Gemini.");
            }
            break;
        case 6:
            if (date >= 1 && date <= 20) {
                System.out.println("Your zodiac sign is Gemini.");
            } else if (date >= 21 && date <= 30) {
                System.out.println("Your zodiac sign is Cancer.");
            }
            break;
        case 7:
            if (date >= 1 && date <= 22) {
                System.out.println("Your zodiac sign is Cancer.");
            } else if (date >= 23 && date <= 31) {
                System.out.println("Your zodiac sign is Leo.");
            }
            break;
        case 8:
            if (date >= 1 && date <= 22) {
                System.out.println("Your zodiac sign is Leo.");
            } else if (date >= 23 && date <= 31) {
                System.out.println("Your zodiac sign is Virgo.");
            }
            break;
        case 9:
            if (date >= 1 && date <= 22) {
                System.out.println("Your zodiac sign is Virgo.");
            } else if (date >= 23 && date <= 31) {
                System.out.println("Your zodiac sign is Libra.");
            }
            break;
        case 10:
            if (date >= 1 && date <= 22) {
                System.out.println("Your zodiac sign is Libra.");
            } else if (date >= 23 && date <= 31) {
                System.out.println("Your zodiac sign is Scorpio.");
            }
            break;
        case 11:
            if (date >= 1 && date <= 21) {
                System.out.println("Your zodiac sign is Scorpio.");
            } else if (date >= 22 && date <= 30) {
                System.out.println("Your zodiac sign is Sagittarius.");
            }
            break;
        case 12:
            if (date >= 1 && date <= 21) {
                System.out.println("Your zodiac sign is Sagittarius.");
            } else if (date >= 22 && date <= 31) {
                System.out.println("Your zodiac sign is Capricorn.");
            }
            break;
        default:
            System.out.println("Invalid month.");
    }
}
}

