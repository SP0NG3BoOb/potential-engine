interface Coordinates {
    fun x()
    fun y()
}


 class Point(private val coo: Int, private val coo1: Int): Coordinates {
    override fun toString(): String {
        return "x = $coo ; y = $coo1"
    }

     override fun x() {
         val c1 = Point(3,4)

     }

     override fun y() {
         val c2 = Point(3,4)

     }
    }




fun main(){
    val c1 = Point(3,4)
    val c2 = Point(3,4)

    println(c1.toString())
    println(c2.toString())
    println(c1.x().equals(c2.y()))

}





























