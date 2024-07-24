package no1_strategy_pattern.duck

import no1_strategy_pattern.duck.fly.FlyBehavior
import no1_strategy_pattern.duck.quack.QuackBehavior

abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    open fun swim(){
        println("All duck can swim. Even decoy!!")
    }

    open fun performFly(){
        flyBehavior.fly()
    }

    open fun performQuack(){
        quackBehavior.quack()
    }

    open fun setFlyBehaviors(fb: FlyBehavior){
        flyBehavior = fb
    }

    open fun setQuackBehaviors(qb: QuackBehavior){
        quackBehavior = qb
    }

}