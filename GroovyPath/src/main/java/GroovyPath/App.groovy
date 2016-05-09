package GroovyPath;
import GroovyPath.base.*
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car = new Car(100)
        println "Year:$car.year";
        println "Mile:$car.miles";
        car.miles = 25;
        println "Mile:$car.miles"
    }
}
