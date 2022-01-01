/*    */ package Model.entity;
/*    */ 
/*    */ import ir.markazandroid.greengate.model.core.BaseEntity;
/*    */ import java.util.Objects;
/*    */ import javax.persistence.Basic;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.Transient;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "GUSER")
/*    */ public class UserEntity implements BaseEntity<String> {
/*    */   private String username;
/*    */   private String password;
/*    */   
/*    */   @Id
/*    */   @Column(name = "USERNAME", nullable = false, length = 20)
/*    */   public String getUsername() {
/* 21 */     return this.username;
/*    */   }
/*    */   
/*    */   public void setUsername(String username) {
/* 25 */     this.username = username;
/*    */   }
/*    */   
/*    */   @Basic
/*    */   @Column(name = "PASSWORD", nullable = true, length = 30)
/*    */   public String getPassword() {
/* 31 */     return this.password;
/*    */   }
/*    */   
/*    */   public void setPassword(String password) {
/* 35 */     this.password = password;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 40 */     if (this == o) return true; 
/* 41 */     if (!(o instanceof UserEntity)) return false; 
/* 42 */     UserEntity that = (UserEntity)o;
/* 43 */     return (Objects.equals(getUsername(), that.getUsername()) && 
/* 44 */       Objects.equals(getPassword(), that.getPassword()));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 49 */     return Objects.hash(new Object[] { getUsername(), getPassword() });
/*    */   }
/*    */ 
/*    */   
/*    */   @Transient
/*    */   public String getId() {
/* 55 */     return getUsername();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 60 */     return "UserEntity{username='" + this.username + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\UserEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */