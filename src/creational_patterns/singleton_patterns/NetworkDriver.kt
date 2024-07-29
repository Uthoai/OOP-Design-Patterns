package creational_patterns.singleton_patterns
/*class NetworkDriver {
    init {
        println("Initializing: $this")
    }
    fun log(): NetworkDriver = apply { println("NetworkDriver: $this") }

}


fun main(){
    val n1 = NetworkDriver()
    n1.log()
    val n2 = NetworkDriver()
    n2.log()
}*/
//OutPut:
//Initializing: creational_patterns.singleton_patterns.NetworkDriver@119d7047
//NetworkDriver: creational_patterns.singleton_patterns.NetworkDriver@119d7047
//Initializing: creational_patterns.singleton_patterns.NetworkDriver@776ec8df
//NetworkDriver: creational_patterns.singleton_patterns.NetworkDriver@776ec8df



//Singleton.... One Instance


abstract class NetworkDriver {
    init {
        println("Initializing: $this")
    }

    companion object Network {
        private var INSTANCE: NetworkDriver? = null

        fun getInstance(): NetworkDriver {
            if (INSTANCE == null) {
                INSTANCE = ConcreteNetworkDriver()  // Instantiate a concrete subclass
            }
            return INSTANCE as NetworkDriver
        }
    }
}

// Concrete subclass of NetworkDriver
class ConcreteNetworkDriver : NetworkDriver()

fun main(){
    val n1 = NetworkDriver.Network
    println(n1.getInstance())
    val n2 = NetworkDriver.Network
    println(n2.getInstance())
}

//output:
//Initializing: creational_patterns.singleton_patterns.ConcreteNetworkDriver@4eec7777
//creational_patterns.singleton_patterns.ConcreteNetworkDriver@4eec7777
//creational_patterns.singleton_patterns.ConcreteNetworkDriver@4eec7777

// One Instance Only...
