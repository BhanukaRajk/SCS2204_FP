// SCS2204 Tutorial 05 Question 02
object Question_02 {
    def main(args: Array[String]) = {

        // Get the ending point
        print("Enter the ending point value: " );
        var n = scala.io.StdIn.readInt();
        
        // Validate input (negotive numbers not allowed)
        while(n < 0) {
            println("Please enter non-negotive value!");
            print("Enter the ending point value: " );
            n = scala.io.StdIn.readInt();
        }
    
        // Display status
        print("\nPrime numbers upto " + n + ":")
        for( number <- 1 to n) {
            if(isPrime(number))
                print(" " + number);
        }
    }

    // Identify primes
    def isPrime(value: Int, divisor: Int = 2): Boolean =
    value match {
        // Check 0 and 1
        case value if(value < 2) => false

        // Check 2
        case value if(value == 2) => true

        // Check if there are other factors
        case value if(value % divisor == 0) => false
        case value if(divisor * divisor > value) => true

        // Check for next divisor
        case _ => isPrime(value, divisor + 1)
    }
    
}