/*     */ package Model.entity;
/*     */ import java.util.Objects;
/*     */ import javax.persistence.Column;
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "AUDIT_LOG")
/*     */ @IdClass(AuditLogEntityPK.class)
/*     */ public class AuditLogEntity implements BaseEntity<AuditLogEntityPK> {
/*     */   private String username;
/*     */   private Timestamp time;
/*     */   private String log;
/*     */   private Result result;
/*     */   private String action;
/*     */   private String address;
/*     */   
/*     */   public enum Result {
/*  17 */     successful,
/*  18 */     failed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Id
/*     */   @Basic
/*     */   @Column(name = "USERNAME", nullable = false, length = 30)
/*     */   public String getUsername() {
/*  32 */     return this.username;
/*     */   }
/*     */   
/*     */   public void setUsername(String username) {
/*  36 */     this.username = username;
/*     */   }
/*     */   
/*     */   @Id
/*     */   @Basic
/*     */   @Column(name = "TIME", nullable = false)
/*     */   public Timestamp getTime() {
/*  43 */     return this.time;
/*     */   }
/*     */   
/*     */   public void setTime(Timestamp time) {
/*  47 */     this.time = time;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "LOG", nullable = true)
/*     */   public String getLog() {
/*  53 */     return this.log;
/*     */   }
/*     */   
/*     */   public void setLog(String log) {
/*  57 */     this.log = log;
/*     */   }
/*     */ 
/*     */   
/*     */   @Transient
/*     */   public AuditLogEntityPK getId() {
/*  63 */     return new AuditLogEntityPK(getUsername(), getTime());
/*     */   }
/*     */   
/*     */   @Enumerated(EnumType.STRING)
/*     */   @Column(name = "RESULT", nullable = true, length = 20)
/*     */   public Result getResult() {
/*  69 */     return this.result;
/*     */   }
/*     */   
/*     */   public void setResult(Result result) {
/*  73 */     this.result = result;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "ACTION", nullable = true, length = 300)
/*     */   public String getAction() {
/*  79 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/*  83 */     this.action = action;
/*     */   }
/*     */ 
/*     */   
/*     */   @Basic
/*     */   @Column(name = "ADDRESS", nullable = true)
/*     */   public String getAddress() {
/*  90 */     return this.address;
/*     */   }
/*     */   
/*     */   public void setAddress(String address) {
/*  94 */     this.address = address;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 100 */     if (this == o) return true; 
/* 101 */     if (!(o instanceof AuditLogEntity)) return false; 
/* 102 */     AuditLogEntity that = (AuditLogEntity)o;
/* 103 */     return (Objects.equals(getUsername(), that.getUsername()) && 
/* 104 */       Objects.equals(getTime(), that.getTime()) && 
/* 105 */       Objects.equals(getLog(), that.getLog()) && 
/* 106 */       getResult() == that.getResult() && 
/* 107 */       Objects.equals(getAction(), that.getAction()) && 
/* 108 */       Objects.equals(getAddress(), that.getAddress()));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 113 */     return Objects.hash(new Object[] { getUsername(), getTime(), getLog(), getResult(), getAction(), getAddress() });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 118 */     return "AuditLogEntity{username='" + this.username + '\'' + ", time=" + this.time + ", log='" + this.log + '\'' + ", result=" + this.result + ", action='" + this.action + '\'' + ", address='" + this.address + '\'' + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\AuditLogEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */