package resume;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathilde on 01/04/14.
 */

@XmlRootElement
public class ResumeManager {

    private List<Resume> resumeList;

    public List<Resume> getResumeList() {
        return resumeList;
    }

    public void setResumeList(List<Resume> resumeList) {
        this.resumeList = resumeList;
    }

    public ResumeManager() {
        resumeList = new ArrayList<Resume>();
    }

    public void addResume(Resume resume) {
        resumeList.add(resume);
    }

    public void removeResume(Resume resume) {
        resumeList.remove(resume);
    }


}
