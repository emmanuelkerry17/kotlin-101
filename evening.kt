fun main() {
//println("my  first website was a month ago")
////    print("watch more reels")
//    var word = "car"
//    word= "chum"
//    println(word)
    texts()
operators()
    state()

}
fun texts() {
    println("this is the best drag race in texts ")
    var no: Int = 65
    var d: Double  =4.67
    var bb: Boolean = true
    var cc :Char = 'j'
    val oo :String = "dell"

//    val cannot be reassigned


    var year: Int = 2023
    var course: String = "mit"
    var name: String = "nevil"
    val school: String = "learning"


//    print("my name is $name and my school is $school the course i take is $course which i took in $year ")

}

fun operators() {
    var math: Int = 89
    var chem: Int = 67
    var module: Int = math % chem

//    println(module)
//
//
//    println(math + chem)
}
    fun state(){

//        var marks:Int = 12
//        var average:Int = 50
//
//        if(marks > average){
//            println("wrong")
//        }else{
//            println("correct")
//
//        }
        var no:Int =0

        if(no > 0){
            println("positive")
        }else if(no < 0){
            println("negative")
        }else
            println("no is zero")

        var check :Int = 4
        if(check%2==0)
            println("even")
        else if(check % 2!=0)
            println("odd")

        var tt:Int = 506
        var hh:Int = 666
        var dd:Int = 7465

        var av =(tt+hh+dd)/3
        println(av)

        if(av <= 20){
            print("D")
        }
        else if(av <=40){
            print("C")
        }else if(av <=60){
            print("B")
        }else if(av <=80){
            print("A")
        }else if(av<=100){
            print("A+")
        }else if(av<0 ){
            print("invalid value")
        }else if(av>100){
            print("too high")
        }







    }









