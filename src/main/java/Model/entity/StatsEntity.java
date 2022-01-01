/*    */ package Model.entity;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.core.BaseEntity;
/*    */ import java.sql.Timestamp;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Basic;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.IdClass;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Transient;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "STATS")
/*    */ @IdClass(StatsEntityPK.class)
/*    */ public class StatsEntity implements BaseEntity<StatsEntityPK> {
/*    */   private String domain;
/*    */   private String key;
/*    */   
/*    */   @Id
/*    */   @Column(name = "DOMAIN", nullable = false, length = 100)
/*    */   public String getDomain() {
/* 24 */     return this.domain;
/*    */   }
/*    */   private Timestamp time; private String value;
/*    */   public void setDomain(String domain) {
/* 28 */     this.domain = domain;
/*    */   }
/*    */   
/*    */   @Id
/*    */   @Column(name = "KEY", nullable = false, length = 100)
/*    */   public String getKey() {
/* 34 */     return this.key;
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 38 */     this.key = key;
/*    */   }
/*    */   
/*    */   @Id
/*    */   @Column(name = "TIME", nullable = false)
/*    */   public Timestamp getTime() {
/* 44 */     return this.time;
/*    */   }
/*    */   
/*    */   public void setTime(Timestamp time) {
/* 48 */     this.time = time;
/*    */   }
/*    */   
/*    */   @Basic
/*    */   @Column(name = "VALUE", nullable = true, length = 100)
/*    */   public String getValue() {
/* 54 */     return this.value;
/*    */   }
/*    */   
/*    */   public void setValue(String value) {
/* 58 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 63 */     if (this == o) return true; 
/* 64 */     if (o == null || getClass() != o.getClass()) return false; 
/* 65 */     StatsEntity that = (StatsEntity)o;
/* 66 */     return (Objects.equals(this.domain, that.domain) && 
/* 67 */       Objects.equals(this.key, that.key) && 
/* 68 */       Objects.equals(this.time, that.time) && 
/* 69 */       Objects.equals(this.value, that.value));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 74 */     return Objects.hash(new Object[] { this.domain, this.key, this.time, this.value });
/*    */   }
/*    */ 
/*    */   
/*    */   @Transient
/*    */   public StatsEntityPK getId() {
/* 80 */     return new StatsEntityPK(getDomain(), getKey(), getTime());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 85 */     return "StatsEntity{domain='" + this.domain + '\'' + ", key='" + this.key + '\'' + ", time=" + this.time + ", value='" + this.value + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\StatsEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */