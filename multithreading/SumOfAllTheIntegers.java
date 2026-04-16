package multithreading;

public class SumOfAllTheIntegers{
    public static void main(String[] args){
    // int sum = 0;

    // for(int i=0;i<20; i++){
    //     sum += i;
    // }

    // System.out.println("Sum of all Integers: "+sum);

    // }

    long startTime = System.currentTimeMillis();

        long result = 0;

        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            result = result + i;
        }

        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken by normal Java class: " + (endTime - startTime));
    }
    
}
