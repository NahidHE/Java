/*
 * Static.java
 * This class is to demonstrate the structure of a Java class with static members.
 */
public class Static {
    static int staticValue; // Static field
    int instanceValue; // Instance field

    // Static method to set the static field
    static void setStaticValue(int value) {
        staticValue = value; // Set the static field
    }

    // Instance method to set the instance field
    void setInstanceValue(int value) {
        instanceValue = value; // Set the instance field
    }

    public static void main(String[] args) {
        Static.setStaticValue(100); // Set static value
        Static staticExample = new Static();
        staticExample.setInstanceValue(200); // Set instance value

        System.out.println("Static Value: " + Static.staticValue);
        System.out.println("Instance Value: " + staticExample.instanceValue);
    }
}