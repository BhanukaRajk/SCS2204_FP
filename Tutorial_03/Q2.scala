object Q2 {
    def main(args: Array[String]) = {
        println("Celcius value = 35'");       //default value
        println("Farenheit value = " + CelciusTOFarenheit(35));
    }

    def CelciusTOFarenheit(C :Double): Double = {
        return C * 1.8000 + 32.00;
    }
}