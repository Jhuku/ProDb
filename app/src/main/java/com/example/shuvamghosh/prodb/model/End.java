
package com.example.shuvamghosh.prodb.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class End {

    @SerializedName("position")
    private Long mPosition;
    @SerializedName("status")
    private String mStatus;

    public Long getPosition() {
        return mPosition;
    }

    public void setPosition(Long position) {
        mPosition = position;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
