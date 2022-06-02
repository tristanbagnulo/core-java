import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // This first project will demonstrate the difference between
        // the declaration of primitive (byte, float, character/char,
        // integer/int, boolean) and reference variables (strings).

        //Let's declare an integer named "integer_one"
        int integer_one = 3;
        System.out.println("Integer one: "+integer_one);

        //Now let's declare a new integer named "integer_two" and
        //declate its value to be integer_one
        int integer_two = integer_one;
        System.out.println("Integer two: "+integer_two);

        //Now, let's change the value of the first integer and print them
        //both again to see what their values will be.
        integer_one = 4;
        System.out.println("New values of the two integers are...");
        System.out.println("Integer one: "+integer_one);
        System.out.println("Integer two: "+integer_two);

        //Notice how integer two still displays the old value of integer
        //one. That's because in Java the VALUE is always assigned to variables
        //no matter their type (primitive or reference) and in the case of
        //primitive types, their values what they point to. They point directly
        //to the place in the computer's memory where the primitive value is
        //stored. So when integer_one's value is changed
        //the old value of 3 is still being directly pointed to by
        //integer_two despite the fact that the integer_one variable points
        // to 4 now.



        //Let's try this with a reference type like a Point.

        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point2);
        System.out.println(point1);
        //Now let's change the value of point one and print them both again
        point1.x = 2;
        System.out.println(point2);
        System.out.println(point1);

        //This is different. The values are the same despite the change. This is
        //because a reference type points to a "handle" which hold the address
        //of the location in the computer's memory where the actual data (in
        //this case, an object) is stored. So, when one of the reference variables
        //has its value changed, it changes the value but not the handle. So
        //the handle remains the same but the value changes.

        //Although Strings are technically a reference type, the above rule does not
        //seem to apply..
        String string_one = "First string";
        String string_two = string_one;
        System.out.println("String one: "+string_one);
        System.out.println("String two: "+string_two);


        System.out.println("New values for the two strings are...");
        string_two = "Second string";
        System.out.println("String one: "+string_one);
        System.out.println("String two: "+string_two);

    }


}
