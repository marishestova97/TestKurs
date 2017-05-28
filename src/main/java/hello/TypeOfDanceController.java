package hello;
import hello.model.TypeOfDanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import hello.model.TypeOfDance;
import hello.TypeOfDanceController;

@Controller
@RequestMapping("/demo")
public class TypeOfDanceController {
    @Autowired
    private TypeOfDanceRepository typeOfDanceRepository;

    @RequestMapping("/add")
    public @ResponseBody
    String addNewUser(@RequestParam String nazvanie) {
        TypeOfDance n = new TypeOfDance();
        n.setNazvanie(nazvanie);
        typeOfDanceRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all")
    public @ResponseBody Iterable<TypeOfDance> getAllTypeOfDance() {
        return typeOfDanceRepository.findAll();
    }
    @RequestMapping(value="/dance", method= RequestMethod.GET)
    public String danceForm(Model model) {
        model.addAttribute("dance", new TypeOfDance());
        return "dance";
    }

    @RequestMapping(value="/dance", method=RequestMethod.POST)
    public String danceSubmit(@ModelAttribute TypeOfDance n, Model model) {
        typeOfDanceRepository.save(n);
        model.addAttribute("dance", n);
        return "result1";
    }
}
