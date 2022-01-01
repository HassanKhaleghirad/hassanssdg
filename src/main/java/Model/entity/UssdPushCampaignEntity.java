/*     */ package Model.entity;
/*     */ import ir.markazandroid.JSONParser.annotations.JSON;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.Objects;
/*     */ import javax.persistence.Basic;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.EnumType;
/*     */ import javax.persistence.Transient;
/*     */ 
/*     */ @JSON
/*     */ @Entity
/*     */ @Table(name = "USSD_PUSH_CAMPAIGN")
/*     */ public class UssdPushCampaignEntity implements BaseEntity<String> {
/*     */   private String campaignId;
/*     */   
/*     */   public enum Status {
/*  20 */     idle,
/*  21 */     running,
/*  22 */     stopped,
/*  23 */     finished;
/*     */   }
/*     */ 
/*     */   
/*  27 */   private Status status = Status.idle;
/*     */   private Long total;
/*     */   private Long sent;
/*     */   private Timestamp firstStartTime;
/*     */   private Timestamp lastStartTime;
/*     */   private Long maxSessions;
/*     */   private String allowedSendTimeStart;
/*     */   private String allowedSendTimeEnd;
/*     */   private String type;
/*     */   
/*     */   @JSON
/*     */   @Id
/*     */   @Column(name = "CAMPAIGN_ID", nullable = false, length = 50)
/*     */   public String getCampaignId() {
/*  41 */     return this.campaignId;
/*     */   }
/*     */   
/*     */   public void setCampaignId(String campaignId) {
/*  45 */     this.campaignId = campaignId;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Enumerated(EnumType.STRING)
/*     */   @Column(name = "STATUS", length = 30, nullable = true)
/*     */   public Status getStatus() {
/*  52 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(Status status) {
/*  56 */     this.status = status;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "TOTAL", nullable = true, precision = 0)
/*     */   public Long getTotal() {
/*  63 */     return this.total;
/*     */   }
/*     */   
/*     */   public void setTotal(Long total) {
/*  67 */     this.total = total;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "SENT", nullable = true, precision = 0)
/*     */   public Long getSent() {
/*  74 */     return this.sent;
/*     */   }
/*     */   
/*     */   public void setSent(Long sent) {
/*  78 */     this.sent = sent;
/*     */   }
/*     */   
/*     */   @JSON(classType = "timestamp")
/*     */   @Basic
/*     */   @Column(name = "FIRST_START_TIME", nullable = true)
/*     */   public Timestamp getFirstStartTime() {
/*  85 */     return this.firstStartTime;
/*     */   }
/*     */   
/*     */   public void setFirstStartTime(Timestamp firstStartTime) {
/*  89 */     this.firstStartTime = firstStartTime;
/*     */   }
/*     */   
/*     */   @JSON(classType = "timestamp")
/*     */   @Basic
/*     */   @Column(name = "LAST_START_TIME", nullable = true)
/*     */   public Timestamp getLastStartTime() {
/*  96 */     return this.lastStartTime;
/*     */   }
/*     */   
/*     */   public void setLastStartTime(Timestamp lastStartTime) {
/* 100 */     this.lastStartTime = lastStartTime;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "MAX_SESSIONS", nullable = true, precision = 0)
/*     */   public Long getMaxSessions() {
/* 107 */     return this.maxSessions;
/*     */   }
/*     */   
/*     */   public void setMaxSessions(Long maxSessions) {
/* 111 */     this.maxSessions = maxSessions;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 116 */     if (this == o) return true; 
/* 117 */     if (o == null || getClass() != o.getClass()) return false; 
/* 118 */     UssdPushCampaignEntity that = (UssdPushCampaignEntity)o;
/* 119 */     return (Objects.equals(this.campaignId, that.campaignId) && 
/* 120 */       Objects.equals(this.status, that.status) && 
/* 121 */       Objects.equals(this.total, that.total) && 
/* 122 */       Objects.equals(this.sent, that.sent) && 
/* 123 */       Objects.equals(this.firstStartTime, that.firstStartTime) && 
/* 124 */       Objects.equals(this.lastStartTime, that.lastStartTime) && 
/* 125 */       Objects.equals(this.maxSessions, that.maxSessions));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 130 */     return Objects.hash(new Object[] { this.campaignId, this.status, this.total, this.sent, this.firstStartTime, this.lastStartTime, this.maxSessions });
/*     */   }
/*     */ 
/*     */   
/*     */   @Transient
/*     */   public String getId() {
/* 136 */     return getCampaignId();
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "ALLOWED_SEND_TIME_START", nullable = true, length = 5)
/*     */   public String getAllowedSendTimeStart() {
/* 143 */     return this.allowedSendTimeStart;
/*     */   }
/*     */   
/*     */   public void setAllowedSendTimeStart(String allowedSendTimeStart) {
/* 147 */     this.allowedSendTimeStart = allowedSendTimeStart;
/*     */   }
/*     */   
/*     */   @JSON
/*     */   @Basic
/*     */   @Column(name = "ALLOWED_SEND_TIME_END", nullable = true, length = 5)
/*     */   public String getAllowedSendTimeEnd() {
/* 154 */     return this.allowedSendTimeEnd;
/*     */   }
/*     */   
/*     */   public void setAllowedSendTimeEnd(String allowedSendTimeEnd) {
/* 158 */     this.allowedSendTimeEnd = allowedSendTimeEnd;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "TYPE", nullable = true, length = 30)
/*     */   public String getType() {
/* 164 */     return this.type;
/*     */   }
/*     */   
/*     */   public void setType(String type) {
/* 168 */     this.type = type;
/*     */   }
/*     */   
/*     */   @Transient
/*     */   public Date getAllowedSendTimeEndDate() {
/* 173 */     return convertDate(getAllowedSendTimeEnd());
/*     */   }
/*     */   
/*     */   @Transient
/*     */   public Date getAllowedSendTimeStartDate() {
/* 178 */     return convertDate(getAllowedSendTimeStart());
/*     */   }
/*     */   
/*     */   public static Date convertDate(String datTime) {
/* 182 */     String[] params = datTime.split(":");
/* 183 */     Calendar calendar = Calendar.getInstance();
/* 184 */     calendar.set(11, Integer.parseInt(params[0]));
/* 185 */     calendar.set(12, Integer.parseInt(params[1]));
/* 186 */     return calendar.getTime();
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\UssdPushCampaignEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */