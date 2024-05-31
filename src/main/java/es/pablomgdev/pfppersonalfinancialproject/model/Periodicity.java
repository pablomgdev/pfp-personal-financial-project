package es.pablomgdev.pfppersonalfinancialproject.model;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "periodicities")
public class Periodicity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "operation_internal_id")
    private Integer operationInternalId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "deleted_date")
    private Date deletedDate;

    @Column(name = "user_id")
    private UUID userId;

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public Integer getOperationInternalId() {
      return operationInternalId;
    }

    public void setOperationInternalId(Integer operationInternalId) {
      this.operationInternalId = operationInternalId;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Date getCreatedDate() {
      return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
      return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
      this.updatedDate = updatedDate;
    }

    public Boolean getIsDeleted() {
      return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
      this.isDeleted = isDeleted;
    }

    public Date getDeletedDate() {
      return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
      this.deletedDate = deletedDate;
    }

    public UUID getUserId() {
      return userId;
    }

    public void setUserId(UUID userId) {
      this.userId = userId;
    }
}
