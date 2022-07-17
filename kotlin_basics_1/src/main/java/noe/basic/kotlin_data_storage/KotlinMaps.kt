package noe.basic.kotlin_data_storage

fun main (){
   //IMMUTABLE
    val daysOfTheWeek = mapOf<Int,String>(1 to "monday", 2 to "tuesday", 3 to "wednesday", 4 to "thursday",5 to "friday", 6 to "saturday", 7 to "sunday")
    println(daysOfTheWeek.getValue(3))

    val countryRanking = mapOf<String,Int>("China" to 1,"Mexico" to -1 )
    println(countryRanking["Mexico"])

    //iterate through a map
    for (key in countryRanking.keys){
        println(countryRanking[key])
    }


    //MUTABLE
    val countryRankingMutable = mutableMapOf<String,Int>(
        "Mexico" to 1, "China" to 1,
    )
    //TODO he aqui
    countryRankingMutable["China"]=2
    countryRankingMutable.put("Brazil",3)

    for (obj in countryRankingMutable.toSortedMap()){
        println(obj)
    }

}