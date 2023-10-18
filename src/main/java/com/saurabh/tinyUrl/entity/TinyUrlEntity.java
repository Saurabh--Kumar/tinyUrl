package com.saurabh.tinyUrl.entity;

import com.saurabh.tinyUrl.domain.entry.TinyUrlEntry;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "url_mapping")
@Getter
@Setter
@NoArgsConstructor
public class TinyUrlEntity<DateTime> {

    @Id
    private String tinyUrl;

    @Column(nullable = false)
    private String fullUrl;

    @Column(nullable = false)
    private Date expiryDate;

    @CreationTimestamp
    private Date createdOn;

    @UpdateTimestamp
    private Date lastModifiedOn;

    @Version
    private int version;


    public TinyUrlEntry transformToTinyUrlEntry(){
        TinyUrlEntry tinyUrlEntry = new TinyUrlEntry();
        tinyUrlEntry.setTinyUrl(this.tinyUrl);
        tinyUrlEntry.setFullUrl(this.fullUrl);
        tinyUrlEntry.setExpiryDate(this.expiryDate);

        return tinyUrlEntry;
    }

}
