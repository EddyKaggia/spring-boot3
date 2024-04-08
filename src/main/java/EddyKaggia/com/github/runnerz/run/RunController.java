package EddyKaggia.com.github.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Annotation says this is a REST controller -> expects JSON response
// This is a class that responds to requests
@RestController // Combination of @Controller and @ResponseBody
public class RunController {

    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
         this.runRepository = runRepository;
    }

    @GetMapping("/api/runs")
    List<Run> findAll() {
            return runRepository.findAll();
        }
}
