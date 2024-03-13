import java.sql.Time
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.LocalDate
import java.time.MonthDay
import java.time.DayOfWeek

fun main(){
    time()
    var a:Int = 1
    var b:Int = 2
    var c:Int = 3

if(a>b){
    print(a)
}
    else if(a>c){
        print(a)
    }
    else if(b>c){
        print(b)
    }
    else if(b>a){
        print(b)
    }
    else{
        print(c)
    }
}
fun time(){
        var now = LocalTime.now()
    println(now)

    var gg= LocalDateTime.now()
    println(gg)

    var uu= LocalDate.now()
    println(uu)

    var oo=MonthDay.now()
    println(oo)
    var ii=uu.dayOfWeek
    println(ii)
    var zz=uu.month
    println(zz)
var kk=uu.year
    println(kk)

    
    if(now<LocalTime.NOON)
        println("morning")
 else if(now>LocalTime.NOON)
        println("evening")
    else
        println("noon")





}


