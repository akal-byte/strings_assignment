fun main() {
var response=details(name = "akal",age=21)
    println(response)
    var place=length("gigiri")
    println(place)
    identity("akal")
    index()
}
fun index(){
    var school="akirachix"
    var d=school[0]
    var r=school[2]
    var t=school[3]
    println("$d$r$t")
}
fun details(name:String,age:Int):String {
    var x=name
    var y=age
    return ("hi my name is $x and I am $y years old")
}
fun length(location:String):Int {
    return location.length
}
fun identity(name:String){
    if (name=="akal"){
        println("thats me!")
    }
    else{
        println ("I dont know who that is!")
    }
}