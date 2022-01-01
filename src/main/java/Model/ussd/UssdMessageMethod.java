/*    */ package Model.ussd;
/*    */ 
/*    */ public enum UssdMessageMethod {
/*  4 */   begin("ProcessUnstructuredSS-Request"),
/*  5 */   continu("UnstructuredSS-Request"),
/*  6 */   begin_iteractive_push(continu.methodName),
/*  7 */   notify("UnstructuredSSNotify-Request"),
/*  8 */   end("ProcessUnstructuredSS-Response"),
/*  9 */   end_push(notify.methodName),
/* 10 */   reject("TC-U-REJECT");
/*    */   
/*    */   private String methodName;
/*    */ 
/*    */   
/*    */   public String getMethodName() {
/* 16 */     return this.methodName;
/*    */   }
/*    */   
/*    */   UssdMessageMethod(String methodName) {
/* 20 */     this.methodName = methodName;
/*    */   }
/*    */   
/*    */   public String toMenuMakerCommandType() {
/* 24 */     switch (this) { case begin_iteractive_push:
/*    */       case begin:
/* 26 */         return "111";
/*    */       case continu:
/* 28 */         return "112";
/* 29 */       case end: return "113"; }
/*    */     
/* 31 */     return null;
/*    */   }
/*    */   
/*    */   public static UssdMessageMethod fromMenuMakerCommand(String command) {
/* 35 */     switch (command) { case "111":
/* 36 */         return begin;
/* 37 */       case "112": return continu;
/* 38 */       case "113": return end; }
/*    */     
/* 40 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\mode\\ussd\UssdMessageMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */