fun main (){
    remainder()
    m()

}

//Now, to check whether num is even or odd,
//we calculate its remainder using % operator
//and check if it is divisible by 2 or not
fun remainder (){

    var number = 3

    if(number % 2 ==0){
        println("$number is even")
    }

    else{
        println("$number is odd")
    }
}




fun m() {

    val num = 67

    val evenOdd = if (num % 2 == 0) "even" else "odd"

    println("$num is $evenOdd")
}