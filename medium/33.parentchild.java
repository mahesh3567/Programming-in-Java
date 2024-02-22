
public class parentchild {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.printParent();
        child.printChild(); 
        child.printParent(); 
    }

}
public class Parent {

    public void printParent() {
        System.out.println("This is parent class");
    }

}

public class Child extends Parent {

    public void printChild() {
        System.out.println("This is child class");
    }

}
