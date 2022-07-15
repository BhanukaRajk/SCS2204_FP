object Q4 {
    def main(args: Array[String]) = {
        val copycount: Int = 60;        //copycount = no. of copies
        println("Price for " + copycount + " books = Rs." + TotalPrice(copycount));
    }

    def TotalPrice(quantity: Int): Float = {
        return quantity*24.95f*0.6f + ShippingCost(quantity);   //price with discount + shipping cost
    }

    def ShippingCost(quantity: Int): Float = {
        if (quantity>50) { return quantity*3.0f + (quantity-50)*0.75f; }
        else { return quantity*3.0f; }
    }
}