
public class LoopingWhile {
    public static void main (string [] args){
        
    int number, fac, i;
        System.out.println("====Program Calculates Factorial Values With for====");
        System.out.println("Enter number :");
        
        Scanner input = new Scanner (System.in);
        number = input.nextInt();
        fac =  1 ;
        i = 1;
        while (i<=number)
        {
            fac = fac * 1;
            i++;
        }
        System.out.printf("Factorial value of that tumber is : %d \n", fac);
    
    }

    private static class string {

        public string() {
        }
    }
}
