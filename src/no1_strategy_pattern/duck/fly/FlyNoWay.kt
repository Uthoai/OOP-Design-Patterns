package no1_strategy_pattern.duck.fly

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("I can't Fly")
    }
}