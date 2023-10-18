package com.saurabh.tinyUrl.domain.response;

import lombok.Data;

@Data
public class ShrinkUrlResponse {
    StatusResponse status;
    String tinyUrl;
}
