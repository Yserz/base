package de.yserz.base.data;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity<PK extends Serializable & Comparable> implements Comparable<BaseEntity<PK>> {


    private PK id;
    private Date created;

    private Date lastModified;

    protected BaseEntity() {
    }

    protected BaseEntity(PK id, Date created, Date lastModified) {
        this.setId(id);
        this.created = created;
        this.lastModified = lastModified;
    }

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    protected void setCreated(Date created) {
        this.created = created;
    }

    protected void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }


    public void prePersist() {
        Date now = new Date();
        this.created = now;
        this.lastModified = now;
    }

    public void preUpdate() {
        this.lastModified = new Date();
    }

    public abstract Comparable comparableAttribute();

    @Override

    public int compareTo(BaseEntity be) {
        if (be.comparableAttribute() == null && this.comparableAttribute() == null) {
            return 0;
        }
        if (this.comparableAttribute() == null) {
            return 1;
        }
        if (be.comparableAttribute() == null) {
            return -1;
        }
        return this.comparableAttribute().compareTo(be.comparableAttribute());
    }

}
