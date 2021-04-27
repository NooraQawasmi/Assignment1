
package com.example.assignment1;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Ass {

    @SerializedName("properties")
    private Properties mProperties;
    @SerializedName("type")
    private String mType;

    public Properties getProperties() {
        return mProperties;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private Properties mProperties;
        private String mType;

        public Ass.Builder withProperties(Properties properties) {
            mProperties = properties;
            return this;
        }

        public Ass.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Ass build() {
            Ass ass = new Ass();
            ass.mProperties = mProperties;
            ass.mType = mType;
            return ass;
        }

    }

}
