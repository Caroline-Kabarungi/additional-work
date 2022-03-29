fun main(){
    // create a function that takes in a name and prints out"hello${name}"eg given "ada" it prints out "hello ada"
   var name=("Ada")
    println("hello $name")
    var vit= division(3,5)
    println(vit)
    var plus=add(3,6,8,9)
    println(plus)
    sentence()


}
fun carol(name:String){
    var me="hello$name"
}
// create and invoke a function that given two numbers it returns a remainder of their division.
fun division(num1:Int,num2:Int):Int {
    var modulus=num1%num2
     return modulus
}
// create and invoke function that returns a sum of any given four numbers.
fun add(digit1:Int,digit2:Int,digit3:Int,digit4:Int):Int{
    var sum=digit1+digit2+digit3+digit4
    return sum
}
//create and invoke that prints out an interesting fact about your.
fun sentence(){
    var word="I am beatiful"
    println(word)



}


