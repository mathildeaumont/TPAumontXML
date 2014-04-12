package resume; /**
 * Created by Mathilde on 01/04/14.
 */


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "resume")
public class Resume {

    String lastName;
    String firstName;
    String objectif;
    SchoolManager schools;
    ProfessionalExperienceManager professionalExperiences;
    LanguageManager languages;

    public Resume() {

    }

    public Resume(String lastName, String firstName, String objectif, SchoolManager schools,
                  ProfessionalExperienceManager professionalExperiences, LanguageManager languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.objectif = objectif;
        this.schools = schools;
        this.professionalExperiences = professionalExperiences;
        this.languages = languages;
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getObjectif() { return objectif; }

    @XmlElement
    public void setObjectif(String objectif) { this.objectif = objectif; }

    public SchoolManager getSchools() {
        return schools;
    }

    @XmlElement
    public void setSchools(SchoolManager schools) {
        this.schools = schools;
    }

    public ProfessionalExperienceManager getProfessionalExperiences() {
        return professionalExperiences;
    }

    @XmlElement
    public void setProfessionalExperiences(ProfessionalExperienceManager professionalExperiences) {
        this.professionalExperiences = professionalExperiences;
    }

    public LanguageManager getLanguages() {
        return languages;
    }

    @XmlElement
    public void setLanguages(LanguageManager languages) {
        this.languages = languages;
    }
}
