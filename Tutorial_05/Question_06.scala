// SCS2204 Tutorial 05 Question 06
object Question_06 {
    // Starting point
    def main(args: Array[String]) = {

        // Get the ending value
        print("Enter ending value: " );
        var n = scala.io.StdIn.readInt();
        
        // Validate input
        while(n <= 0) {
            println("Please enter valid value!");
            print("Enter ending value: " );
            n = scala.io.StdIn.readInt();
        }
    
        // Display the output
        print("Fibonacci sequence with first " + n + " elements:");
        DisplayValue(n-1);
    }

    // Function to calculate value
    def Fibonacci(last:Int):Int = {
        if(last == 0) {
            return 0;
        } else if(last == 1) {
            return 1;
        } else {
            Fibonacci(last-1) + Fibonacci(last-2);  // Binary recursive
        }
    }

    // Calculate and display elements
    def DisplayValue(n:Int): Unit = {
        if (n > 0)
            DisplayValue(n-1);
        print(" " + Fibonacci(n));
    }
    
}