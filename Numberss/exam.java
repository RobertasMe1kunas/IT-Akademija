import java.lang.annotation.Annotation;

public class exam implements lt.itakademija.exam.grader.ExamTask{
    @Override
    public String name() {
        return null;
    }

    @Override
    public double grade() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

