public class DivideEvenly{
    public static void main (String[]args){
        final int NUMBER = 100;
        int val;

        System.out.print(NUMBER + " is evenly divided by ");

        for(val = 1; val <= NUMBER; ++val)
        {if(NUMBER % val == 0)
            System.out.print(val + " ");
            //Print the number and two spaces
        }
        System.out.println();
    }
}