/*    */ package Model.entity;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.sql.Timestamp;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Basic;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Id;
/*    */ 
/*    */ 
/*    */ public class AuditLogEntityPK
/*    */   implements Serializable
/*    */ {
/*    */   private String username;
/*    */   private Timestamp time;
/*    */   
/*    */   public AuditLogEntityPK(String username, Timestamp time) {
/* 18 */     this.username = username;
/* 19 */     this.time = time;
/*    */   }
/*    */ 
/*    */   
/*    */   public AuditLogEntityPK() {}
/*    */   
/*    */   @Column(name = "USERNAME", nullable = false, length = 30)
/*    */   @Basic
/*    */   @Id
/*    */   public String getUsername() {
/* 29 */     return this.username;
/*    */   }
/*    */   
/*    */   public void setUsername(String username) {
/* 33 */     this.username = username;
/*    */   }
/*    */   
/*    */   @Column(name = "TIME", nullable = false)
/*    */   @Basic
/*    */   @Id
/*    */   public Timestamp getTime() {
/* 40 */     return this.time;
/*    */   }
/*    */   
/*    */   public void setTime(Timestamp time) {
/* 44 */     this.time = time;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 49 */     if (this == o) return true; 
/* 50 */     if (o == null || getClass() != o.getClass()) return false; 
/* 51 */     AuditLogEntityPK that = (AuditLogEntityPK)o;
/* 52 */     return (Objects.equals(this.username, that.username) && 
/* 53 */       Objects.equals(this.time, that.time));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 58 */     return Objects.hash(new Object[] { this.username, this.time });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\AuditLogEntityPK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */