/* public class DogTestDrive {
    public static void main (String[] args){
        Dog d = new Dog(); //make a new object
        d.size=40;// the dot operator(.) gives you access to an instance variable
        d.bark();// the dot operator(.) gives you access to a method
    }
}
class Dog{
    int size; //instances variable
    String breed;//instances variable
    String name;//instances variable

    void bark(){
        System.out.print("Ruff! Ruff!");
    }//method
}

*/
class Woulou {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        Woulou one = new Woulou();
        one.size = 70;
        Woulou two = new Woulou();
        two.size = 8;
        Woulou three = new Woulou();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}