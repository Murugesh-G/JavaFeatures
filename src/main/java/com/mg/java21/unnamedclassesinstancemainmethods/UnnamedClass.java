

int counter = 0;

void main() {
    greet("Java 21");
    counter++;
    System.out.println("Greeting count: " + counter);
}

void greet(String name) {
    System.out.println("Hello, " + name + "!");
}