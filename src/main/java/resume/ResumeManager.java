package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathilde on 01/04/14.
 */

@XmlRootElement
public class ResumeManager {

    private List<Resume> resume;
    private int nbResume;

    public ResumeManager() {
        resume = new ArrayList<Resume>();
        nbResume = 0;
    }

    public List<Resume> getResumeList() {
        return resume;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resume = resumeList;
    }

    public void addResume(Resume resume) {
        nbResume++;
        resume.setId(nbResume);
        this.resume.add(resume);
    }

    public void removeResume(Resume resume) {
        this.resume.remove(resume);
    }

}
