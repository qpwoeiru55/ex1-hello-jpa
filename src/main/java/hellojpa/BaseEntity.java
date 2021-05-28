package hellojpa;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "CREATED_BY")
    private String createBy;
    @Column(name = "MODIFIED_BY")
    private String lasModifiedBy;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getLasModifiedBy() {
        return lasModifiedBy;
    }

    public void setLasModifiedBy(String lasModifiedBy) {
        this.lasModifiedBy = lasModifiedBy;
    }
}
