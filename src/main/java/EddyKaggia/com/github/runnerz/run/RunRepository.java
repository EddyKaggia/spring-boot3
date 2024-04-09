package EddyKaggia.com.github.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

// This annotation indicates that this class is a repository component in the Spring framework,
// typically used for database access
@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Run findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id() == id)
                .findFirst()
                .get();
    }

    // The @PostConstruct annotated method initializes the repository with some sample data
    @PostConstruct
    private void init() {
        runs.add(new Run(1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.INDOOR));

        runs.add(new Run(2,
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6,
                Location.INDOOR));
    }
}
