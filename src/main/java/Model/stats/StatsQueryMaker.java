/*     */ package Model.stats;
/*     */ 
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Calendar;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StatsQueryMaker
/*     */ {
/*     */   private final TikType tikType;
/*     */   private final String timeFieldName;
/*     */   private final String[] fields;
/*     */   private final Timestamp from;
/*     */   private final Timestamp to;
/*     */   private final String dateParamName;
/*     */   
/*     */   private StatsQueryMaker(TikType tikType, String timeFieldName, Timestamp from, Timestamp to, String dateParamName) {
/*  21 */     this.tikType = tikType;
/*  22 */     this.timeFieldName = timeFieldName;
/*  23 */     this.from = from;
/*  24 */     this.to = to;
/*  25 */     this.dateParamName = dateParamName;
/*     */     
/*  27 */     this.fields = new String[(tikType.getGp()).length];
/*     */     
/*  29 */     for (int i = 0; i < (tikType.getGp()).length; i++) {
/*  30 */       this.fields[i] = tO_CHAR(tikType.getGp()[i]);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String buildGroupBy() {
/*  36 */     return String.join(",", (CharSequence[])this.fields);
/*     */   }
/*     */   
/*     */   public String buildProjection() {
/*  40 */     String projection = this.fields[0];
/*  41 */     for (int i = 1; i < this.fields.length; i++) {
/*  42 */       projection = cONCAT(projection, this.fields[i]);
/*     */     }
/*  44 */     return projection + " " + this.dateParamName;
/*     */   }
/*     */   
/*     */   public String buildSelection() {
/*  48 */     return String.format("(%s BETWEEN TO_TIMESTAMP('%s','YYYY-MM-DD HH24:MI:SS.FF') AND %S)", new Object[] { this.timeFieldName, this.from
/*  49 */           .toString(), (this.to == null) ? "current_timestamp" : 
/*  50 */           String.format("TO_TIMESTAMP('%s','YYYY-MM-DD HH24:MI:SS.FF')", new Object[] { this.to.toString() }) });
/*     */   }
/*     */   
/*     */   public String buildOrderBy() {
/*  54 */     return this.dateParamName + " desc";
/*     */   }
/*     */   
/*     */   public String buildFetch() {
/*  58 */     return String.format("FETCH FIRST %d ROWS ONLY", new Object[] { Integer.valueOf(20) });
/*     */   }
/*     */   
/*     */   public static Timestamp convertToTimestamp(String dateParam) {
/*  62 */     int year = Integer.parseInt(dateParam.substring(0, 4));
/*  63 */     int month = 1;
/*  64 */     int day = 1;
/*  65 */     int hour = 0;
/*  66 */     int min = 0;
/*     */ 
/*     */     
/*  69 */     if (dateParam.length() > 4) {
/*  70 */       month = Integer.parseInt(dateParam.substring(4, 6));
/*     */     }
/*  72 */     if (dateParam.length() > 6) {
/*  73 */       day = Integer.parseInt(dateParam.substring(6, 8));
/*     */     }
/*  75 */     if (dateParam.length() > 8) {
/*  76 */       hour = Integer.parseInt(dateParam.substring(8, 10));
/*     */     }
/*  78 */     if (dateParam.length() > 10) {
/*  79 */       min = Integer.parseInt(dateParam.substring(10, 12));
/*     */     }
/*     */ 
/*     */     
/*  83 */     Calendar calendar = Calendar.getInstance();
/*  84 */     calendar.set(year, month - 1, day, hour, min, 30);
/*     */     
/*  86 */     return new Timestamp(calendar.getTimeInMillis());
/*     */   }
/*     */   
/*     */   private String tO_CHAR(String gp) {
/*  90 */     return String.format("TO_CHAR(%s, '%s')", new Object[] { this.timeFieldName, gp });
/*     */   }
/*     */   
/*     */   private String cONCAT(String firstPart, String secondPart) {
/*  94 */     return String.format("CONCAT(%s, %s)", new Object[] { firstPart, secondPart });
/*     */   }
/*     */   
/*     */   public static class Builder {
/*     */     private TikType tikType;
/*  99 */     private String timeFieldName = "STATS.TIME";
/* 100 */     private Timestamp from = new Timestamp(0L);
/*     */     private Timestamp to;
/* 102 */     private String dateParamName = "dateParam";
/*     */     
/*     */     public Builder(TikType tikType) {
/* 105 */       if (tikType == TikType.second) {
/* 106 */         throw new RuntimeException(TikType.second + " is not supported");
/*     */       }
/* 108 */       this.tikType = tikType;
/*     */     }
/*     */     
/*     */     public Builder timeFieldName(String timeFieldName) {
/* 112 */       this.timeFieldName = timeFieldName;
/* 113 */       return this;
/*     */     }
/*     */     
/*     */     public Builder from(Timestamp from) {
/* 117 */       this.from = from;
/* 118 */       return this;
/*     */     }
/*     */     public Builder to(Timestamp to) {
/* 121 */       this.to = to;
/* 122 */       return this;
/*     */     }
/*     */     public Builder dateParamName(String dateParamName) {
/* 125 */       this.dateParamName = dateParamName;
/* 126 */       return this;
/*     */     }
/*     */     
/*     */     public StatsQueryMaker build() {
/* 130 */       return new StatsQueryMaker(this.tikType, this.timeFieldName, this.from, this.to, this.dateParamName);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\stats\StatsQueryMaker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */