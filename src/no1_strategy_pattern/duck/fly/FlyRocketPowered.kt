package no1_strategy_pattern.duck.fly

class FlyRocketPowered: FlyBehavior {
    override fun fly() {
        println("I am Flying with Rocket!!")
    }
}