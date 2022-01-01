/*     */ package Model.entity;
/*     */ 
/*     */ import ir.markazandroid.JSONParser.annotations.JSON;
/*     */ import ir.markazandroid.greengate.model.core.BaseEntity;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Objects;
/*     */ import javax.persistence.Basic;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.IdClass;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Transient;
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "USSD_PUSH", schema = "GREEN_GATE", catalog = "")
/*     */ @IdClass(UssdPushEntityPK.class)
/*     */ @JSON
/*     */ public class UssdPushEntity
/*     */   implements BaseEntity<UssdPushEntityPK>
/*     */ {
/*     */   private String campaignId;
/*     */   private String msisdn;
/*     */   private String ussdNumber;
/*     */   private String message;
/*     */   
/*     */   @Id
/*     */   @Column(name = "CAMPAIGN_ID", nullable = false, length = 100)
/*     */   public String getCampaignId() {
/*  31 */     return this.campaignId;
/*     */   }
/*     */   private Timestamp createTime; private String sessionId; private Timestamp sendTime; private String menuNumber; private Boolean continuous;
/*     */   public void setCampaignId(String campaignId) {
/*  35 */     this.campaignId = campaignId;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Id
/*     */   @Column(name = "MSISDN", nullable = false, length = 20)
/*     */   public String getMsisdn() {
/*  42 */     return this.msisdn;
/*     */   }
/*     */   
/*     */   public void setMsisdn(String msisdn) {
/*  46 */     this.msisdn = msisdn;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "USSD_NUMBER", nullable = true, length = 20)
/*     */   public String getUssdNumber() {
/*  53 */     return this.ussdNumber;
/*     */   }
/*     */   
/*     */   public void setUssdNumber(String ussdNumber) {
/*  57 */     this.ussdNumber = ussdNumber;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "MESSAGE", nullable = true, length = 300)
/*     */   public String getMessage() {
/*  64 */     return this.message;
/*     */   }
/*     */   
/*     */   public void setMessage(String message) {
/*  68 */     this.message = message;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "CREATE_TIME", nullable = true)
/*     */   public Timestamp getCreateTime() {
/*  74 */     return this.createTime;
/*     */   }
/*     */   
/*     */   public void setCreateTime(Timestamp createTime) {
/*  78 */     this.createTime = createTime;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "SESSION_ID", nullable = true, length = 36)
/*     */   public String getSessionId() {
/*  85 */     return this.sessionId;
/*     */   }
/*     */   
/*     */   public void setSessionId(String sessionId) {
/*  89 */     this.sessionId = sessionId;
/*     */   }
/*     */   
/*     */   @JSON("timestamp")
/*     */   @Basic
/*     */   @Column(name = "SEND_TIME", nullable = true)
/*     */   public Timestamp getSendTime() {
/*  96 */     return this.sendTime;
/*     */   }
/*     */   
/*     */   public void setSendTime(Timestamp sendTime) {
/* 100 */     this.sendTime = sendTime;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "MENU_NUMBER", nullable = true, length = 50)
/*     */   public String getMenuNumber() {
/* 107 */     return this.menuNumber;
/*     */   }
/*     */   
/*     */   public void setMenuNumber(String menuNumber) {
/* 111 */     this.menuNumber = menuNumber;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 116 */     if (this == o) return true; 
/* 117 */     if (o == null || getClass() != o.getClass()) return false; 
/* 118 */     UssdPushEntity that = (UssdPushEntity)o;
/* 119 */     return (Objects.equals(this.campaignId, that.campaignId) && 
/* 120 */       Objects.equals(this.msisdn, that.msisdn) && 
/* 121 */       Objects.equals(this.ussdNumber, that.ussdNumber) && 
/* 122 */       Objects.equals(this.message, that.message) && 
/* 123 */       Objects.equals(this.createTime, that.createTime) && 
/* 124 */       Objects.equals(this.sessionId, that.sessionId) && 
/* 125 */       Objects.equals(this.sendTime, that.sendTime) && 
/* 126 */       Objects.equals(this.menuNumber, that.menuNumber));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 131 */     return Objects.hash(new Object[] { this.campaignId, this.msisdn, this.ussdNumber, this.message, this.createTime, this.sessionId, this.sendTime, this.menuNumber });
/*     */   }
/*     */ 
/*     */   
/*     */   @Transient
/*     */   public UssdPushEntityPK getId() {
/* 137 */     return new UssdPushEntityPK(getCampaignId(), getMsisdn());
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "CONTINUOUS", nullable = true, precision = 0)
/*     */   public Boolean getContinuous() {
/* 144 */     return this.continuous;
/*     */   }
/*     */   
/*     */   public void setContinuous(Boolean continuous) {
/* 148 */     this.continuous = continuous;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 153 */     return "UssdPushEntity{campaignId='" + this.campaignId + '\'' + ", msisdn='" + this.msisdn + '\'' + ", ussdNumber='" + this.ussdNumber + '\'' + ", message='" + this.message + '\'' + ", createTime=" + this.createTime + ", sessionId='" + this.sessionId + '\'' + ", sendTime=" + this.sendTime + ", menuNumber='" + this.menuNumber + '\'' + ", continuous=" + this.continuous + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\UssdPushEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */