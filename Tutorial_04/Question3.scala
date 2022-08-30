object Question3 {

    def toUpper(word: String): String = word.toUpperCase()
    def toLower(word: String): String = word.toLowerCase()

    def formatNames(name: String)(method: String => String): String = method(name)

    def main(args: Array[String]) = {

        val Names: List[String] = List("Benny", "Niroshan", "Saman", "Kumara")

        println(formatNames(Names(0))(toUpper(_)))
        println(formatNames(Names(1).substring(0,2))(toUpper(_)) + Names(1).substring(2))
        println(formatNames(Names(2))(toLower(_)))
        println(Names(3).substring(0,5) + formatNames(Names(3).substring(5))(toUpper(_)))
    }

}