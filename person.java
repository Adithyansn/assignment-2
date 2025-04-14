class Person {  // No need for public, unless it's the main class

    String name;
    int age;

    // Constructor with name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name (default age = 18)
    Person(String name) {
        this.name = name;
        this.age = 18;
    }

    // Method to display details
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
