/*    */ package Model.stats;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StatsIdentifier
/*    */   implements Serializable
/*    */ {
/*    */   private StatsDomain domain;
/*    */   private String key;
/*    */   
/*    */   public StatsIdentifier(StatsDomain domain, String key) {
/* 15 */     this.domain = domain;
/* 16 */     this.key = key;
/*    */   }
/*    */   
/*    */   public StatsIdentifier(StatsDomain domain) {
/* 20 */     this(domain, domain.name());
/*    */   }
/*    */   
/*    */   public StatsDomain getDomain() {
/* 24 */     return this.domain;
/*    */   }
/*    */   
/*    */   public void setDomain(StatsDomain domain) {
/* 28 */     this.domain = domain;
/*    */   }
/*    */   
/*    */   public String getKey() {
/* 32 */     return this.key;
/*    */   }
/*    */   
/*    */   public void setKey(String key) {
/* 36 */     this.key = key;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 41 */     if (this == o) return true; 
/* 42 */     if (!(o instanceof StatsIdentifier)) return false; 
/* 43 */     StatsIdentifier that = (StatsIdentifier)o;
/* 44 */     return (Objects.equals(getDomain(), that.getDomain()) && 
/* 45 */       Objects.equals(getKey(), that.getKey()));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 50 */     return Objects.hash(new Object[] { getDomain(), getKey() });
/*    */   }
/*    */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\stats\StatsIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */