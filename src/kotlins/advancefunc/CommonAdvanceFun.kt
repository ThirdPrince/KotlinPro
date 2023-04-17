package kotlins.advancefunc

/**
 * @Author dhl
 * @Date 2023/4/17
 * 常见高阶函数
 */
fun main(args: Array<String>) {
    //  forEachDemo()
    // ::mapDemo.invoke()
    flatMapDemo()
}

/**
 * 高阶函数 forEach 是可迭代对象的扩展方法，接收函数 是（T） -> Unit 的参数action,forEach 会讲action会讲action 这函数作用于可迭代对象的每个元素
 *   public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit {
for (element in this) action(element)
}
 */
fun forEachDemo() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    list.forEach { println(it) }
    list.forEach(::println)
    list.forEachIndexed { index, i ->
        println("index = $index,value = $i")
    }
}

/**
 * 高阶函数map 也是可迭代对象的扩展方法，根据map的源码于注释
 * 我们知道map 接收一个类型是（T）-R 的参数transform map会将transform
 * 作用于可迭代中的每个元素，最终返回一个新的集合List
 */
fun mapDemo() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // 将int 数组中的元素经过某种运算形成一个新的int 数组
    val lambda = { arg1: Int -> arg1 * 2 + 3 }
    val newList = list.map(lambda)
    //val newList = list.map { lambda }
    newList.forEach(::println)
    /**
     * toDouble 是Int 类中的一个方法，当使用类名::方法名 这种方式引用一个成员方法时，会自动在函数类型的参数列表多出一个接收者 Receiver
     * 用于接收类型对象，刚好toDouble 没有参数列表,因此Int::toDouble 对应的函数类型是（Int）->Double 符合高阶函数 参数要求
     */
    val newList2 = list.map(Int::toDouble)
    newList2.forEach(::println)
    val newList3 = list.map {
        it.toDouble()
    }
    newList3.forEach(::println)

}

/**
 * 高阶函数flatMap 比Map 搞一个维度，可以将迭代对象中的每个可迭代对象进行处理，最终返回一个扁平化的可迭代对象，注意参数
 * transform 的函数类型是（T)->Iterable<R>
 *  扁平化就是多维变一维
 */
fun flatMapDemo() {
    val list = listOf(8..10,
            1..3,
            98..100)
    val flatList = list.flatMap {
        it
    }
    flatList.forEach { println(it) }

    val flatList2 = list.flatMap { intRange ->
        intRange.map {
            "No.$it"
        }
    }
    flatList2.forEach { println(it) }
}
