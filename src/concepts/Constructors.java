package concepts;

/*
* Constructors are blocks that are similar to methods and has name similar to class
* Constructors doesn't have any return types, not even void
* Constructors executes automatically when we create an object
* We can specify public, protected, default, private access modifiers
*
* Use: It is used to initialize the objects
*
* 3 types of constructors: default (Created by compiler by default if there is no constructors), user defined - no args (Created by user)
* and Parameterized ( Created by user that has parameters )
* */
public class Constructors {

    String name;
    int emp_id;

    Constructors(String name, int emp_id){
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Constructors c = new Constructors("Somu", 112);
        System.out.println(c.name + c.emp_id);
    }
}
