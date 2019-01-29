
/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    int age = 99;
    int weight = 35;
    String address = null;
    String color;
    
    public void initialize(String name){
    this.name = name;
    this.age = age;
    this.weight = weight;
    //this.address = address;
    this.color = color;
    }
 
   
    public void initialize(String name, int weight, int age){
    this.name = name;
    this.age = age;
    this.weight = weight;
    //this.address = address;
    this.color = color;
    }
    
       
    public void initialize(String name, int age){
    this.name = name;
    this.age = age;
    this.weight = weight;
    //this.address = address;
    this.color = color;
    }
    
    public void initialize(int weight, String color){
    //this.name = name;
    this.age = age;
    this.weight = weight;
    //this.address = address;
    this.color = color;
    }
    
    public void initialize(int weight, int color, int adress){
    //this.name = name;
    this.age = age;
    this.weight = weight;
    this.address = address;
    this.color = color;
    }

    public static void main(String[] args) {

    }
}

