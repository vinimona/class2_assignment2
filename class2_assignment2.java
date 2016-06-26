// Problem Statement
// Generate prime numbers between 1 and 100 using for loop. A prime number (or a prime) is a natural number greater than 1 that 
// has no positive divisors other than 1 and itself. A natural number greater than 1 that is not a prime number 
// is called a composite number. Use for loop and break statement to achieve this task.

package Class2_assignments;

public class class2_assignment2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, factor;
		System.out.println("Prime numbers between 1 and 100 :- ");
		
		for (num = 2; num <= 100; num++)
		{
		    for(factor = 2; factor <= (num-1);factor++)
		    {
		        if(num % factor == 0)
		            break;
		    }
		    if(num == factor)    // 'num' should have only two factors i.e. 1 and itself, if it is a prime number.
		        System.out.print(num + " ");
		}
		
	}

}
