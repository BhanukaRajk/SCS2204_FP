object Q2 {
    def main(args: Array[String]) = {
        println("Centigrade value = 35'");       //default value
        println("Farenheit value = " + CentigradeTOFarenheit(35));
    }

    def CentigradeTOFarenheit(C :Double): Double = {
        return C * 1.8000 + 32.00;
    }
}