/*    */ package Model.core;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.MappedSuperclass;
/*    */ 
/*    */ @MappedSuperclass
/*    */ public abstract class NumericEntity
/*    */   implements BaseEntity<Long>
/*    */ {
/*    */   private long id;
/*    */   
/*    */   public void setId(long id) {
/* 15 */     this.id = id;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ID", nullable = false, precision = 0)
/*    */   public Long getId() {
/* 22 */     return Long.valueOf(this.id);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 27 */     if (this == o) return true; 
/* 28 */     if (!(o instanceof NumericEntity)) return false; 
/* 29 */     NumericEntity that = (NumericEntity)o;
/* 30 */     return Objects.equals(getId(), that.getId());
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 35 */     return Objects.hash(new Object[] { getId() });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\core\NumericEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */