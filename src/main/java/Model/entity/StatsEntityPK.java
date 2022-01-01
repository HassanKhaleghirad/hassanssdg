/*    */ package Model.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.sql.Timestamp;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ 
/*    */ public class StatsEntityPK
/*    */   implements Serializable
/*    */ {
/*    */   private String domain;
/*    */   private String key;
/*    */   private Timestamp time;
/*    */   
/*    */   public StatsEntityPK(String domain, String key, Timestamp time) {
/* 18 */     this.domain = domain;
/* 19 */     this.key = key;
/* 20 */     this.time = time;
/*    */   }
/*    */ 
/*    */   
/*    */   public StatsEntityPK() {}
/*    */   
/*    */   @Column(name = "DOMAIN", nullable = false, length = 100)
/*    */   @Id
/*    */   public String getDomain() {
/* 29 */     return this.domain;
/*    */   }
/*    */   
/*    */   public void setDomain(String domain) {
/* 33 */     this.domain = domain;
/*    */   }
/*    */   
/*    */   @Column(name = "KEY", nullable = false, length = 100)
/*    */   @Id
/*    */   public String getKey() {
/* 39 */     return this.key;
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 43 */     this.key = key;
/*    */   }
/*    */   
/*    */   @Column(name = "TIME", nullable = false)
/*    */   @Id
/*    */   public Timestamp getTime() {
/* 49 */     return this.time;
/*    */   }
/*    */   
/*    */   public void setTime(Timestamp time) {
/* 53 */     this.time = time;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 58 */     if (this == o) return true; 
/* 59 */     if (o == null || getClass() != o.getClass()) return false; 
/* 60 */     StatsEntityPK that = (StatsEntityPK)o;
/* 61 */     return (Objects.equals(this.domain, that.domain) && 
/* 62 */       Objects.equals(this.key, that.key) && 
/* 63 */       Objects.equals(this.time, that.time));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 68 */     return Objects.hash(new Object[] { this.domain, this.key, this.time });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\StatsEntityPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */