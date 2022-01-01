/*    */ package Model.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ 
/*    */ public class UssdPushEntityPK
/*    */   implements Serializable
/*    */ {
/*    */   private String campaignId;
/*    */   private String msisdn;
/*    */   
/*    */   public UssdPushEntityPK(String campaignId, String msisdn) {
/* 16 */     this.campaignId = campaignId;
/* 17 */     this.msisdn = msisdn;
/*    */   }
/*    */ 
/*    */   
/*    */   public UssdPushEntityPK() {}
/*    */   
/*    */   @Column(name = "CAMPAIGN_ID", nullable = false, length = 100)
/*    */   @Id
/*    */   public String getCampaignId() {
/* 26 */     return this.campaignId;
/*    */   }
/*    */   
/*    */   public void setCampaignId(String campaignId) {
/* 30 */     this.campaignId = campaignId;
/*    */   }
/*    */   
/*    */   @Column(name = "MSISDN", nullable = false, length = 20)
/*    */   @Id
/*    */   public String getMsisdn() {
/* 36 */     return this.msisdn;
/*    */   }
/*    */   
/*    */   public void setMsisdn(String msisdn) {
/* 40 */     this.msisdn = msisdn;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 45 */     if (this == o) return true; 
/* 46 */     if (o == null || getClass() != o.getClass()) return false; 
/* 47 */     UssdPushEntityPK that = (UssdPushEntityPK)o;
/* 48 */     return (Objects.equals(this.campaignId, that.campaignId) && 
/* 49 */       Objects.equals(this.msisdn, that.msisdn));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 54 */     return Objects.hash(new Object[] { this.campaignId, this.msisdn });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\UssdPushEntityPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */