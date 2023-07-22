package OOPS.Interfaces.ExtendDemo;

public interface Static
{
    // Static interface methods should always have a body.
    // Reason : Static methods cannot be inherited.
    // Because inheritance includes overriding
    // And overriding is dependent on objects

    static void greeting() { // Can be accessed via the interface name only.
        System.out.println("Hello. How are you?");
    }

    class sample{
        int num;
        String name;

        public sample(){
            this.num = 0;
            this.name = null;
        }

        void greeting(){
            System.out.println("helloo");
        }
    }
}


/*
** ZB **

When we are overriding methods , The access modifier either should be the one in the parent class/interface
or better. It can't be more restrictive .

For example - If the method is public in parent class/interface , the overridden method can only be public , because there
               is nothing better than public
               * If the method is protected in parent class, the overridden method can be protected or public but it can't be
                 private, because it is more restrictive.
*/
