/*    */ package Model;
/*    */ 
/*    */ import ir.markazandroid.JSONParser.annotations.JSON;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JSON
/*    */ public class HttpResponse<T>
/*    */   implements Serializable
/*    */ {
/*    */   private boolean successful;
/*    */   private String message;
/*    */   private Integer errorCode;
/*    */   private T result;
/*    */   
/*    */   public static HttpResponse<?> ok(String message) {
/* 19 */     HttpResponse<?> response = new HttpResponse();
/* 20 */     response.setSuccessful(true);
/* 21 */     response.setMessage(message);
/* 22 */     return response;
/*    */   }
/*    */   
/*    */   @JSON
/*    */   public boolean getSuccessful() {
/* 27 */     return this.successful;
/*    */   }
/*    */   
/*    */   public void setSuccessful(boolean successful) {
/* 31 */     this.successful = successful;
/*    */   }
/*    */   
/*    */   @JSON
/*    */   public String getMessage() {
/* 36 */     return this.message;
/*    */   }
/*    */   
/*    */   public void setMessage(String message) {
/* 40 */     this.message = message;
/*    */   }
/*    */   
/*    */   @JSON
/*    */   public Integer getErrorCode() {
/* 45 */     return this.errorCode;
/*    */   }
/*    */   
/*    */   public void setErrorCode(Integer errorCode) {
/* 49 */     this.errorCode = errorCode;
/*    */   }
/*    */   
/*    */   @JSON(classType = "object")
/*    */   public T getResult() {
/* 54 */     return this.result;
/*    */   }
/*    */   
/*    */   public void setResult(T result) {
/* 58 */     this.result = result;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\HttpResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */