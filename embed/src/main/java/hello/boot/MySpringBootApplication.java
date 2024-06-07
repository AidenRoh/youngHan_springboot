package hello.boot;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.ComponentScan;

@Target(ElementType.TYPE) //class 에 붙는 annotation
@Retention(RetentionPolicy.RUNTIME) //살행 시점 : runtime
@Documented //문서화
@ComponentScan
public @interface MySpringBootApplication {
}
