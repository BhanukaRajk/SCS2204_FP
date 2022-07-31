object Question2 {

    case class CartItem(var Name: String, var Price: Double, var Quantity: Int)

    def main(args: Array[String]) = {

        var Cart = List(CartItem("Vanilla Ice cream",3.99, 13), 
                        CartItem("Chocolate biscuits",4.00, 6), 
                        CartItem("Cupcakes",7.77, 7))

        viewcart(Cart)
        icecream(Cart)
    }


    def viewcart(item: List[CartItem]) = {
        var i = 0
        println("-- Cart items --")

        while (i<item.length) {
            println("" + item(i).Quantity + " " + item(i).Name + " at " + item(i).Price + " each")
            i = i + 1
        }
    }



    def icecream(item: List[CartItem]) = {
        var i = 0;
        println("\n\n-- Searching vanilla ice cream --")

        while (i<item.length) {
            if(item(i).Name == "Vanilla Ice cream"){
                println("" + item(i).Quantity + " " + item(i).Name + " at " + item(i).Price + " each")
            }
            else {
                println("Found another item")
            }
            i = i + 1
        }
        
    }
}
