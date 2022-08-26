// SCS2204 Tutorial 05 Question 05
object Question_05 {
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
        print("Sum of even numbers from 0 to " + n + ": ");

        // Calculate and display the output value
        if(n % 2 == 1){
            n = n - 1;
        }
        println(SumofEvens(n));

    }

    // Function to calculate value
    def SumofEvens(last: Int): Int = {
        last match {
            case 0 => 0
            case _ => last + SumofEvens(last - 2)
        }
    }
    
}