package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}

interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

object GoldColor : FishColor {
    override val color = "gold"
}

class Shark: FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("Hunt and Eat fish")
    }
}

// user interface delegation
class Plecostomus(fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor

