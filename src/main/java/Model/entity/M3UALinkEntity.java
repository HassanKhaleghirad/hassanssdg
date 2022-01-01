/*     */ package Model.entity;
/*     */ 
/*     */ import ir.markazandroid.greengate.model.core.NumericEntity;
/*     */ import ir.markazandroid.greengate.model.link.LinkConnectionStatus;
/*     */ import java.io.Serializable;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Objects;
/*     */ import javax.persistence.Basic;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.EnumType;
/*     */ import javax.persistence.Enumerated;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.Transient;
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "M3UA_LINK")
/*     */ public class M3UALinkEntity extends NumericEntity implements Serializable {
/*     */   @Transient
/*     */   private static final long serialVersionUID = 1L;
/*     */   private String serverAddress;
/*     */   private String serverPort;
/*     */   private String clientAddress;
/*     */   private String clientPort;
/*     */   private Boolean enabled;
/*  26 */   private LinkConnectionStatus status = LinkConnectionStatus.idle;
/*     */   
/*     */   private String statusText;
/*     */   
/*     */   private Timestamp statusTime;
/*     */   
/*     */   private Timestamp createTime;
/*     */   private Timestamp updateTime;
/*     */   private String nodeName;
/*     */   private Integer lipcIndex;
/*     */   private Integer spc;
/*     */   private Integer dpc;
/*     */   private String stpGlobalTitle;
/*     */   private String ussdcGlobalTitle;
/*     */   private int tps;
/*     */   
/*     */   @Basic
/*     */   @Column(name = "NODE_NAME", nullable = false, length = 100)
/*     */   public void setNodeName(String nodeName) {
/*  45 */     this.nodeName = nodeName;
/*     */   }
/*     */   
/*     */   public String getNodeName() {
/*  49 */     return this.nodeName;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "SERVER_ADDRESS", nullable = false, length = 200)
/*     */   public String getServerAddress() {
/*  55 */     return this.serverAddress;
/*     */   }
/*     */   
/*     */   public void setServerAddress(String serverAddress) {
/*  59 */     this.serverAddress = serverAddress;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "SERVER_PORT", nullable = false, length = 5)
/*     */   public String getServerPort() {
/*  65 */     return this.serverPort;
/*     */   }
/*     */   
/*     */   public void setServerPort(String serverPort) {
/*  69 */     this.serverPort = serverPort;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "CLIENT_ADDRESS", nullable = false, length = 200)
/*     */   public String getClientAddress() {
/*  75 */     return this.clientAddress;
/*     */   }
/*     */   
/*     */   public void setClientAddress(String clientAddress) {
/*  79 */     this.clientAddress = clientAddress;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "CLIENT_PORT", nullable = false, length = 5)
/*     */   public String getClientPort() {
/*  85 */     return this.clientPort;
/*     */   }
/*     */   
/*     */   public void setClientPort(String clientPort) {
/*  89 */     this.clientPort = clientPort;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "ENABLED", nullable = true, precision = 0)
/*     */   public Boolean getEnabled() {
/*  95 */     return this.enabled;
/*     */   }
/*     */   
/*     */   public void setEnabled(Boolean enabled) {
/*  99 */     this.enabled = enabled;
/*     */   }
/*     */   
/*     */   @Enumerated(EnumType.STRING)
/*     */   @Column(name = "STATUS", nullable = true)
/*     */   public LinkConnectionStatus getStatus() {
/* 105 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(LinkConnectionStatus status) {
/* 109 */     this.status = status;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "STATUS_TEXT", nullable = true, length = 200)
/*     */   public String getStatusText() {
/* 115 */     return this.statusText;
/*     */   }
/*     */   
/*     */   public void setStatusText(String statusText) {
/* 119 */     this.statusText = statusText;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "STATUS_TIME", nullable = true)
/*     */   public Timestamp getStatusTime() {
/* 125 */     return this.statusTime;
/*     */   }
/*     */   
/*     */   public void setStatusTime(Timestamp statusTime) {
/* 129 */     this.statusTime = statusTime;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "CREATE_TIME", nullable = true)
/*     */   public Timestamp getCreateTime() {
/* 135 */     return this.createTime;
/*     */   }
/*     */   
/*     */   public void setCreateTime(Timestamp createTime) {
/* 139 */     this.createTime = createTime;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "UPDATE_TIME", nullable = true)
/*     */   public Timestamp getUpdateTime() {
/* 145 */     return this.updateTime;
/*     */   }
/*     */   
/*     */   public void setUpdateTime(Timestamp updateTime) {
/* 149 */     this.updateTime = updateTime;
/*     */   }
/*     */ 
/*     */   
/*     */   @Basic
/*     */   @Column(name = "LIPC_INDEX", nullable = true)
/*     */   public Integer getLipcIndex() {
/* 156 */     return this.lipcIndex;
/*     */   }
/*     */   
/*     */   public void setLipcIndex(Integer lipcIndex) {
/* 160 */     this.lipcIndex = lipcIndex;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "SPC", nullable = true)
/*     */   public Integer getSpc() {
/* 166 */     return this.spc;
/*     */   }
/*     */   
/*     */   public void setSpc(Integer spc) {
/* 170 */     this.spc = spc;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "DPC", nullable = true)
/*     */   public Integer getDpc() {
/* 176 */     return this.dpc;
/*     */   }
/*     */   
/*     */   public void setDpc(Integer dpc) {
/* 180 */     this.dpc = dpc;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "STP_GLOBAL_ADDRESS", nullable = true)
/*     */   public String getStpGlobalTitle() {
/* 186 */     return this.stpGlobalTitle;
/*     */   }
/*     */   
/*     */   public void setStpGlobalTitle(String stpGlobalTitle) {
/* 190 */     this.stpGlobalTitle = stpGlobalTitle;
/*     */   }
/*     */   
/*     */   @Basic
/*     */   @Column(name = "USSDC_GLOBAL_ADDRESS", nullable = true)
/*     */   public String getUssdcGlobalTitle() {
/* 196 */     return this.ussdcGlobalTitle;
/*     */   }
/*     */   
/*     */   public void setUssdcGlobalTitle(String ussdcGlobalTitle) {
/* 200 */     this.ussdcGlobalTitle = ussdcGlobalTitle;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 205 */     if (this == o) return true; 
/* 206 */     if (!(o instanceof M3UALinkEntity)) return false; 
/* 207 */     if (!super.equals(o)) return false; 
/* 208 */     M3UALinkEntity that = (M3UALinkEntity)o;
/* 209 */     return (getTps() == that.getTps() && 
/* 210 */       Objects.equals(getServerAddress(), that.getServerAddress()) && 
/* 211 */       Objects.equals(getServerPort(), that.getServerPort()) && 
/* 212 */       Objects.equals(getClientAddress(), that.getClientAddress()) && 
/* 213 */       Objects.equals(getClientPort(), that.getClientPort()) && 
/* 214 */       Objects.equals(getEnabled(), that.getEnabled()) && 
/* 215 */       getStatus() == that.getStatus() && 
/* 216 */       Objects.equals(getStatusText(), that.getStatusText()) && 
/* 217 */       Objects.equals(getStatusTime(), that.getStatusTime()) && 
/* 218 */       Objects.equals(getCreateTime(), that.getCreateTime()) && 
/* 219 */       Objects.equals(getUpdateTime(), that.getUpdateTime()));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 224 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), getServerAddress(), getServerPort(), getClientAddress(), getClientPort(), getEnabled(), getStatus(), getStatusText(), getStatusTime(), getCreateTime(), getUpdateTime(), Integer.valueOf(getTps()) });
/*     */   }
/*     */   
/*     */   @Transient
/*     */   public int getTps() {
/* 229 */     return this.tps;
/*     */   }
/*     */   
/*     */   public void setTps(int tps) {
/* 233 */     this.tps = tps;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 238 */     return "M3UALinkEntity{serverAddress='" + this.serverAddress + '\'' + ", serverPort='" + this.serverPort + '\'' + ", clientAddress='" + this.clientAddress + '\'' + ", clientPort='" + this.clientPort + '\'' + ", enabled=" + this.enabled + ", status=" + this.status + ", statusText='" + this.statusText + '\'' + ", statusTime=" + this.statusTime + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", nodeName='" + this.nodeName + '\'' + ", lipcIndex=" + this.lipcIndex + ", spc=" + this.spc + ", dpc=" + this.dpc + ", stpGlobalTitle='" + this.stpGlobalTitle + '\'' + ", ussdcGlobalTitle='" + this.ussdcGlobalTitle + '\'' + ", tps=" + this.tps + "} " + super
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 256 */       .toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\hassan\Desktop\Desktop\Desktop\repository\ir\markazandroid\greengate2\model-api\1.0-SNAPSHOT\model-api-1.0-SNAPSHOT.jar!\ir\markazandroid\greengate\model\entity\M3UALinkEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */