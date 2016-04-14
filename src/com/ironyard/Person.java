package com.ironyard;

/**
 * This class represents a Person.
 */
public class Person {

    /**
     * This is the name of our Person
     */
    private String name = "";

    /**
     * This is the age of our person
     */
    private int age = 0;

    /**
     * This is our person's height in decimal form.
     */
    public double height = 0;

    /**
     * This is how many high fives this Person has received.
     */
    private int numberOfHighFivesReceived = 0;

    /**
     * This is the default constructor for a Person
     * @param name This is the Person object's name
     * @param age This is the Person object's age
     * @param height This is the height of the Person object
     */
    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public Person(String name, double height){
        this.name = name;
        this.age = 18;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public void receiveHighFive(){
        this.numberOfHighFivesReceived++;
    }

    public int getNumberOfHighFivesReceived(){
        return this.numberOfHighFivesReceived;
    }

    public void setAge(int age) throws Exception{
        if(age > this.age){
            this.age = age;
        }
    }

    public void jump(int inches){
        System.out.println(this.name + " jumped " + inches + " inches.");
    }

    /**
     * Returns a string representation of this Person
     * @return The string!
     */
    public String toString(){
        return "I am " + this.name + ". I am " + this.age + " years old and " + this.height + " feet tall. I have received " + this.numberOfHighFivesReceived + " high fives in my life. In yo face!";
    }

}
