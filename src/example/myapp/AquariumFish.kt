package example.myapp

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("Hunt and Eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Eat Algae")
    }
}

interface FishAction {
    fun eat()
}
