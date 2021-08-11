import java.util.HashMap;
import java.util.Map;

enum Pets{DOG, CAT, HORSE}

class Dog {
        public String name;

        public Dog (String n){
            name = n;
        }

        @Override
        public boolean equals(Object o) {
            if ((o instanceof Dog) && (((Dog) o).name == name)) {
                return true;
        } else {
                return false;
            }
    }
    public int hashCode(){
            return name.length();
    }
    }

    class Cat{

    }

