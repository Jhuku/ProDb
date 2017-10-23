
package com.example.shuvamghosh.prodb.model;


import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ProteinLocation {

    @SerializedName("begin")
    private Begin mBegin;
    @SerializedName("end")
    private End mEnd;
    @SerializedName("position")
    private Object mPosition;

    public Begin getBegin() {
        return mBegin;
    }

    public void setBegin(Begin begin) {
        mBegin = begin;
    }

    public End getEnd() {
        return mEnd;
    }

    public void setEnd(End end) {
        mEnd = end;
    }

    public Object getPosition() {
        return mPosition;
    }

    public void setPosition(Object position) {
        mPosition = position;
    }

}
