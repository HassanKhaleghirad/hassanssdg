 package Model.message;


 import java.io.Serializable;





 public abstract class BaseMessage
   implements Serializable
 {
   private MessageAction action;
   private String nodeName;


   public MessageAction getAction() {
     return this.action;
   }

   public void setAction(MessageAction action) {
     this.action = action;
   }

   public String getNodeName() {
     return this.nodeName;
   }

   public void setNodeName(String nodeName) {
     this.nodeName = nodeName;
   }
 }

