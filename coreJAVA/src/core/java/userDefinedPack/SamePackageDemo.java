package core.java.userDefinedPack;

public class SamePackageDemo {
    public static void main ( String[] args ) {
        AccessDemo accessDemo = new AccessDemo();
        System.out.println(accessDemo.value);  //public value
        System.out.println(accessDemo.defaultValue); //default value
        System.out.println(accessDemo.protectedValue); //protected value
        //System.out.println(accessDemo.privateValue); //private value   Not accessible

        accessDemo.show();
    }
}
