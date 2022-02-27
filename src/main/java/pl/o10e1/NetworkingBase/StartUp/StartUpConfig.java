package pl.o10e1.NetworkingBase.StartUp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StartUpConfig {

    @Bean
    CommandLineRunner commandLineRunner(StartUpRepository startUpRepository) {
        return args -> {
           StartUp PZU = new StartUp(
                    "PZU",
                    "Patryk",
                    "Kubis",
                    "1010");

        startUpRepository.saveAll(List.of(PZU));
    };

    }
}
