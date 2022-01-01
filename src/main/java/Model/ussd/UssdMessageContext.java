/*    */ package Model.ussd;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Date;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class UssdMessageContext
/*    */   implements Serializable
/*    */ {
/*    */   protected Date createTime;
/*    */   protected String ussdNumber;
/*    */   protected String msisdn;
/* 16 */   protected ArrayList<UssdPlainMessage> messages = new ArrayList<>();
/*    */   
/*    */   public UssdMessageContext() {
/* 19 */     this.createTime = new Date();
/*    */   }
/*    */ 
/*    */   
/*    */   public UssdPlainMessage createMessage() {
/* 24 */     UssdPlainMessage plainMessage = new UssdPlainMessage(this);
/* 25 */     this.messages.add(plainMessage);
/* 26 */     return plainMessage;
/*    */   }
/*    */ 
/*    */   
/*    */   public Date getCreateTime() {
/* 31 */     return this.createTime;
/*    */   }
/*    */   
/*    */   public void setCreateTime(Date createTime) {
/* 35 */     this.createTime = createTime;
/*    */   }
/*    */   
/*    */   public String getUssdNumber() {
/* 39 */     return this.ussdNumber;
/*    */   }
/*    */   
/*    */   public void setUssdNumber(String ussdNumber) {
/* 43 */     this.ussdNumber = ussdNumber;
/*    */   }
/*    */   
/*    */   public String getMsisdn() {
/* 47 */     return this.msisdn;
/*    */   }
/*    */   
/*    */   public void setMsisdn(String msisdn) {
/* 51 */     this.msisdn = msisdn;
/*    */   }
/*    */ 
/*    */   
/*    */   public ArrayList<UssdPlainMessage> getMessages() {
/* 56 */     return (ArrayList<UssdPlainMessage>)this.messages.clone();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 61 */     if (this == o) return true; 
/* 62 */     if (!(o instanceof UssdMessageContext)) return false; 
/* 63 */     UssdMessageContext that = (UssdMessageContext)o;
/* 64 */     return (Objects.equals(getCreateTime(), that.getCreateTime()) && 
/* 65 */       Objects.equals(getUssdNumber(), that.getUssdNumber()) && 
/* 66 */       Objects.equals(getMsisdn(), that.getMsisdn()) && 
/* 67 */       Objects.equals(getMessages(), that.getMessages()));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 72 */     return Objects.hash(new Object[] { getCreateTime(), getUssdNumber(), getMsisdn(), getMessages() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 77 */     return "UssdMessageContext{createTime=" + this.createTime + ", ussdNumber='" + this.ussdNumber + '\'' + ", msisdn='" + this.msisdn + '\'' + ", messages=" + this.messages + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdMessageContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */