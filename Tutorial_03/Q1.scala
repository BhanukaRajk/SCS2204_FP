object Q1 {
    def main(args: Array[String]) = {
        val r: Double =  5;    //radius
        print("Area of the disk = " + DiskArea(r));
    }

    def DiskArea(Radius: Double): Double = {
        return math.Pi*Radius*Radius;
    }
}