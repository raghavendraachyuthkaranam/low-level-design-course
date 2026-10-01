package Polymorphism.Overriding;

public class Instructor extends User{

//    public String getRole(){
//        return "INSTRUCTOR";
//    }

    // 1. If overriding, return type of the child should be compatible with the parent.
    // or use different method name, don't override
//    public void getRole(){
//        System.out.println("INSTRUCTOR");
//    }
    // 2. When overriding, child class access modifier can't put restrictive one.
    // ex: If parent access modifier says public then child's access modifier also be public and loosen it up, child's modifier can't be protected/default/provate.
    // ex2: parent access modifier says public then child's access modifier also be private/protected/default/public.
}
