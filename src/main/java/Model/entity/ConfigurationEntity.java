/*    */ package Model.entity;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.core.BaseEntity;
/*    */ import java.sql.Timestamp;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Basic;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Transient;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "CONFIGURATION")
/*    */ public class ConfigurationEntity
/*    */   implements BaseEntity<String> {
/*    */   private String key;
/*    */   private String value;
/*    */   
/*    */   @Id
/*    */   @Column(name = "KEY", nullable = false, length = 1000)
/*    */   public String getKey() {
/* 23 */     return this.key;
/*    */   }
/*    */   private Timestamp updateTime; private Boolean enabled;
/*    */   public void setKey(String key) {
/* 27 */     this.key = key;
/*    */   }
/*    */   
/*    */   @Basic
/*    */   @Column(name = "VALUE", nullable = true, length = 1000)
/*    */   public String getValue() {
/* 33 */     return this.value;
/*    */   }
/*    */   
/*    */   public void setValue(String value) {
/* 37 */     this.value = value;
/*    */   }
/*    */   
/*    */   @Basic
/*    */   @Column(name = "UPDATE_TIME", nullable = true)
/*    */   public Timestamp getUpdateTime() {
/* 43 */     return this.updateTime;
/*    */   }
/*    */   
/*    */   public void setUpdateTime(Timestamp updateTime) {
/* 47 */     this.updateTime = updateTime;
/*    */   }
/*    */   
/*    */   @Basic
/*    */   @Column(name = "ENABLED", nullable = true, precision = 0)
/*    */   public Boolean getEnabled() {
/* 53 */     return this.enabled;
/*    */   }
/*    */   
/*    */   public void setEnabled(Boolean enabled) {
/* 57 */     this.enabled = enabled;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 62 */     if (this == o) return true; 
/* 63 */     if (o == null || getClass() != o.getClass()) return false; 
/* 64 */     ConfigurationEntity that = (ConfigurationEntity)o;
/* 65 */     return (Objects.equals(this.key, that.key) && 
/* 66 */       Objects.equals(this.value, that.value) && 
/* 67 */       Objects.equals(this.updateTime, that.updateTime) && 
/* 68 */       Objects.equals(this.enabled, that.enabled));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 73 */     return Objects.hash(new Object[] { this.key, this.value, this.updateTime, this.enabled });
/*    */   }
/*    */ 
/*    */   
/*    */   @Transient
/*    */   public String getId() {
/* 79 */     return getKey();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 84 */     return "ConfigurationEntity{key='" + this.key + '\'' + ", value='" + this.value + '\'' + ", updateTime=" + this.updateTime + ", enabled=" + this.enabled + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\ConfigurationEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */