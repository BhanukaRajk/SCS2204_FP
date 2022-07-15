object Q3 {
    def main(args: Array[String]) = {
        val r: Double =  5;    //radius

        println("Volume of a sphere = " + SphereVolume(r));
    }

    def SphereVolume(Radius: Double): Double = {
        return math.Pi*Radius*Radius*Radius*4/3;
    }
}