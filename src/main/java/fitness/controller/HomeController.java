package fitness.controller;

import fitness.Exercise;
import fitness.ExercisePerformance;
import fitness.Person;
import fitness.WorkoutProgram;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
import java.util.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public String testMethod(Model model){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("test", "test", "test", 0, 0.0, 0.0, new Date()));
        personList.add(new Person("test", "test", "test", 0, 0.0, 0.0, new Date()));

        List<Exercise> exerciseList = new ArrayList<>();
        exerciseList.add(new Exercise("BEN_PRESS", "bench press", Exercise.AreaAffectedType.UPPER_BODY));
        exerciseList.add(new Exercise("SQT", "squat", Exercise.AreaAffectedType.LOWER_BODY));

        List<ExercisePerformance> performanceList = new ArrayList<>();
        performanceList.add(new ExercisePerformance("BEN_PRESS", 5, 5, 60, new Date()));
        performanceList.add(new ExercisePerformance("SQT", 5, 5, 65, new Date()));

        Map<DayOfWeek, List<Exercise>> map = new HashMap<>();
        map.put(DayOfWeek.MONDAY, exerciseList);
        map.put(DayOfWeek.THURSDAY, exerciseList);

        WorkoutProgram workoutProgram = new WorkoutProgram("Bro split", map);


        model.addAttribute("persons", personList);
        model.addAttribute("exercises", exerciseList);
        model.addAttribute("performances", performanceList);
        model.addAttribute("workoutProgram", performanceList);

        return "index";
    }
}
