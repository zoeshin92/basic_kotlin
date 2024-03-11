package fast.part0.basic_kotlin

fun main() {
    var name: String = "Zoe"    //non nullable
    var nickname: String? = null    // nullable

    var number: Int = 10
    var secondNumber: Int? = null

    val result1 = if(nickname == null) "값이 없음" else nickname
    println("result1: $result1")

    val result2 = nickname?: "값이 없음"
    println("result2: $result2")

    nickname = ""
    val size = nickname?.length
    println("nickname?.length: $size")
}