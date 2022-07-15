object Q5 {
    def main(args: Array[String]) = {
        println("Total time = " + (EasyPace(2)+Tempo(3)+EasyPace(2)) + "min");
    }

    def EasyPace(distance: Int): Int = return distance*8;

    def Tempo(distance: Int): Int = return distance*7;
}