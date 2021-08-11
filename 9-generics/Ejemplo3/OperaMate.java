/*
    Tipos limitados (Bounded types)
 */

class OperaMate<T extends Number> { //Limite superior inclusivo

    T num;

    OperaMate(T n){ //Se pasa al constructor una referencia a un objeto numérico
        num = n;
    }

    double reciproco(){
        return 1/num.doubleValue();
    }

    double fraccion(){
        return num.doubleValue() - num.intValue();
    }
}
