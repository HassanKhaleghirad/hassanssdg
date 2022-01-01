/*    */ package Model.ussd;
/*    */ 
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UssdPushSession
/*    */   extends UssdSession
/*    */ {
/*    */   private String menuNumber;
/*    */   private final PushType pushType;
/*    */   
/*    */   public UssdPushSession(String id, String ussdNumber, String msisdn, PushType pushType) {
/* 14 */     super(id, ussdNumber, msisdn);
/* 15 */     this.pushType = pushType;
/*    */   }
/*    */   
/*    */   public String getMenuNumber() {
/* 19 */     return this.menuNumber;
/*    */   }
/*    */   
/*    */   public void setMenuNumber(String menuNumber) {
/* 23 */     this.menuNumber = menuNumber;
/*    */   }
/*    */   
/*    */   public PushType getPushType() {
/* 27 */     return this.pushType;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 32 */     if (this == o) return true; 
/* 33 */     if (!(o instanceof UssdPushSession)) return false; 
/* 34 */     if (!super.equals(o)) return false; 
/* 35 */     UssdPushSession that = (UssdPushSession)o;
/* 36 */     return (Objects.equals(getMenuNumber(), that.getMenuNumber()) && this.pushType == that.pushType);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 42 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), getMenuNumber(), this.pushType });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     return "UssdPushSession{menuNumber='" + this.menuNumber + '\'' + ", pushType=" + this.pushType + "} " + super
/*    */ 
/*    */       
/* 50 */       .toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdPushSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */