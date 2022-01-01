package Model;

import java.io.Serializable;
import java.util.ArrayList;





public class USSDCInstanceDetails
  implements Serializable
{
  private String nodeName;
  private ArrayList<String> addresses;

  public String getNodeName() {
    return this.nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public ArrayList<String> getAddresses() {
    return this.addresses;
  }

  public void setAddresses(ArrayList<String> addresses) {
    this.addresses = addresses;
  }
}


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\USSDCInstanceDetails.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */