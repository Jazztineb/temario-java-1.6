/*
    As there is no droppable tile for the variable x and the parentheses (in the Kinder constructor)
    are already in place and empty, there is no way to construct a call to the superclass constructor
    that takes an argument.

    https://coderanch.com/t/252519/certification/Chapter-Drag-Drop
 */

public class Kinder extends AgedP {
    public Kinder(int x){
        /*
        Therefore, the only remaining possibility is to create a call to the
        no-arg superclass constructor. This is done as super();
         */
        super();
    }
}
