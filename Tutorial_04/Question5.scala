object Question5 {

    def toUpper(word: String): String = word.toUpperCase()
    def toLower(word: String): String = word.toLowerCase()

    def formatNames(name: String)(method: String => String): String = method(name)

    def main(args: Array[String]) = {
        println(formatNames("Benny")(toUpper(_)))
        println(formatNames("Niroshan")(toUpper(_)))
        println(formatNames("Saman")(toLower(_)))
        println(formatNames("Kumara")(toUpper(_)))
    }

}