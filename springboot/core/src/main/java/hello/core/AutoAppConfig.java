package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member", //탐색 시작 위치 설정
        //basePackageClasses = AutoAppConfig.class, //탐색 시작 클래스 설정
        //디폴트(지정하지 않을 시) ComponentScan이 있는 위치부터 시작
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //AppConfig를 사용하지 않기 위해 사용, 기존의 것을 삭제하지 않기 위해 사용
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository") //이런식으로 수동을 했을 경우 자동과 겹칠경우 수동이 우선권을 가진다. --> 최근에는 오류를 내도록 바뀌었다
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }

}
