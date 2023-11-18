import kotlin.random.Random

class CashDesk( val min: Int, val max: Int) {
    fun sellTicket():Int {
        val sell = Random.nextInt(min, max + 1)
        return sell } }