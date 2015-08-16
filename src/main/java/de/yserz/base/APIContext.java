package de.yserz.base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan(basePackages = {
	"de.yserz.home.api.v1"
})
@EnableAspectJAutoProxy
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class APIContext extends WebMvcConfigurerAdapter {

}
