package visitor;

public interface IVisitor {
    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}