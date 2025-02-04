import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //COMPLETE THIS CLASS AFTER ALL THE OTHER CLASSES

        /*
        Write a code that asks user to if they would like join your classes
        If the answer is "Yes" from user,then ask user information; firstName, lastName, age, gender, class to join
        ***If user is age is not more than 20, do not allow them to join
        ***If user wants to join any other class except Math and Science, do not allow them to join

        REMEMBER - checkAge and checkClassName methods may throw exceptions. You have to handle them

        Keep asking users the question they would to like join until you have got 3 students overall
        Create MathStudent or ScienceStudent objects based on user's answer for the class they want to join
        Print a "Congratulations! You are registered for {className} class."

        Store all these 3 objects in a collection and print them

        EXPECTED OUTPUT OF THE PROGRAM:
        Print information of all 3 students
        Print how many students are MathStudent with message -> "Math students = {numberOfMathStudents}"
        Print how many students are ScienceStudent with message -> "Science students = {numberOfScienceStudents}"
         */

        Scanner scan = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        do {
            System.out.println(UserQuestions.askToJoin);

            if (scan.next().toLowerCase().startsWith("y")) {
                try {
                    System.out.println(UserQuestions.askFirstName);
                    String firstNameTest = scan.next();
                    System.out.println(UserQuestions.askLastName);
                    String lastNameTest = scan.next();
                    System.out.println(UserQuestions.askAge);
                    int ageTest = scan.nextInt();
                    Permission.checkAge(ageTest);
                    System.out.println(UserQuestions.askGender);
                    String genderTest = scan.next();
                    System.out.println(UserQuestions.askClassName);
                    String classNameTest = scan.next();
                    Permission.checkClassName(classNameTest);

                    students.add(classNameTest.equalsIgnoreCase("math") ?
                            new MathStudent(firstNameTest, lastNameTest, ageTest, genderTest, classNameTest) :
                            new ScienceStudent(firstNameTest, lastNameTest, ageTest, genderTest, classNameTest));

                    System.out.println("Congratulations! You are registered for " + classNameTest + " class.");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        } while (students.size() < 3);

        int countMath = 0, countScience = 0;
        for (Student student : students) {
            if (student.getClassName().equalsIgnoreCase("math")) countMath++;
            else countScience++;
            System.out.println(student);
        }

        System.out.println("Math students = " + countMath +
                "\nScience students = " + countScience);

    }
}





















