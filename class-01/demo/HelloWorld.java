public class App {

    // properties / fields / variables
    // methods / functions

    // the int, takes less space in memory than double
    static int myIntegerNotInitialized;    // value is zero by default
    static int myIntegerInitialized = 5;   //    [     ]
    static double myDoubleValue = 9.7;     //    [          ]


    //int []intArray = {2,1,5,4,8};  // arrays have fixed size in java , all items should be of the same data type
    static int []intArray = new int[8];


    // Starting point of the app
    public static void main(String[] args) {
        myIntegerInitialized = (int) myDoubleValue;  // cannot assign a double value (larger in space) to integer value (smaller in space) without explicit casting
        myDoubleValue = myIntegerNotInitialized;     // it is possible to assign an int value (smaller in space) to double value (larger in space) and it will be automatically casted, implicit casting
        loop(myIntegerInitialized);
    }

    // functions .. we should specify return type, and if I am not returning, the type is void
    static void loop(int y){ // a funcion we created, called loop
        // printing even values less than or equal the number provided
        // while loop, for loop, do while

//        while(y > 0){
//            if(y%2==0)
//                System.out.println(y);
//            y--;
//        }

        for(int i = y; i > 0; i--){
            if(i%2==0)
                System.out.println(i);
        }

    }

    int shouldReturnAvalue(double x){
        return 0;
    }

}