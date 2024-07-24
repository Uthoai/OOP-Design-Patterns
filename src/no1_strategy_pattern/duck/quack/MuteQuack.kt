package no1_strategy_pattern.duck.quack

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("<<Silence>>")
    }
}