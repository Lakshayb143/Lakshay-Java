package OOPS.Principles.Abstraction;

public class Main
{
    public static void main(String[] args)
    {

        Child obj = new Child(34,"Vivek",5.5f);
//        System.out.println(obj.name);
//        obj.food("jalebi");

        obj.greet();
        System.out.println();
        obj.greeting();

        Parent parent = new Parent() {
            @Override
            void food(String name) {

            }

            @Override
            void greeting() {

            }
        };

    }
}
