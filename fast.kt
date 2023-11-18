import kotlin.random.Random

class Fast() {
    fun trainSostav(people:Int): Map<Int, Int>{
        var pass=0
        var sostav= mutableMapOf<Int, Int>()
        var number =1
        while(pass<people){
            var kol_vo = Random.nextInt(5,26)
            sostav[number] = kol_vo
            number++
            pass += kol_vo
        }
        return sostav
    }
}