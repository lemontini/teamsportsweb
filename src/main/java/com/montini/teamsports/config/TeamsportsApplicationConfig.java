package com.montini.teamsports.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.montini.teamsports"})
public class TeamsportsApplicationConfig {

    public static final Logger log = LoggerFactory.getLogger(TeamsportsApplicationConfig.class);

    // @Bean
    // public Location location() { return new Location(); }
    //
    // @Bean
    // public Player player() { return new Player(); }

}
