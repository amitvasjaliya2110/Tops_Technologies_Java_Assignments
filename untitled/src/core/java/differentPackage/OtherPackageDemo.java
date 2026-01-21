package core.java.differentPackage;

import core.java.userDefinedPack.AccessDemo;

public class OtherPackageDemo extends AccessDemo {
    public static void main ( String[] args ) {
        AccessDemo accessDemo = new AccessDemo();

        System.out.println(accessDemo.value);   //public value
        // System.out.println(accessDemo.defaultValue); //default value  not via object
        // System.out.println(accessDemo.protectedValue); //protected value not accessible
       // System.out.println(accessDemo.privateValue); //private value not accessible

        OtherPackageDemo other = new OtherPackageDemo();
        System.out.println(other.protectedValue);  // protected Value accessible via inheritance



    }
}
