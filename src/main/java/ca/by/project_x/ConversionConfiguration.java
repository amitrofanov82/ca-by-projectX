package ca.by.project_x;

import java.util.HashSet;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class ConversionConfiguration {

    //@Bean Not ready yet
    public ConversionService conversionService() {
        HashSet<? extends Converter<?, ?>> converters = new HashSet<>();
        //add useful converters here like:   
        //converters.add(new SampleConverter());
        ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
        conversionServiceFactoryBean.setConverters(converters);
        return conversionServiceFactoryBean.getObject();
    }

}
