package com.saurabh.tinyUrl.domain.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TinyUrlEntry {
    private String tinyUrl;
    private String fullUrl;
    private Date expiryDate;
}
