// SCS2204 Tutorial 05 Question 01 v2
object Question_01_v2 {
    def main(args: Array[String]) = {

        // Get the number from user
        print("Enter your number: " );
        var n = scala.io.StdIn.readInt();
        
        // Validate input (negotive numbers not allowed)
        while(n < 0) {
            println("Please enter non-negotive value!");
            print("Enter your number: " );
            n = scala.io.StdIn.readInt();
        }
    
        // Display status
        println("Is " + n + " a prime number? " + isPrime(n));
    }

    def isPrime(value: Int, divisor: Int = 2): Boolean =
    value match {
        // Check 0 and 1
        case value if(value < 2) => false

        // Check 2
        case value if(value == 2) => true

        // Check there are no divisors up to value except 1
        case value if(divisor == value) => true
        
        // Check if there are other factors
        case value if(value % divisor == 0) => false

        // Check for next divisor
        case _ => isPrime(value, divisor + 1)
    }
    
}