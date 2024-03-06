package fast.part0.basic_kotlin

fun main(){
    val result = test(3, c = 5)
    println("result at main: $result")
    test2(name="Zoe Shin", nickname = "Zoe", id = 1)
    println(times(2,3))
}

// 2. 함수
fun test(a: Int, b: Int = 3, c: Int = 4) : Int{
    println("$a+$b+$c")
    return a + b + c
}

fun test2(id: Int, name: String, nickname: String) = println("id: $id, name: $name, nickname: $nickname")

fun times(a: Int, b: Int) = a * b