/*    */ package Model.ussd;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.UssdPushEntity;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UssdPushRequest
/*    */   implements Serializable
/*    */ {
/*    */   private UssdPushEntity pushEntity;
/*    */   private Date validUntil;
/*    */   
/*    */   public UssdPushEntity getPushEntity() {
/* 17 */     return this.pushEntity;
/*    */   }
/*    */   
/*    */   public void setPushEntity(UssdPushEntity pushEntity) {
/* 21 */     this.pushEntity = pushEntity;
/*    */   }
/*    */   
/*    */   public Date getValidUntil() {
/* 25 */     return this.validUntil;
/*    */   }
/*    */   
/*    */   public void setValidUntil(Date validUntil) {
/* 29 */     this.validUntil = validUntil;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 34 */     return "UssdPushRequest{pushEntity=" + this.pushEntity + ", validUntil=" + this.validUntil + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdPushRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */