/*    */ package Model.message;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.link.LinkConnectionStatus;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class M3UALinkStatusChangeMessage
/*    */   extends M3UAMessage
/*    */ {
/*    */   private LinkConnectionStatus lastStatus;
/*    */   private LinkConnectionStatus currentStatus;
/*    */   private String lastStatusText;
/*    */   private String currentStatusText;
/*    */   private Date lastUpdateDate;
/*    */   private Date currentUpdateDate;
/*    */   
/*    */   public LinkConnectionStatus getLastStatus() {
/* 19 */     return this.lastStatus;
/*    */   }
/*    */   
/*    */   public void setLastStatus(LinkConnectionStatus lastStatus) {
/* 23 */     this.lastStatus = lastStatus;
/*    */   }
/*    */   
/*    */   public LinkConnectionStatus getCurrentStatus() {
/* 27 */     return this.currentStatus;
/*    */   }
/*    */   
/*    */   public void setCurrentStatus(LinkConnectionStatus currentStatus) {
/* 31 */     this.currentStatus = currentStatus;
/*    */   }
/*    */   
/*    */   public String getLastStatusText() {
/* 35 */     return this.lastStatusText;
/*    */   }
/*    */   
/*    */   public void setLastStatusText(String lastStatusText) {
/* 39 */     this.lastStatusText = lastStatusText;
/*    */   }
/*    */   
/*    */   public String getCurrentStatusText() {
/* 43 */     return this.currentStatusText;
/*    */   }
/*    */   
/*    */   public void setCurrentStatusText(String currentStatusText) {
/* 47 */     this.currentStatusText = currentStatusText;
/*    */   }
/*    */   
/*    */   public Date getLastUpdateDate() {
/* 51 */     return this.lastUpdateDate;
/*    */   }
/*    */   
/*    */   public void setLastUpdateDate(Date lastUpdateDate) {
/* 55 */     this.lastUpdateDate = lastUpdateDate;
/*    */   }
/*    */   
/*    */   public Date getCurrentUpdateDate() {
/* 59 */     return this.currentUpdateDate;
/*    */   }
/*    */   
/*    */   public void setCurrentUpdateDate(Date currentUpdateDate) {
/* 63 */     this.currentUpdateDate = currentUpdateDate;
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\message\M3UALinkStatusChangeMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */