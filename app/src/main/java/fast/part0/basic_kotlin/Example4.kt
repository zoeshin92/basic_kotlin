package fast.part0.basic_kotlin

fun main(){
    val user = User("Zoe", 25, true)
//    println(user.age)
   Kid("Felix", 25, "male")

}

open class User(open val name: String, open var age: Int = 31, b: Boolean)

class Kid(override val name: String, override var age: Int): User(name, age, true){
    var gender: String = "female"

    init {
        println("초기화 중 입니다.")
    }
    constructor(name: String, age: Int, gender: String): this(name, age){
        this.gender = gender
        println("부생성자 호출")
    }
}