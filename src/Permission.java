public class Permission {

    //COMPLETE THIS CLASS BEFORE TEST CLASS


    /*
    HERE!
    Create a method checkAge
    The method will be public static void
    The method will take an int as an argument and check if it more than 20
    In case the age is less than or equal to 20, then method will throw an RuntimeException with message "{age} is not allowed!"
    If the age is more than 20, then it will do nothing
    */
    public static void checkAge(int n) {
        if (n > 20) {

        } else
            throw new RuntimeException(n + " is not allowed!");

    }




    /*
    HERE!
    Create a method checkClassName
    The method will be public static void
    The method will take a String as an argument and check if it is Math or Science (case insensitive)
    In case the className is not Math or Science, then method will throw an RuntimeException with message "{className} is not allowed!"
    If the className is Math or Science, then it will do nothing
     */
public static void checkClassName(String str){
    if(str.toLowerCase().equals("math") || str.toLowerCase().equals("science")){

    }else
        throw new RuntimeException(str + " is not allowed!");
}


}
