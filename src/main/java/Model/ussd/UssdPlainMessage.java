/*    */ package Model.ussd;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UssdPlainMessage
/*    */   implements Serializable
/*    */ {
/*    */   private final UssdMessageContext messageContext;
/*    */   private Date time;
/*    */   private String message;
/*    */   private UssdMessageSource source;
/*    */   private UssdMessageMethod method;
/*    */   
/*    */   UssdPlainMessage(UssdMessageContext messageContext) {
/* 19 */     this.messageContext = messageContext;
/*    */   }
/*    */ 
/*    */   
/*    */   public UssdMessageContext getMessageContext() {
/* 24 */     return this.messageContext;
/*    */   }
/*    */   
/*    */   public Date getTime() {
/* 28 */     return this.time;
/*    */   }
/*    */   
/*    */   public void setTime(Date time) {
/* 32 */     this.time = time;
/*    */   }
/*    */   
/*    */   public String getMessage() {
/* 36 */     return this.message;
/*    */   }
/*    */   
/*    */   public void setMessage(String message) {
/* 40 */     this.message = message;
/*    */   }
/*    */   
/*    */   public UssdMessageSource getSource() {
/* 44 */     return this.source;
/*    */   }
/*    */   
/*    */   public void setSource(UssdMessageSource source) {
/* 48 */     this.source = source;
/*    */   }
/*    */   
/*    */   public UssdMessageMethod getMethod() {
/* 52 */     return this.method;
/*    */   }
/*    */   
/*    */   public void setMethod(UssdMessageMethod method) {
/* 56 */     this.method = method;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 61 */     if (this == o) return true; 
/* 62 */     if (!(o instanceof UssdPlainMessage)) return false; 
/* 63 */     UssdPlainMessage that = (UssdPlainMessage)o;
/* 64 */     return (Objects.equals(getMessageContext(), that.getMessageContext()) && 
/* 65 */       Objects.equals(getTime(), that.getTime()) && 
/* 66 */       Objects.equals(getMessage(), that.getMessage()) && 
/* 67 */       getSource() == that.getSource() && 
/* 68 */       getMethod() == that.getMethod());
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 73 */     return Objects.hash(new Object[] { getMessageContext(), getTime(), getMessage(), getSource(), getMethod() });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdPlainMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */