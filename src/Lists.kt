
fun main() {

  println (nameList(listOf("sharon","faith","constant","promise","sheila","daisy","barnaba","miriam","jane","jack")))
 println(person(listOf(30.0,20.1,50.1,40.7)))
  persons()
getPerson()
  var car= listOf(
    Car("QWC789",100),
    Car("APY567",250)

  )
   println(car(listOf(100,250)))


}
fun nameList(names:List<String>):List<String> {
  var n = mutableListOf<String>()
  for (name in names) {
    if (names.indexOf(name) % 2 == 0) {
   n.add(name)
    }
  }
return n
}






fun person(height:List<Double>): Pair<Double,Double>{
   var sum=height.sum()
  var average=height.average()
  return Pair(sum,average)


}
data class Person(var name:String,var age:Int,var weight:Double,var height:Int)
fun persons(){
  var person= listOf(
    Person("sharon",20,30.0,4),

    Person("sheila",18,20.0,2),
    Person("faith",25,60.0,5),
    Person("constant",27,80.0,7)

    )
  var sortedperson =person.sortedByDescending { person -> person.name }
  println(sortedperson)
}
//4

data class person ( var name:String,var age:Int,var weight:Double,var height:Int)
     fun getPerson(){
       var people = mutableListOf(
         Person("sharon",20,30.0,4),

         Person("sheila",18,20.0,2),
         Person("faith",25,60.0,5),
        Person ("constant",27,80.0,7)
       )
         people.addAll(
           listOf(
             Person("promise",17,50.0,2),
             Person("Hamdi",22,40.8,4)


           )
         )
       println(people)



     }
data class Car(var registration:String,var mileage:Int)
  fun car(mileage: List<Int>):Int{
    var distance=mileage.average().toInt()
    return distance

  }

















