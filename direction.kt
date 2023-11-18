class Direction {
    fun createRoute(): String {
        val cityList = listOf(
            "Санкт-Петербург", "Москва", "Вологда", "Екатеринбург", "Саратов", "Сочи",
            "Красноярск", "Новосибирск", "Минск", "Гомель", "Волгоград", "Казань", "Краснодар", "Омск", "Пермь"
        )
        val city1 = cityList.random()
        var city2 = cityList.random()
        while (city1 == city2) {
            city2 = cityList.random()
        }
        val route = "$city1-$city2"
        return route
    }
}