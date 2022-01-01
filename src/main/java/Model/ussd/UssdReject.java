/*    */ package Model.ussd;
/*    */ 
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UssdReject
/*    */   extends UssdMessageContext
/*    */ {
/*    */   private final String reason;
/*    */   
/*    */   public UssdReject(String reason) {
/* 14 */     this.reason = reason;
/*    */   }
/*    */   
/*    */   public String getReason() {
/* 18 */     return this.reason;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 24 */     if (this == o) return true; 
/* 25 */     if (!(o instanceof UssdReject)) return false; 
/* 26 */     if (!super.equals(o)) return false; 
/* 27 */     UssdReject that = (UssdReject)o;
/* 28 */     return Objects.equals(getReason(), that.getReason());
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 33 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), getReason() });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 38 */     return "UssdReject{reason='" + this.reason + '\'' + "} " + super
/*    */       
/* 40 */       .toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdReject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */