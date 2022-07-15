object Q4 {
    def main(args: Array[String]) = {
        val copycount: Int = 60;        //copycount = no. of copies
        println("Price for " + copycount + " books = Rs." + TotalPrice(copycount));
    }

    def TotalPrice(quantity: Int): Float = {
        return Float = quantity*24.95f*0.6f + ShippingPrice(quantity);
    }

    def ShippingPrice(quantity: Int): Float = {
        if (quantity>50) { return 3.0f + (quantity-50)*0.75f; }
        else { return 3.0f; }
    }
}