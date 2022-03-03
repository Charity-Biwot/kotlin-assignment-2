
fun main() {
    //function printing out "akirachix" composed of the 1st,2nd and 4th characters
    var college = "akirachix"
    var result = college[0].toString() + college[2] + college[3]
    println(result)
    word()

    //function that takes in 2 parameters
var d =stmt("charity",20)
    println(d)
    me()


}
fun stmt(name:String, age:Int):String{
    var sentence = ("Hi my name is $name and i am $age years old ")
    return sentence

    }

// function that takes in a string and returns its length
fun word(){
    var takeString= "Baringo"
    println(takeString.length)
}
fun me() {
    var name = "charity"
    if (name == "chiry") {
        println("thats me")
    } else
        println("i don't know who that is")

}


















