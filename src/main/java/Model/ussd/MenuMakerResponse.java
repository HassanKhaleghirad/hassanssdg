/*    */ package Model.ussd;
/*    */ 
/*    */ import ir.markazandroid.JSONParser.annotations.JSON;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JSON
/*    */ public class MenuMakerResponse
/*    */   implements Serializable
/*    */ {
/*    */   private String commandType;
/*    */   private String result;
/*    */   
/*    */   @JSON(name = "Command_Type")
/*    */   public String getCommandType() {
/* 18 */     return this.commandType;
/*    */   }
/*    */   
/*    */   public void setCommandType(String commandType) {
/* 22 */     this.commandType = commandType;
/*    */   }
/*    */   
/*    */   @JSON(name = "Result")
/*    */   public String getResult() {
/* 27 */     return this.result;
/*    */   }
/*    */   
/*    */   public void setResult(String result) {
/* 31 */     this.result = result;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 36 */     return "MenuMakerResponse{commandType='" + this.commandType + '\'' + ", result='" + this.result + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\MenuMakerResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */