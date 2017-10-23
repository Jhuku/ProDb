
package com.example.shuvamghosh.prodb.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class GnCoordinate {

    @SerializedName("ensemblGeneId")
    private String mEnsemblGeneId;
    @SerializedName("ensemblTranscriptId")
    private String mEnsemblTranscriptId;
    @SerializedName("ensemblTranslationId")
    private String mEnsemblTranslationId;
    @SerializedName("feature")
    private List<Object> mFeature;
    @SerializedName("genomicLocation")
    private GenomicLocation mGenomicLocation;

    public String getEnsemblGeneId() {
        return mEnsemblGeneId;
    }

    public void setEnsemblGeneId(String ensemblGeneId) {
        mEnsemblGeneId = ensemblGeneId;
    }

    public String getEnsemblTranscriptId() {
        return mEnsemblTranscriptId;
    }

    public void setEnsemblTranscriptId(String ensemblTranscriptId) {
        mEnsemblTranscriptId = ensemblTranscriptId;
    }

    public String getEnsemblTranslationId() {
        return mEnsemblTranslationId;
    }

    public void setEnsemblTranslationId(String ensemblTranslationId) {
        mEnsemblTranslationId = ensemblTranslationId;
    }

    public List<Object> getFeature() {
        return mFeature;
    }

    public void setFeature(List<Object> feature) {
        mFeature = feature;
    }

    public GenomicLocation getGenomicLocation() {
        return mGenomicLocation;
    }

    public void setGenomicLocation(GenomicLocation genomicLocation) {
        mGenomicLocation = genomicLocation;
    }

}
