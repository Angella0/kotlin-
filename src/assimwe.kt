fun main() {
val x=school("akirachix")
    intro("angella",22)
    i()
    me("angella")
    me("liam")
}

fun school(name:String){
    val sch =name
    print(sch[0])
    print(sch[2])
    println(sch[3])

}
 fun intro(name:String,age:Int){
     val sentence ="Hi, my name is $name and i am $age years old."
     println(sentence)
 }
fun i(){
    val me="Angella"
    println(me.length)
}
fun me(name:String){
    if(name=="angella"){
        println("That's me !")
    } else {
        println("i don't know who that is.")
    }
    
}
