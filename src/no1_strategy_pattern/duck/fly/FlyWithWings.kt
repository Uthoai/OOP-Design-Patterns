package no1_strategy_pattern.duck.fly

class FlyWithWings: FlyBehavior {
    override fun fly() {
        println("I am Flying")
    }
}