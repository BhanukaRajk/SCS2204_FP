object Question4 {
    def main(args: Array[String]) = {

        print("Enter your value: " );
        var value = scala.io.StdIn.readInt();


        print("Value " + value + " is ");
        NumberType(value);
    }


    def NumberType(Number: Int): Any = 
    Number match {
        case x if (x == 0) => print("Zero");
        case x if (x < 0) => print("Negotive number");
        case x if (x%2 == 0) => print("Even number");
        case x if (x%2 == 1) => print("Odd number");
        }

}
