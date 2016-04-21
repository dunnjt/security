//Author: John Madsen
package passwordgen;

import java.util.ArrayList;

public class CredentialsList extends ArrayList<CredentialsBean> {

    public void update(CredentialsBean bean) {
        boolean replaced = false;
        System.out.println(this.size());
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getWebsite().equals(bean.getWebsite()) && this.get(i).getUsername().equals(bean.getUsername())) {
                this.remove(i);
                this.add(i, bean);
                replaced = true;
            } 
            
        }
        if(!replaced){
            this.add(bean);
        }
    }
}
