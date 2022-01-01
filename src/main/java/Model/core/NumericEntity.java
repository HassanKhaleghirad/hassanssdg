 package Model.core;

 import java.util.Objects;
 import javax.persistence.Column;
 import javax.persistence.Id;
 import javax.persistence.MappedSuperclass;

 @MappedSuperclass
 public abstract class NumericEntity
   implements BaseEntity<Long>
 {
   private long id;

   public void setId(long id) {
     this.id = id;
   }


   @Id
   @Column(name = "ID", nullable = false, precision = 0)
   public Long getId() {
     return Long.valueOf(this.id);
   }


   public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof NumericEntity)) return false;
     NumericEntity that = (NumericEntity)o;
     return Objects.equals(getId(), that.getId());
   }


   public int hashCode() {
     return Objects.hash(new Object[] { getId() });
   }
 }
