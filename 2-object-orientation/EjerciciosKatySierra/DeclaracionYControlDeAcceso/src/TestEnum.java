
     class TestEnum {

        Animals a;

        public   void main(String[] args) {
            System.out.println(a.DOG.sound + "" + a.FISH.sound);
        }
         enum Animals {
             DOG("WOOF"), CAT("MEOW"), FISH("BURBLE");
             String sound;

             Animals(String s) { //Constructor de animals
                 sound = s;      //Especie de this
             }

    }
}
