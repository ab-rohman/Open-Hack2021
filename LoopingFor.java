public class LoopingFor {
    public static void main (String[] args){
        int number, fac=1;
        System.out.println("====Program Calculates Factorial Values With for====");
        System.out.println("Enter number :");
        
        Scanner input = new Scanner (System.in);
        number = input.nextInt();
        
        for (int i=1; i <= number; i++){
            fac = fac * i;
        }
        System.out.printf("Factorial value of that tumber is : %d \n", fac);
    }
    
}
