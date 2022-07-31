import scala.language.implicitConversions

object Question3OLD extends App {
    case class Car(name: String, price: Double)

    class CarUUID(car: Car) {
        def uuid = println("car uuid = " + car.name + " - " + car.name.hashCode)
    }

    object CarExtensions {
        implicit def uuid(car: Car): CarUUID = new CarUUID(car)
    }

    import CarExtensions._
    
    val Cars = List(Car("bmw 3 series", 20000),
                    Car("bmw 5 series", 50000),
                    Car("vw passat", 10000),
                    Car("vw golf", 12000),
                    Car("mazda 3", 15000))

    Cars.foreach(car => car.uuid)

}
