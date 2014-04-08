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

    private ResumeManager resumeManager;

    public XMLController() {
        resumeManager = new ResumeManager();
    }

    @RequestMapping
    public @ResponseBody
    ResumeManager getResumeInXML() {
        Resume resume = new Resume("Aumont", "Mathilde");
        Resume resume2 = new Resume("Aumont", "Mathilde");
        resumeManager.addResume(resume);
        resumeManager.addResume(resume2);
        return resumeManager;
    }

    @RequestMapping(value="{lastName}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(@PathVariable String lastName, @PathVariable String firstName) {
        Resume resume = new Resume("Aumont", "Mathilde");
        return resume;
    }

}