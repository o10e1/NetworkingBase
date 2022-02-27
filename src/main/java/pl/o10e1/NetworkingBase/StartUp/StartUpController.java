package pl.o10e1.NetworkingBase.StartUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// IN CONNTROLER ENDPOINTS ARE STORED

@RestController
@RequestMapping("/StartUp")
public class StartUpController {

    private final StartUpService StartUpService;

    @Autowired
    public StartUpController(StartUpService startUpService) {
        this.StartUpService = startUpService;
    }

    @GetMapping
    public List<StartUp> getStartUps() {
        return StartUpService.getStartUps();
    }

}
