package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //AppConfig를 사용하지 않기 위해 사용, 기존의 것을 삭제하지 않기 위해 사용
public class AutoAppConfig {


}
