/*    */ package Model.entity;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.core.BaseEntity;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Transient;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "REGION")
/*    */ public class RegionEntity implements BaseEntity<String> {
/*    */   private String name;
/*    */   
/*    */   public RegionEntity(String name) {
/* 17 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public RegionEntity() {}
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "NAME", nullable = false, length = 100)
/*    */   public String getName() {
/* 27 */     return this.name;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 31 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 36 */     if (this == o) return true; 
/* 37 */     if (o == null || getClass() != o.getClass()) return false; 
/* 38 */     RegionEntity that = (RegionEntity)o;
/* 39 */     return Objects.equals(this.name, that.name);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 44 */     return Objects.hash(new Object[] { this.name });
/*    */   }
/*    */ 
/*    */   
/*    */   @Transient
/*    */   public String getId() {
/* 50 */     return getName();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 55 */     return "RegionEntity{name='" + this.name + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\RegionEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */