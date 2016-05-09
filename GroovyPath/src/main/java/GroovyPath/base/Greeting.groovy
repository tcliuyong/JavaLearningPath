package GroovyPath.base

/**
 * Created by liuyong on 2016/5/9.
 */
class Greeting {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            println("ho ")
        }
        for(i in 0..2){
            println i
        }
        0.upto(2){
            print "$it"
        }
        0.step(10,2){
            print "$it"
        }
        println("Merry Groovy")
    }
}