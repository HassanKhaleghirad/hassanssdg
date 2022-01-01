/*    */ package Model.exception;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PushDeclineException
/*    */   extends MessageDeclineException
/*    */ {
/*    */   public void printStackTrace() {
/* 13 */     super.printStackTrace();
/*    */   }
/*    */ 
/*    */   
/*    */   public void printStackTrace(PrintStream s) {
/* 18 */     super.printStackTrace(s);
/*    */   }
/*    */ 
/*    */   
/*    */   public void printStackTrace(PrintWriter s) {
/* 23 */     super.printStackTrace(s);
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\exception\PushDeclineException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */