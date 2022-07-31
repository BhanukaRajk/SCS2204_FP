object Question1 {
    def main(args: Array[String]) = {

        print("Enter your debit amount: " );
        var Deposit = scala.io.StdIn.readFloat();

        while(Deposit <= 0) {
            println("Please enter valid amount!");
            print("Enter your debit amount: " );
            Deposit = scala.io.StdIn.readFloat();
        }

        println("The amount of interest for Rs. " + "%1.2f".format(Deposit) + 
                " = Rs. " +  "%1.2f".format(interest(Deposit)));
    }


    def interest(Amount: Float): Float = 
    Amount match {
        case x if x < 20000 => x*0.02f
        case x if x < 200000 => x*0.04f
        case x if x < 2000000 => x*0.035f
        case x if x > 2000000 => x*0.065f
        }

}
