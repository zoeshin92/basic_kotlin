package fast.part0.basic_kotlin

fun main() {
    val list1 = mutableListOf(1,2,3,4,5)
    list1.add(6)
    list1.addAll(listOf(7,8,9))

    // immutable (수정 X)
    val list2 = listOf(1,2,3,4)
//    print("list2[0]: " + list2[0].toString())

    println(list2.map { it * 10}.joinToString("/"))

    val divereList = listOf(1, "안녕", 1.78, true)

    print(list1.joinToString(","))

    val map1 = mapOf((1 to "안녕"), (2 to "Hello"))
    val map2 = mutableMapOf((1 to "안녕"), (2 to "Hello"))
    map2.put(3, "nice to meet you")
    map2[4] = "How are you"
}