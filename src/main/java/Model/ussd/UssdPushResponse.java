/*    */ package Model.ussd;
/*    */ import ir.markazandroid.JSONParser.annotations.JSON;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ @JSON
/*    */ public class UssdPushResponse implements Serializable {
/*    */   private Status status;
/*    */   private String failReason;
/*    */   private Date sentTime;
/*    */   private String sessionId;
/*    */   private transient UssdPushRequest request;
/*    */   
/*    */   public enum Status {
/* 15 */     success,
/* 16 */     fail;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @JSON
/*    */   public Status getStatus() {
/* 27 */     return this.status;
/*    */   }
/*    */   
/*    */   public void setStatus(Status status) {
/* 31 */     this.status = status;
/*    */   }
/*    */   
/*    */   @JSON
/*    */   public Date getSentTime() {
/* 36 */     return this.sentTime;
/*    */   }
/*    */   
/*    */   public void setSentTime(Date sentTime) {
/* 40 */     this.sentTime = sentTime;
/*    */   }
/*    */   
/*    */   @JSON
/*    */   public String getSessionId() {
/* 45 */     return this.sessionId;
/*    */   }
/*    */   
/*    */   public void setSessionId(String sessionId) {
/* 49 */     this.sessionId = sessionId;
/*    */   }
/*    */   
/*    */   public UssdPushRequest getRequest() {
/* 53 */     return this.request;
/*    */   }
/*    */   
/*    */   public void setRequest(UssdPushRequest request) {
/* 57 */     this.request = request;
/*    */   }
/*    */   
/*    */   @JSON
/*    */   public String getFailReason() {
/* 62 */     return this.failReason;
/*    */   }
/*    */   
/*    */   public void setFailReason(String failReason) {
/* 66 */     this.failReason = failReason;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdPushResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */