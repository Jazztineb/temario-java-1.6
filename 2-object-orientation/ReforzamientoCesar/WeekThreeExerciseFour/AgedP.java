/*
    As there is no droppable tile for the variable x and the parentheses (in the Kinder constructor)
    are already in place and empty, there is no way to construct a call to the superclass constructor
    that takes an argument.
 */

public class AgedP {

    /*
    Further, since the superclass constructor called is the no-arg
    version, this constructor must be created.

    It will not be created by the compiler because another
    constructor is already present.
     */
    AgedP(){

    }

    public AgedP(int x){

    }
}
