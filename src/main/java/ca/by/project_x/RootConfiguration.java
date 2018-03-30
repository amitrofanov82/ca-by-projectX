package ca.by.project_x;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"ca.by.project_x"})
@EnableAutoConfiguration() //better to replace with minimal configuration, may be later
@Import(value = {WebConfiguration.class, ConversionConfiguration.class})
public class RootConfiguration extends SpringBootServletInitializer implements InitializingBean {

    //@Autowired
    //private Environment environment; //uncomment if needed

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(RootConfiguration.class);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //placholder
    }

}
