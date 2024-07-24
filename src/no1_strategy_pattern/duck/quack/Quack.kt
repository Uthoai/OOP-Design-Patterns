package no1_strategy_pattern.duck.quack

class Quack: QuackBehavior {
    override fun quack() {
        println("Quack")
    }
}