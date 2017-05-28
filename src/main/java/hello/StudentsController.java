package hello;
import hello.model.StudentsRepository;
import hello.model.TypeOfDanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import hello.model.Students;
import hello.StudentsController;

import java.util.Date;

@Controller
@RequestMapping("/demo1")
public class StudentsController {
    @Autowired
    private StudentsRepository studentsRepository;
    @RequestMapping("/list1")
    public String students (Model model) {
        model.addAttribute("students", studentsRepository.findAll());
        return "students";
    }

    @RequestMapping("/add1")
    public @ResponseBody
    String addNewUser(@RequestParam (value = "name", required = true)  String name,
                      @RequestParam (value = "surname", required = true) String surname,
                      @RequestParam (value = "patronymic", required = true) String patronymic,
                      @RequestParam  (value = "date_of_birth", required = true)Date date_of_birth,
                      @RequestParam  (value = "telephone", required = true)String telephone,
                      Model model) {
        Students n = new Students();
        n.setName(name);
        n.setSurname(surname);
        n.setPatronymic(patronymic);
        n.setDate_of_birth(date_of_birth);
        n.setTelephone(telephone);

        studentsRepository.save(n);
        return "Saved";
    }
    @RequestMapping("/all1")
    public @ResponseBody Iterable<Students> getAllStudents(){
        return studentsRepository.findAll();
    }
    @RequestMapping(value="/students", method= RequestMethod.GET)
    public String studentsForm(Model model) {
        Students p = new Students();
        model.addAttribute("students", p);
        return "students";
    }


    @RequestMapping(value="/students", method=RequestMethod.POST)
    public String studentsSubmit(@ModelAttribute Students n, Model model) {
        studentsRepository.save(n);
        model.addAttribute("students", n);
        return "result2";
    }

}
