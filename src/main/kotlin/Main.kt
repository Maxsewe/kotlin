fun main(){
    marks()

}


fun marks() {
    var maths = 98
    var english = 65
    var physics = 46
    var chemistry = 25
    var history = 78

    var total = maths + english + physics + chemistry + history
    println(total)

    var percentage = 11

    if (percentage <0 && percentage >100){
        println("invalid")
    }

    if (percentage >= 80 && percentage <=100){
        println("grade = A")
    } else {
        if (percentage >= 60 && percentage <= 79) {
            println("grade = B")
        } else {
            if (percentage >= 40 && percentage <= 59) {
                println("grade = C")
            } else {
                if (percentage >= 20 && percentage <= 39) {
                    println("grade = D")
                } else {
                    println(" grade = F")
                }
            }
        }
    }
}

