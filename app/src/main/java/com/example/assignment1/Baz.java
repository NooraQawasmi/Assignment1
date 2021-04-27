
package com.example.assignment1;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Baz {

    @SerializedName("type")
    private String mType;

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mType;

        public Baz.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Baz build() {
            Baz baz = new Baz();
            baz.mType = mType;
            return baz;
        }

    }

}
