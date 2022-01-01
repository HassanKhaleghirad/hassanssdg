/*     */ package Model.entity;
/*     */ import ir.markazandroid.greengate.model.core.Titled;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Basic;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EnumType;
/*     */ import javax.persistence.Enumerated;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToMany;
/*     */ import javax.persistence.Transient;
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "USSD_NUMBER")
/*     */ public class UssdNumberEntity implements BaseEntity<String> {
/*     */   private String ussdNumber;
/*  19 */   private int tpsMax = 0; private String name;
/*     */   private boolean enabled = true;
/*     */   private Timestamp createTime;
/*     */   private Timestamp updateTime;
/*     */   private boolean vlr = false;
/*  24 */   private SubNumberMode subNumberMode = SubNumberMode.allowed;
/*  25 */   private SubNumberRejectAction subNumberAction = SubNumberRejectAction.main;
/*     */   private String allowedSubNumbers;
/*     */   private String subNumberText;
/*  28 */   private ATIMode atiMode = ATIMode.disabled;
/*     */   
/*     */   private String atiText;
/*     */   
/*     */   private Set<RegionEntity> regions;
/*     */   private int tps;
/*     */   private int sessionCount;
/*     */   
/*     */   @Id
/*     */   @Basic
/*     */   @Column(name = "USSD_NUMBER", nullable = false, length = 200)
/*     */   public String getUssdNumber() {
/*  40 */     return this.ussdNumber;
/*     */   }
/*     */   
/*     */   public void setUssdNumber(String ussdNumber) {
/*  44 */     this.ussdNumber = ussdNumber;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "NAME", nullable = false, length = 50)
/*     */   public String getName() {
/*  50 */     return this.name;
/*     */   }
/*     */   
/*     */   public void setName(String name) {
/*  54 */     this.name = name;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "TPS_MAX", nullable = false, precision = 0)
/*     */   public int getTpsMax() {
/*  60 */     return this.tpsMax;
/*     */   }
/*     */   
/*     */   public void setTpsMax(int tpsMax) {
/*  64 */     this.tpsMax = tpsMax;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "ENABLED", nullable = false, precision = 0)
/*     */   public boolean isEnabled() {
/*  70 */     return this.enabled;
/*     */   }
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  74 */     this.enabled = enabled;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "CREATE_TIME", nullable = true)
/*     */   public Timestamp getCreateTime() {
/*  80 */     return this.createTime;
/*     */   }
/*     */   
/*     */   public void setCreateTime(Timestamp createTime) {
/*  84 */     this.createTime = createTime;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "UPDATE_TIME", nullable = true)
/*     */   public Timestamp getUpdateTime() {
/*  90 */     return this.updateTime;
/*     */   }
/*     */   
/*     */   public void setUpdateTime(Timestamp updateTime) {
/*  94 */     this.updateTime = updateTime;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "VLR", nullable = false, precision = 0)
/*     */   public boolean isVlr() {
/* 100 */     return this.vlr;
/*     */   }
/*     */   
/*     */   public void setVlr(boolean vlr) {
/* 104 */     this.vlr = vlr;
/*     */   }
/*     */   
/*     */   @Enumerated(EnumType.STRING)
/*     */   @Column(name = "SUB_NUMBER_MODE", nullable = true, length = 10)
/*     */   public SubNumberMode getSubNumberMode() {
/* 110 */     return this.subNumberMode;
/*     */   }
/*     */   
/*     */   public void setSubNumberMode(SubNumberMode subNumberMode) {
/* 114 */     this.subNumberMode = subNumberMode;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "SUB_NUMBER_TEXT", nullable = true, length = 200)
/*     */   public String getSubNumberText() {
/* 120 */     return this.subNumberText;
/*     */   }
/*     */   
/*     */   public void setSubNumberText(String subNumberText) {
/* 124 */     this.subNumberText = subNumberText;
/*     */   }
/*     */   
/*     */   @Enumerated(EnumType.STRING)
/*     */   @Column(name = "ATI_MODE", nullable = true, length = 10)
/*     */   public ATIMode getAtiMode() {
/* 130 */     return this.atiMode;
/*     */   }
/*     */   
/*     */   public void setAtiMode(ATIMode atiMode) {
/* 134 */     this.atiMode = atiMode;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "ATI_TEXT", nullable = true, length = 200)
/*     */   public String getAtiText() {
/* 140 */     return this.atiText;
/*     */   }
/*     */   
/*     */   public void setAtiText(String atiText) {
/* 144 */     this.atiText = atiText;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 149 */     if (this == o) return true; 
/* 150 */     if (!(o instanceof UssdNumberEntity)) return false; 
/* 151 */     UssdNumberEntity that = (UssdNumberEntity)o;
/* 152 */     return (getTpsMax() == that.getTpsMax() && 
/* 153 */       isEnabled() == that.isEnabled() && 
/* 154 */       isVlr() == that.isVlr() && 
/* 155 */       getTps() == that.getTps() && 
/* 156 */       getSessionCount() == that.getSessionCount() && 
/* 157 */       Objects.equals(getUssdNumber(), that.getUssdNumber()) && 
/* 158 */       Objects.equals(getName(), that.getName()) && 
/* 159 */       Objects.equals(getCreateTime(), that.getCreateTime()) && 
/* 160 */       Objects.equals(getUpdateTime(), that.getUpdateTime()) && 
/* 161 */       getSubNumberMode() == that.getSubNumberMode() && 
/* 162 */       getSubNumberAction() == that.getSubNumberAction() && 
/* 163 */       Objects.equals(getAllowedSubNumbers(), that.getAllowedSubNumbers()) && 
/* 164 */       Objects.equals(getSubNumberText(), that.getSubNumberText()) && 
/* 165 */       getAtiMode() == that.getAtiMode() && 
/* 166 */       Objects.equals(getAtiText(), that.getAtiText()));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 171 */     return Objects.hash(new Object[] { getUssdNumber(), getName(), Integer.valueOf(getTpsMax()), Boolean.valueOf(isEnabled()), getCreateTime(), getUpdateTime(), Boolean.valueOf(isVlr()), getSubNumberMode(), getSubNumberAction(), getAllowedSubNumbers(), getSubNumberText(), getAtiMode(), getAtiText(), Integer.valueOf(getTps()), Integer.valueOf(getSessionCount()) });
/*     */   }
/*     */ 
/*     */   
/*     */   @Transient
/*     */   public String getId() {
/* 177 */     return getUssdNumber();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToMany(fetch = FetchType.EAGER)
/*     */   @JoinTable(name = "REGION_USSD_NUMBER", joinColumns = {@JoinColumn(name = "USSD_NUMBER", referencedColumnName = "USSD_NUMBER")}, inverseJoinColumns = {@JoinColumn(name = "REGION_NAME", referencedColumnName = "NAME")})
/*     */   public Set<RegionEntity> getRegions() {
/* 187 */     return this.regions;
/*     */   }
/*     */   
/*     */   public void setRegions(Set<RegionEntity> regions) {
/* 191 */     this.regions = regions;
/*     */   }
/*     */   
/*     */   @Enumerated(EnumType.STRING)
/*     */   @Column(name = "SUB_NUMBER_ACTION", nullable = true, length = 10)
/*     */   public SubNumberRejectAction getSubNumberAction() {
/* 197 */     return this.subNumberAction;
/*     */   }
/*     */   
/*     */   public void setSubNumberAction(SubNumberRejectAction subNumberAction) {
/* 201 */     this.subNumberAction = subNumberAction;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "SUB_NUMBER_ALLOWED", nullable = true, length = 300)
/*     */   public String getAllowedSubNumbers() {
/* 207 */     return this.allowedSubNumbers;
/*     */   }
/*     */   
/*     */   public void setAllowedSubNumbers(String allowedSubNumbers) {
/* 211 */     this.allowedSubNumbers = allowedSubNumbers;
/*     */   }
/*     */   
/*     */   @Transient
/*     */   public int getTps() {
/* 216 */     return this.tps;
/*     */   }
/*     */   
/*     */   public void setTps(int tps) {
/* 220 */     this.tps = tps;
/*     */   }
/*     */   
/*     */   @Transient
/*     */   public int getSessionCount() {
/* 225 */     return this.sessionCount;
/*     */   }
/*     */   
/*     */   public void setSessionCount(int sessionCount) {
/* 229 */     this.sessionCount = sessionCount;
/*     */   }
/*     */   
/*     */   public enum SubNumberMode implements Titled {
/* 233 */     allowed("Allow all"),
/* 234 */     defined("Only defined numbers"),
/* 235 */     rejected("Reject all");
/*     */     
/*     */     private final String title;
/*     */     
/*     */     public String getTitle() {
/* 240 */       return this.title;
/*     */     }
/*     */     
/*     */     SubNumberMode(String title) {
/* 244 */       this.title = title;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SubNumberRejectAction implements Titled {
/* 249 */     message("Replay with message"),
/* 250 */     error("Send MMI error"),
/* 251 */     main("Redirect to main");
/*     */     
/*     */     private final String title;
/*     */     
/*     */     public String getTitle() {
/* 256 */       return this.title;
/*     */     }
/*     */     
/*     */     SubNumberRejectAction(String title) {
/* 260 */       this.title = title;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum ATIMode implements Titled {
/* 265 */     disabled("Disabled"),
/* 266 */     enabled("Enabled"),
/* 267 */     restricted("Restricted");
/*     */     
/*     */     private final String title;
/*     */     
/*     */     public String getTitle() {
/* 272 */       return this.title;
/*     */     }
/*     */     
/*     */     ATIMode(String title) {
/* 276 */       this.title = title;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 283 */     return "UssdNumberEntity{ussdNumber='" + this.ussdNumber + '\'' + ", name='" + this.name + '\'' + ", tpsMax=" + this.tpsMax + ", enabled=" + this.enabled + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", vlr=" + this.vlr + ", subNumberMode=" + this.subNumberMode + ", subNumberAction=" + this.subNumberAction + ", allowedSubNumbers='" + this.allowedSubNumbers + '\'' + ", subNumberText='" + this.subNumberText + '\'' + ", atiMode=" + this.atiMode + ", atiText='" + this.atiText + '\'' + ", regions=" + this.regions + ", tps=" + this.tps + ", sessionCount=" + this.sessionCount + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\UssdNumberEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */