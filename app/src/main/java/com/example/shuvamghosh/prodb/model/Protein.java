
package com.example.shuvamghosh.prodb.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public  class Protein implements Parcelable{

    @SerializedName("alternativeName")
    private List<Object> mAlternativeName;
    @SerializedName("recommendedName")
    private Object mRecommendedName;
    @SerializedName("submittedName")
    private List<SubmittedName> mSubmittedName;

    protected Protein(Parcel in) {
    }

    public static final Creator<Protein> CREATOR = new Creator<Protein>() {
        @Override
        public Protein createFromParcel(Parcel in) {
            return new Protein(in);
        }

        @Override
        public Protein[] newArray(int size) {
            return new Protein[size];
        }
    };

    public List<Object> getAlternativeName() {
        return mAlternativeName;
    }

    public void setAlternativeName(List<Object> alternativeName) {
        mAlternativeName = alternativeName;
    }

    public Object getRecommendedName() {
        return mRecommendedName;
    }

    public void setRecommendedName(Object recommendedName) {
        mRecommendedName = recommendedName;
    }

    public List<SubmittedName> getSubmittedName() {
        return mSubmittedName;
    }

    public void setSubmittedName(List<SubmittedName> submittedName) {
        mSubmittedName = submittedName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
