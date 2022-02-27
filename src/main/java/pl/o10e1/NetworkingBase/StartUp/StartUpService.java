package pl.o10e1.NetworkingBase.StartUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartUpService {

    private final StartUpRepository startUpRepository;

    @Autowired
    public StartUpService(StartUpRepository startUpRepository) {
        this.startUpRepository = startUpRepository;
    }

    public List<StartUp> getStartUps() {
        return startUpRepository.findAll();
    }
}
