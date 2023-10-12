class Main {
  public static void main(String[] args) {

      class livingBeing {
        boolean isAlive;

        void speak() {
          System.out.println("I'm alive");
        }

        
      }

      class Animal extends livingBeing {
          String name;
          int age;
      
          void eat() {
              System.out.println(name + " is eating");
          }
      
          void sleep() {
              System.out.println(name + " is sleeping");
          }
      }
      
      class Dog extends Animal {
          String breed;
      
          void bark() {
              System.out.println(name + " is barking");
          }
          void eat() {
              System.out.println(name + " loves to eat!");
          }
      }

    Dog buddy = new Dog();

      buddy.name = "Buddy";
    buddy.breed = "Labrador";
    buddy.age = 7;
    buddy.isAlive = true;


    System.out.println(buddy.isAlive);
    buddy.bark();
    buddy.eat();
    buddy.speak();
    



    // EXAMPLE 2 


    class User  {
      String name;
      String email;
      String password;

      void login(){
        System.out.println("logging in!");
      }
      void makeSong(){
        System.out.println("making a song!");
      }
      
    }

    class Admin extends User {
      boolean isAdmin = true;
      

      void makeUser(){
            System.out.println("making user");

      } 
      void deleteUser(){
            System.out.println("deleting user");

      }
      void publishSong(){
            System.out.println("publishing song");

      }
    }

    class SuperAdmin extends Admin {
      void deleteAdminUser() {
        
      }
    }

 

    User john = new User();

    john.name="john";
    john.email="john@gmail.com";
    john.password="12345";

    john.login();

    Admin dimos = new Admin();

    dimos.publishSong();
    dimos.makeSong();

    john.makeSong();

    
  }
}
