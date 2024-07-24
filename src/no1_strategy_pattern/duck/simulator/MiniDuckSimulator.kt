package no1_strategy_pattern.duck.simulator

import no1_strategy_pattern.duck.Duck
import no1_strategy_pattern.duck.duck_type.MallardDuck
import no1_strategy_pattern.duck.duck_type.ModelDuck
import no1_strategy_pattern.duck.fly.FlyRocketPowered

fun main(){
    val mallardDuck: Duck = MallardDuck()
    mallardDuck.display()
    mallardDuck.swim()
    mallardDuck.performQuack()
    mallardDuck.performFly()

    println()

    val modelDuck: Duck = ModelDuck()
    modelDuck.display()
    modelDuck.performQuack()
    modelDuck.performFly()
    modelDuck.setFlyBehaviors(FlyRocketPowered())
    modelDuck.performFly()
}