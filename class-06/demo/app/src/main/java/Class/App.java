/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Class;

import TheOtherPackage.Flower;
import TheOtherPackage.Rose;
import TheOtherPackage.Tulip;

public class App {


    public static void main(String[] args) {

        Rose whiteRose = new Rose("white rose", "white", 4,2);
        whiteRose.grow();

        Rose redRose = new Rose("Red rose",5,3);

        Tulip yellowTulip = new Tulip("yellow tulip", "Yellow",7,2);
        yellowTulip.grow();
        System.out.println("The yellow tulip height after growing is ..  "+ yellowTulip.getHeight());
        System.out.println("The yellow tulip bulb size after growing is ..  "+ yellowTulip.getBulbSize());


         //What instances can I assign to types?
//        Flower flower = new Flower("test","test", 1,2);
        Flower flowerTypeRoseInstance = new Rose("Rose flower", "red",2);                   // Objects are created on runtime
        Flower flowerTypeTulipInstance = new Tulip("Tulip flower", "pink", 3, 2);

        // Type parent = Instance child is valid
//        flower.grow();
//        System.out.println();
//        flowerTypeRoseInstance.grow();
//        System.out.println();
//        flowerTypeTulipInstance.grow();

        grow(flowerTypeRoseInstance);   // rose instance
        grow(flowerTypeTulipInstance);  // tulip instance



    }

    static void grow(Flower flower){
        // the running function will depend on the instance type passed in the runtime
        // Polymorphism
        flower.grow();
    }

}
