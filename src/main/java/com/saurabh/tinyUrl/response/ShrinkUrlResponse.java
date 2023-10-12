package com.saurabh.tinyUrl.response;

import lombok.Data;

@Data
public class ShrinkUrlResponse {
    StatusResponse status;
    String tinyUrl;
}
