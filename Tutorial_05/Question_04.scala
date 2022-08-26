// SCS2204 Tutorial 05 Question 04 (Indirect)
object Question_04 {
    // Starting point
    def main(args: Array[String]) = {

        // Get the user input value
        print("Enter your value: " );
        var n = scala.io.StdIn.readInt();
        
        // Validate input
        while(n <= 0) {
            println("Please enter valid value!");
            print("Enter your value: " );
            n = scala.io.StdIn.readInt();
        }
    
        // Display the output
        println("Is " + n + " an even number? " + isEvenNo(n));
    }

    // The functions to identify number 
    def isEvenNumber(value: Int): Boolean = 
    value match{
        case 0 => true
        case _ => isOddNumber(value - 1)  // Calling Odd function
    }


    def isOddNumber(value: Int): Boolean = !(isEvenNumber(value))
}