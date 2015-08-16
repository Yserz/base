package de.yserz.base;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan(basePackages = {
	"de.yserz.data"
})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {
	"de.yserz.data"
})
public class PersistenceContext {

}



