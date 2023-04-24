import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class intArray {
    int[] array;
    public intArray(int[] array) {
        this.array = array;
    }
    public static int[] reader(String fileName) throws InvalidNumberException,IOException{
        int[] num = new int[10];
        String main;
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            int x = 0;
            while (scanner.hasNextLine() && x < 10) {
                try {
                    num[x] = Integer.parseInt(scanner.nextLine());
                    x++;
                } catch (NumberFormatException err) {
                    throw new InvalidNumberException("wrong number");
                }
            }
            scanner.close();
        } catch (ArithmeticException err) {
            throw new ArithmeticException("???....");
        }
        return num;
    }
    public static int totalArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum +=array[i];
        }
        return sum;
    }
}