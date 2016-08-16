/**
 * Created by charanjiths on 12/8/16.
 */
class TestProgram {
    static void main(args){
        println "Hello World"
        f1weakTyping();
        f2List();
        f3Map();
        f4Loop();

    }

    static def f4Loop(){

        5.times{
            println" Hello 5 times"
        }

        ['cat', 'dog', 'hamster'].each { name ->
            println name
        }

        (6..10).each { number ->
            println number
        }

        [fruit:'Apple', veggie:'Carrot', car:'Sedan'].each { key, value ->
            println "${key} = ${value}"
        }

    }


    static def f3Map(){
        def emptyMap = [:]
        def mapWithValues = [fruit:'Apple',  veggie:'Carrot']

        
    }

    static def f2List(){
        def alist = [5, 1, 3, 5]
        println alist
        println alist.collect{it * 10}

        def myList = [10, "John", new Integer(5), new Double(7.6d)]
        println myList

        def blist = ["Apple", "Banana", "Carrot"]
        println blist[1]

        def clist = ["Apple", "Basketball", "Championship"]
        println clist*.length()
    }

    static def  f1weakTyping(){
        def a = 'Charanjit Singh'
        println a
        a = new Object()
        a = 10
        println a
    }

}
