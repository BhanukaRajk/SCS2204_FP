// SCS2204 Tutorial 05 Question 03
object Question_03 {
    // Starting point
    def main(args: Array[String]) = {

        // Get the ending value
        print("Enter ending value: " );
        var n = scala.io.StdIn.readInt();
        
        // Validate input
        while(n < 0) {
            println("Please enter valid value!");
            print("Enter ending value: " );
            n = scala.io.StdIn.readInt();
        }
    
        // Display the output
        println("Sum of 0 to " + n + ": " + sum(n));
    }

    // Function to calculate value
    def sum(LastNo: Int): Int = {
        LastNo match {
            case 0 => 0
            case 1 => LastNo
            case _ => LastNo + sum(LastNo - 1)
        }
    }
    
}