import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//
//// this will throw an exception if user input is not convertable to an integer
//
//        try{
//            Integer.parseInt(userInput);
//            System.out.println("Test");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("catch test");
//        }
//        System.out.println("The Program executed successfully");

        List<String> emptyList = new ArrayList<>();

// this will throw an exception in any case!
        try{
            emptyList.get(5);
        }catch (Exception e){
            System.out.println("Index not up to 5");
        }
    }
}
