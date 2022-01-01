 package Model.message;


 import Model.ussd.UssdMessageContext;

 import java.util.Objects;






 public class USSDInterceptionMessage
   extends BaseMessage
 {
   private USSDInterceptionRequest request;
   private UssdMessageContext messageContext;
   private long linkId;

   public USSDInterceptionMessage() {
     setAction(MessageAction.InterceptionMessage);
   }

   public USSDInterceptionRequest getRequest() {
     return this.request;
   }

   public void setRequest(USSDInterceptionRequest request) {
     this.request = request;
   }

   public UssdMessageContext getMessageContext() {
     return this.messageContext;
   }

   public void setMessageContext(UssdMessageContext messageContext) {
     this.messageContext = messageContext;
   }


   public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof USSDInterceptionMessage)) return false;
     USSDInterceptionMessage that = (USSDInterceptionMessage)o;
     return (Objects.equals(getRequest(), that.getRequest()) &&
       Objects.equals(getMessageContext(), that.getMessageContext()));
   }


   public int hashCode() {
     return Objects.hash(new Object[] { getRequest(), getMessageContext() });
   }


   public String toString() {
     return "USSDInterceptionMessage{request=" + this.request + ", context=" + this.messageContext + '}';
   }




   public long getLinkId() {
     return this.linkId;
   }

   public void setLinkId(long linkId) {
     this.linkId = linkId;
   }
 }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\message\USSDInterceptionMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */