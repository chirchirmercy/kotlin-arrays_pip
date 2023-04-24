fun main(){
   people("faith","judith")
    item()
    var sum=sum(23,39,37,40)
}
//1. Create a function that takes in 2 strings and creates an array out of them then
//prints out the array
fun people(person1:String,person2: String){
var person = arrayOf(person1,person2)
    println(person.contentToString())
}//2. Create a function that given an array below:

//var items = arrayOf(“car”, “pen”)
//prints out the names of items in the correct grammatical case.
fun item(){
    var items = arrayOf("umbrella","pen")
    items.forEach { city-> println(city.capitalize()) }

}
//create a function that print intergers and return the sum of the intergers
fun sum(num1:Int,num2:Int,num3:Int,num4:Int):Int {
    var sum = num1 + num2 + num3 + num4
    return(sum)

}
