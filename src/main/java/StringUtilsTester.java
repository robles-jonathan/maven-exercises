import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsTester {
    public static void isNumeric(String userInput){
        if (StringUtils.isNumeric(userInput)){
            System.out.printf("\"%s\" is a number.\n",userInput);
        }else{
            System.out.printf("\"%s\" is not a number.\n",userInput);
        }
    }

    public static void flipCase(String userInput){
        //SwapCase
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
    }

    public static void reverseString(String userInput){
        //Reverse/ReverseDelimited
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = sc.nextLine();
        System.out.printf("You Entered: \"%s\"\n",userInput);
        isNumeric(userInput);
        flipCase(userInput);
        reverseString(userInput);
    }

}
