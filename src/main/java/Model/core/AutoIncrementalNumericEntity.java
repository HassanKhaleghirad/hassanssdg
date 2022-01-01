/*    */ package Model.core;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.GeneratedValue;
/*    */ import javax.persistence.GenerationType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.MappedSuperclass;
/*    */ 
/*    */ @MappedSuperclass
/*    */ public abstract class AutoIncrementalNumericEntity implements BaseEntity<Long> {
/*    */   private long id;
/*    */   
/*    */   public void setId(long id) {
/* 15 */     this.id = id;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ID", nullable = false, precision = 0)
/*    */   @GeneratedValue(strategy = GenerationType.IDENTITY)
/*    */   public Long getId() {
/* 23 */     return Long.valueOf(this.id);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 28 */     if (this == o) return true; 
/* 29 */     if (!(o instanceof AutoIncrementalNumericEntity)) return false; 
/* 30 */     AutoIncrementalNumericEntity that = (AutoIncrementalNumericEntity)o;
/* 31 */     return Objects.equals(getId(), that.getId());
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     return Objects.hash(new Object[] { getId() });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\AutoIncrementalNumericEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */