fun main(){

    grading()

}

fun grading() {

    var marks = 0


    if (marks >= 0 && marks <= 24){
        println("grade = F")
    }

    else if (marks >= 25 && marks <= 39){
        println("grade = D")
    }
    else if ( marks >= 40 && marks <= 59){
        println("grade = C")
    }
    else if (marks >= 60 && marks <= 79){
        println("grade = B")
    }
    else if (marks >= 80 && marks <= 100){
        println("grade = A")
    }
    else{
        println("Invalid Input")
    }

}




