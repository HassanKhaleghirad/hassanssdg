/*    */ package Model.ussd;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.core.BaseEntity;
/*    */ import java.util.Date;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UssdSession
/*    */   extends UssdMessageContext
/*    */   implements BaseEntity<String>
/*    */ {
/*    */   private final String id;
/*    */   private Date lastUpdate;
/*    */   
/*    */   public UssdSession(String id, String ussdNumber, String msisdn) {
/* 19 */     this.id = id;
/* 20 */     this.ussdNumber = ussdNumber;
/* 21 */     this.msisdn = msisdn;
/*    */   }
/*    */   
/*    */   public String getId() {
/* 25 */     return this.id;
/*    */   }
/*    */   
/*    */   public Date getLastUpdate() {
/* 29 */     return this.lastUpdate;
/*    */   }
/*    */   
/*    */   public void setLastUpdate(Date lastUpdate) {
/* 33 */     this.lastUpdate = lastUpdate;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 39 */     if (this == o) return true; 
/* 40 */     if (!(o instanceof UssdSession)) return false; 
/* 41 */     if (!super.equals(o)) return false; 
/* 42 */     UssdSession that = (UssdSession)o;
/* 43 */     return (Objects.equals(getId(), that.getId()) && 
/* 44 */       Objects.equals(getLastUpdate(), that.getLastUpdate()));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 49 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), getId(), getLastUpdate() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 54 */     return "UssdSession{id='" + this.id + '\'' + ", lastUpdate=" + this.lastUpdate + "} " + super
/*    */ 
/*    */       
/* 57 */       .toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */