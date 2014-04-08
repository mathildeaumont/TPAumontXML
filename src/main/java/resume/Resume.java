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

    public Resume() {

    }

    public Resume(String lastName, String firstName, String objectif) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.objectif = objectif;
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
}
