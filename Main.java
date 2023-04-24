import java.io.IOException;
public class Main{
    public static void main(String[] args){
        try {
            int[] num = intArray.reader("intArray");
            int sum = intArray.totalArray(num);
            System.out.println("the total is -> "+sum);
        }catch(IOException err){
            System.out.println(err.getMessage() );
        } catch(ArithmeticException err){
            System.out.println(err.getMessage());
        }catch(InvalidNumberException err){
            System.out.println(err.getMessage());}
    }
}