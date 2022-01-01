/*    */ package Model.message;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class USSDInterceptionRequest extends BaseMessage {
/*    */   private String ussdNumber;
/*    */   private String msisdn;
/*    */   private String requestId;
/*    */   private RequestType requestType;
/*    */   
/*    */   public enum RequestType {
/* 11 */     begin,
/* 12 */     end;
/*    */   }
/*    */   
/*    */   public USSDInterceptionRequest() {
/* 16 */     setAction(MessageAction.InterceptionRequest);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getUssdNumber() {
/* 25 */     return this.ussdNumber;
/*    */   }
/*    */   
/*    */   public void setUssdNumber(String ussdNumber) {
/* 29 */     this.ussdNumber = ussdNumber;
/*    */   }
/*    */   
/*    */   public String getMsisdn() {
/* 33 */     return this.msisdn;
/*    */   }
/*    */   
/*    */   public void setMsisdn(String msisdn) {
/* 37 */     this.msisdn = msisdn;
/*    */   }
/*    */   
/*    */   public String getRequestId() {
/* 41 */     return this.requestId;
/*    */   }
/*    */   
/*    */   public void setRequestId(String requestId) {
/* 45 */     this.requestId = requestId;
/*    */   }
/*    */   
/*    */   public RequestType getRequestType() {
/* 49 */     return this.requestType;
/*    */   }
/*    */   
/*    */   public void setRequestType(RequestType requestType) {
/* 53 */     this.requestType = requestType;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 58 */     if (this == o) return true; 
/* 59 */     if (!(o instanceof USSDInterceptionRequest)) return false; 
/* 60 */     USSDInterceptionRequest request = (USSDInterceptionRequest)o;
/* 61 */     return this.requestId.equals(request.requestId);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 66 */     return Objects.hash(new Object[] { this.requestId });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 71 */     return "USSDInterceptionRequest{ussdNumber='" + this.ussdNumber + '\'' + ", msisdn='" + this.msisdn + '\'' + ", requestId='" + this.requestId + '\'' + ", requestType=" + this.requestType + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\message\USSDInterceptionRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */