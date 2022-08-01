object Question5v2 {

    def toUpper(word: String, miss: Int): Any = {
        var i: Int = 1
        if(miss == 0) {
            println(word.toUpperCase())
        }
        else {
            for (c <- word) {
                if (i == miss) { print(c.toUpper) }
                else { print(c) }
                i = i + 1
            }
            print("\n")
        }
   
    }


    def toLower(word: String, miss: Int): Any = {
        var i: Int = 1
        if(miss == 0) {
            println(word.toLowerCase())
        }
        else {
            for (c <- word) {
                if (i == miss) { print(c.toLower) }
                else { print(c) }
                i = i + 1
            }
            print("\n")
        }
   
    }

    def formatNames(name: String)(func: (String, Int) => Any)(miss: Int): Any = func(name, miss)

    def main(args: Array[String]) = {
        formatNames("Benny")(toUpper(_, _))(0)
        formatNames("Niroshan")(toUpper(_, _))(2)
        formatNames("Saman")(toLower(_, _))(0)
        formatNames("Kumara")(toUpper(_, _))(6)
    }

}