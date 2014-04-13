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
    ExperienceManager experiences;
    ComputerSkillManager computerSkills;

    public Resume() {

    }

    public Resume(String lastName, String firstName, String objectif, SchoolManager schools,
                  ProfessionalExperienceManager professionalExperiences, LanguageManager languages,
                  ExperienceManager experiences, ComputerSkillManager computerSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.objectif = objectif;
        this.schools = schools;
        this.professionalExperiences = professionalExperiences;
        this.languages = languages;
        this.experiences = experiences;
        this.computerSkills = computerSkills;
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

    public String getObjectif() {
        return objectif;
    }

    @XmlElement
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

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

    public ExperienceManager getExperiences() {
        return experiences;
    }

    @XmlElement
    public void setExperiences(ExperienceManager experiences) {
        this.experiences = experiences;
    }

    public ComputerSkillManager getComputerSkills() {
        return computerSkills;
    }

    @XmlElement
    public void setComputerSkills(ComputerSkillManager computerSkills) {
        this.computerSkills = computerSkills;
    }
}
