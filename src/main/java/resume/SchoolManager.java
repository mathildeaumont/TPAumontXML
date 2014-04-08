package resume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mathilde on 08/04/14.
 */
public class SchoolManager {

    private List<School> schoolList;

    public SchoolManager() {
        schoolList = new ArrayList<School>();
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public void addList(School school) {
        schoolList.add(school);
    }

    public void removeResume(School school) {
        schoolList.remove(school);
    }
}
