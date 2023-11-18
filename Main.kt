fun main() {
    var finishTrip =true
    while(finishTrip){
        println("Создать направление ")
        val direction = Direction().createRoute()
        println("Маршрут поезда $direction")
        println()

        println("Продать билеты")
        val ticket= CashDesk(5,201).sellTicket()
        println("Продано $ticket билетов")
        println()

        println("Собрать состав")
        val train = Fast().trainSostav(ticket)
        train.forEach { (key, value) ->
            println("Вагон номер $key вместимостью $value пассажиров")
        }
        println()
        println("Отправить поезд")
        println("Поезд $direction, состоящий из ${train.entries.last().key} вагонов отправлен ")
        println("Вы хотите закончить?\n1.Да\n2.Продолжить")
        if(readln()=="1"){
            finishTrip = false
        }
    }
}