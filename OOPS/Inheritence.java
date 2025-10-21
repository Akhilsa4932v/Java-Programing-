// package OOPS;

// public class Inheritence {
//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }

/*single inhertence */

// //base class or parent class

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }

//     void breathe(){
//         System.out.println("Breathes");
//     }
// }
     
// //derived class

// class Fish extends Animal{
//     String Swims;

//     void swim(){
//         System.out.println("swims");
//     }
// }


//multi-level inheritence

/*
public static void main(String[] args) {
    Dog nickey = new Dog();
    nickey.eat();
    nickey.legs = 4;
    System.out.println(nickey.legs);
}


//base class or parent class

class Animal{
String color;

void eat(){
    System.out.println("Eats");
}

void breathe(){
    System.out.println("Breathes");
}
}

//derived class

class Mamal extends Animal{
String Swims;

void swim(){
    System.out.println("swims");
}
}

//2nd derived class

class Dog extends Mamal{
int legs;
}

*/


/*Heirarcial inheritence */

// class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eats");
//     }
//     void breath(){
//         System.out.println("Breathes");
//     }
//     void sleep(){
//         System.out.println("sleeps");
//     }
// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swims");
//     }
// }

// class Mammals extends Animal{
//     void friendly(){
//         System.out.println("Friendly");
//     }
// }


//Hybrid inherit
/* 

public class JavaBasic{

    public static void main(String[] args) {
        Shark s1 = new Shark();
        s1.eat();
        
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breathes");
    }
    void sleep(){
        System.out.println("sleeps");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Mammals extends Animal{
    void friendly(){
        System.out.println("Friendly");
    }
}

class Tuna extends Fish{
    void tastes(){
        System.out.println("tastes");
    }
}

class Shark extends Fish{
    void danger(){
        System.out.println("kills");
    }
}

class Bird{
    void fly(){
        System.out.println("flying");
    }
}


class Peacock extends Bird{
    void colorful(){
        System.out.println("colorful");
    }
}*/


//MULTIPLE INHERTENCE  CAN BE MADE IN C++ USING CLASS BUT IN JAVA WE CANT MAKE DIRECTLY USING CLASS , BUT INDIRECTLY BY USING INTERFACES WE CAN MAKE 