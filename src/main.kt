fun main() {
var farmer = Farmer("james", 45)
    var doctor = Doctor("joana", 23)
    //the type of that object is a class
    var banker = Banker("gany", 33)
    banker.eat()
farmer.cultivateLand()
    doctor.talk("mine")
  println(banker.countMoney(arrayOf(1,2,3,4)))
    doctor.treatpatient("jane", "TYphoid")
farmer.eat()
    println(farmer is Farmer)

    farmer.introduction()
    doctor.introduction()
    banker.introduction()

}
//you can not access the attributes without the var keyword
//the var keyword makes the attributes to becomes properties and accesible.
//this is the parent class
//this is the primary constructor
open class Person(var name:String, var age:Int){
    fun talk(words: String){
        println(words)
    }
    //when you to overound a function, you make it open
  //  you cannot override a function that has been overriden.
    open fun eat(){
        println("yum")
    }
    fun sleep() {
        println("zzz")
    }
open fun introduction(){
    println("Hi, my name is $name")
}
}
//this is the child class
    //make the class banker inherit from the parent class
class Banker( name:String,  age: Int):Person(name, age){
    fun countMoney(notes: Array<Int>): Int{
        var sum = 0;
        notes.forEach { not ->
            sum+=not
        }
        return sum
    }

}

class  Doctor(name: String, age: Int): Person(name, age) {
        fun treatpatient(patient:String, disease:String){
            println("Treating $patient for $disease")
        }

  override fun introduction() {
       // super.introduction()
      println("I am called doctor $name")
    }
}

class Farmer(name:String, age: Int):Person(name, age) {
        fun cultivateLand(){
            println("dig dig dig")
        }
    override fun eat() {
        //super executes what has been defined in the primary constructor
        super.eat()
println("Iam eating all the food i have grown")
    }

}
