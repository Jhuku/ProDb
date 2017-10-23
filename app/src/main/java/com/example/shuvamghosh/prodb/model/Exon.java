
package com.example.shuvamghosh.prodb.model;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Exon {

    @SerializedName("genomeLocation")
    private GenomeLocation mGenomeLocation;
    @SerializedName("id")
    private String mId;
    @SerializedName("proteinLocation")
    private ProteinLocation mProteinLocation;

    public GenomeLocation getGenomeLocation() {
        return mGenomeLocation;
    }

    public void setGenomeLocation(GenomeLocation genomeLocation) {
        mGenomeLocation = genomeLocation;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public ProteinLocation getProteinLocation() {
        return mProteinLocation;
    }

    public void setProteinLocation(ProteinLocation proteinLocation) {
        mProteinLocation = proteinLocation;
    }

}
