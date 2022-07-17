package hello.advanced;

import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        //return new FiledLogTrace(); //주입된 logtrace가 인터페이스라서 아래줄만 변경되면 다 바뀐다.
        return new ThreadLocalLogTrace();
    }
}
