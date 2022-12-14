package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( // AppConfig를 안하기 위해(오류)
//        basePackages = "hello.core.member", //위치 등록
//        basePackageClasses = AutoAppConfig.class, // 현재 클래스의 패키지를 탐색
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
