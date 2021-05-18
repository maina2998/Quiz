fun main(){
var d = Truck("KWD 789E",678.9,89)
     d.totalweight

     println(weightcheck(1900))


}
data class Book(var Title:String,var Author:String,var pages:Int)
     fun books(book:List<String>):List<String>{
          var books= listOf(
               Book("Born a crime","Trevor Noah",567),
               Book("Marijuana","Dorcas Njie",345),
               Book("Vincenturies","George Njue",789)

          )
return book

     }
data class Truck(var registration:String,var totalweight:Double,var capacity:Int)
           fun load(weight:Int){
                var i = 0
                i++
                println(i)

           }
            fun unload(weight:Int){
                 var t = 0
                 t--
                 println(t)

            }
         fun weightcheck(weight: Int):String {
              var truck = 0
              if (truck >= 1000) {
                   return ("overloaded")
              } else{
                   return ("under overloaded")
              }

         }
data class Trailer(var registration:String,var totalweight:Double,var capacity:Int,var wheel:Int)
           fun weightCheck(){
                var weight = 0
                if (weight >= 1000) {
                     return
                }
                }

