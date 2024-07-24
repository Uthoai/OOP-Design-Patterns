package no1_strategy_pattern.duck.duck_type

import no1_strategy_pattern.duck.Duck
import no1_strategy_pattern.duck.fly.FlyBehavior
import no1_strategy_pattern.duck.fly.FlyNoWay
import no1_strategy_pattern.duck.quack.Quack
import no1_strategy_pattern.duck.quack.QuackBehavior

class ModelDuck: Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = Quack()

    override fun display() {
        println("I am Model Duck.")
    }
}