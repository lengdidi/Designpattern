package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式
 */
public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();

        freeCourse.setName("SpringMVC");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
