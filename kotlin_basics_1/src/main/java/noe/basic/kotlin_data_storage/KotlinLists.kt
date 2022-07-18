package noe.basic.kotlin_data_storage

fun main() {
    //both of these type of lists, there values can be only be read
    //these lists are immutable
    val listOfMonths = listOf<String>("jan", "feb", "mar")
    val listOfAnyType = listOf(1, 2, 3, 4, "noe", 23.5F, false)
    println("size: ${listOfAnyType.size}")
    //convert immutable list to mutable
    val extendedListOfMonths = listOfMonths.toMutableList()
    extendedListOfMonths.add("april")
    extendedListOfMonths.add("may")
    extendedListOfMonths.add("june")
    //to add an array
    extendedListOfMonths.addAll(
        arrayOf(
            "july",
            "agust",
            "september",
            "october",
            "november",
            "december"
        )
    )
    for (elem in extendedListOfMonths) {
        //elem=""
        println(elem)
    }
    //declare a mutable list from the get go
    val friends = mutableListOf<String>("broc", "chu", "lalo")
    friends.add("alguien")
}