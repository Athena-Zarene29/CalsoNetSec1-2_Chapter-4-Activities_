public class DivideEvenly2{
    public static void main (String[]args){
        final int LIMIT = 50;
        int number, var;

        for(number = 1; number <= LIMIT; ++number){
System.out.print(number + " is evenly divisible by ");
for(var = 1; var <= number; ++var)
if(number % var == 0)
    System.out.print(var + " ");
// Print the number and two spaces
System.out.println();
        }

    }
}