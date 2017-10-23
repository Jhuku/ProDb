
package com.example.shuvamghosh.prodb.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class GenomicLocation {

    @SerializedName("chromosome")
    private String mChromosome;
    @SerializedName("end")
    private Long mEnd;
    @SerializedName("exon")
    private List<Exon> mExon;
    @SerializedName("reverseStrand")
    private Boolean mReverseStrand;
    @SerializedName("start")
    private Long mStart;

    public String getChromosome() {
        return mChromosome;
    }

    public void setChromosome(String chromosome) {
        mChromosome = chromosome;
    }

    public Long getEnd() {
        return mEnd;
    }

    public void setEnd(Long end) {
        mEnd = end;
    }

    public List<Exon> getExon() {
        return mExon;
    }

    public void setExon(List<Exon> exon) {
        mExon = exon;
    }

    public Boolean getReverseStrand() {
        return mReverseStrand;
    }

    public void setReverseStrand(Boolean reverseStrand) {
        mReverseStrand = reverseStrand;
    }

    public Long getStart() {
        return mStart;
    }

    public void setStart(Long start) {
        mStart = start;
    }

}
