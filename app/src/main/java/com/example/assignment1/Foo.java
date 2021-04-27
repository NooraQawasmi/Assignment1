
package com.example.assignment1;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Foo {

    @SerializedName("type")
    private String mType;

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mType;

        public Foo.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Foo build() {
            Foo foo = new Foo();
            foo.mType = mType;
            return foo;
        }

    }

}
