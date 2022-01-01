/*    */ package Model.message;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.entity.UssdNumberEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class USSDNumberMessage
/*    */   extends BaseMessage
/*    */ {
/*    */   private String ussdNumber;
/*    */   private UssdNumberEntity numberEntity;
/*    */   
/*    */   public String getUssdNumber() {
/* 15 */     return this.ussdNumber;
/*    */   }
/*    */   
/*    */   public void setUssdNumber(String ussdNumber) {
/* 19 */     this.ussdNumber = ussdNumber;
/*    */   }
/*    */   
/*    */   public UssdNumberEntity getNumberEntity() {
/* 23 */     return this.numberEntity;
/*    */   }
/*    */   
/*    */   public void setNumberEntity(UssdNumberEntity numberEntity) {
/* 27 */     this.numberEntity = numberEntity;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\message\USSDNumberMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */