
package passwordgen;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author John
 */
public class CredentialsBean implements Serializable {

    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private long id;

    private String website;
    private String username;
    private String password;

    private PropertyChangeSupport propertySupport;

    public CredentialsBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public CredentialsBean(String website, String username, String password) {
        this.website = website;
        this.username = username;
        this.password = password;
        propertySupport = new PropertyChangeSupport(this);

    }

    public String getWebsite() {
        return website;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
    
    public void setWebsite(String website) {
        this.website = website;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
