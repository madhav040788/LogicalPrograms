package org.example.designPaturn;

public class Singleton {
    // private static variable for instance of class
    private static Singleton instance;
    // private constructor for instantiation outside the class
    private Singleton(){ }
    // public method to get instance for outside access
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance=new Singleton();  } // Correct instance creation
        return instance;   }
    // method accessible outside the class
    public void showMessage(){
        System.out.println("this is singleton class...");   }  }
class Main{
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.showMessage();
    }
}
