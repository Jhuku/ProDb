
package com.example.shuvamghosh.prodb.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SubmittedName {

    @SerializedName("fullName")
    private String mFullName;
    @SerializedName("shortName")
    private List<Object> mShortName;

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public List<Object> getShortName() {
        return mShortName;
    }

    public void setShortName(List<Object> shortName) {
        mShortName = shortName;
    }

}
