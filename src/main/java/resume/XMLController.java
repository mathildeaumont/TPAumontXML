package resume; /**
 * Created by Mathilde on 01/04/14.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import resume.Resume;


@Controller
@RequestMapping("/resume")
public class XMLController {

    private ResumeManager resumes;

    public XMLController() {
        resumes = new ResumeManager();
    }

    @RequestMapping
    public @ResponseBody
    ResumeManager getResumeInXML() {
        ResumeManager resumes = new ResumeManager();

        // Ecoles
        SchoolManager schoolManager = new SchoolManager();
        School school = new School("Université de Rouen", "Licence informatique", "2012-2013");
        schoolManager.addSchool(school);

        // Experiences professionnelles
        ProfessionalExperienceManager professionalExperienceManager = new ProfessionalExperienceManager();
        ProfessionalExperience professionalExperience = new ProfessionalExperience("Progimax", "2013", "Développeur Web");
        professionalExperienceManager.addProfessionnalExperience(professionalExperience);

        // Langues
        LanguageManager languageManager = new LanguageManager();
        Language anglais = new Language("Anglais", "Moyen");
        languageManager.addLanguage(anglais);
        Language allemand = new Language("Allemand", "Moyen");
        languageManager.addLanguage(allemand);

        // Compétences informatiques
        ComputerSkillManager computerSkillManager = new ComputerSkillManager();
        ComputerSkill java = new ComputerSkill("Java", "+++");
        computerSkillManager.addComputerSkill(java);
        ComputerSkill c = new ComputerSkill("C", "+");
        computerSkillManager.addComputerSkill(c);


        Resume resume = new Resume("Aumont", "Mathilde", "Acquérir de l'expérience",
                schoolManager, professionalExperienceManager, languageManager, computerSkillManager);
        resumes.addResume(resume);
        Resume resume2 = new Resume("Aumont", "Mathilde", "Acquérir de l'expérience",
                schoolManager, professionalExperienceManager, languageManager, computerSkillManager);
        resumes.addResume(resume2);
        return resumes;
    }

    /*@RequestMapping(value="{lastName}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String lastName, @PathVariable String firstName) {
        Resume resume = new Resume("Aumont", "Mathilde", "Acquérir de l'expérience");
        return resume;
    }*/

}