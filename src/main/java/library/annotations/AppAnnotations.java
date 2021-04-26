package library.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotations {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigAnnotations.class);
        System.out.println("context.getBean(\"library1\") = " + context.getBean("library1"));
    }
}
