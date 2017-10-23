
package com.example.shuvamghosh.prodb.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class RespModel implements Parcelable {

    @SerializedName("accession")
    private String mAccession;
    @SerializedName("gene")
    private List<Gene> mGene;
    @SerializedName("gnCoordinate")
    private List<GnCoordinate> mGnCoordinate;
    @SerializedName("name")
    private String mName;
    @SerializedName("protein")
    private Protein mProtein;
    @SerializedName("sequence")
    private String mSequence;
    @SerializedName("taxid")
    private Long mTaxid;

    protected RespModel(Parcel in) {
        mAccession = in.readString();
        mName = in.readString();
        mSequence = in.readString();
        if (in.readByte() == 0) {
            mTaxid = null;
        } else {
            mTaxid = in.readLong();
        }
    }

    public static final Creator<RespModel> CREATOR = new Creator<RespModel>() {
        @Override
        public RespModel createFromParcel(Parcel in) {
            return new RespModel(in);
        }

        @Override
        public RespModel[] newArray(int size) {
            return new RespModel[size];
        }
    };

    public String getAccession() {
        return mAccession;
    }

    public void setAccession(String accession) {
        mAccession = accession;
    }

    public List<Gene> getGene() {
        return mGene;
    }

    public void setGene(List<Gene> gene) {
        mGene = gene;
    }

    public List<GnCoordinate> getGnCoordinate() {
        return mGnCoordinate;
    }

    public void setGnCoordinate(List<GnCoordinate> gnCoordinate) {
        mGnCoordinate = gnCoordinate;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Protein getProtein() {
        return mProtein;
    }

    public void setProtein(Protein protein) {
        mProtein = protein;
    }

    public String getSequence() {
        return mSequence;
    }

    public void setSequence(String sequence) {
        mSequence = sequence;
    }

    public Long getTaxid() {
        return mTaxid;
    }

    public void setTaxid(Long taxid) {
        mTaxid = taxid;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mAccession);
        parcel.writeString(mName);
        parcel.writeString(mSequence);
        if (mTaxid == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(mTaxid);
        }
    }
}
