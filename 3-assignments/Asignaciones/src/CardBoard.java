class CardBoard {
    /*
    Solo un objeto CardBoard (c1) es elegible, pero tiene objeto wrapper Short asociado
    que también es elegible.
     */
    Short story = 200; //Cuenta como objeto

    public static void main(String[] args) {
    CardBoard c1 = new CardBoard();
    CardBoard c2 = new CardBoard();
    CardBoard c3 = new CardBoard();
    c1 = null; //Objeto
    //haz algo :D
    }

    CardBoard go(CardBoard cb){
        cb = null;
        return cb;
    }
}
