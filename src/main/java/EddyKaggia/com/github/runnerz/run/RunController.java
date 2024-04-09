package EddyKaggia.com.github.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Annotation says this is a REST controller -> produces JSON response
// This is a class that responds to requests
@RestController // Combination of @Controller and @ResponseBody
@RequestMapping("/api/runs") // The base URL path for all endpoints
public class RunController {

    // Declaration of a private instance variable named runRepository of type RunRepository
    // This pattern is used for dependency injection,
    // where the RunRepository instance is injected into the class through its constructor.
    // Once assigned, it cannot be changed throughout the lifetime of the object.
    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
         this.runRepository = runRepository;
    }

    @GetMapping("")
    List<Run> findAll() {
            return runRepository.findAll();
    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id) {
        return runRepository.findById(id);
    }
}
