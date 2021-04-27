
package com.example.assignment1;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Properties {

    @SerializedName("bar")
    private Bar mBar;
    @SerializedName("baz")
    private Baz mBaz;
    @SerializedName("foo")
    private Foo mFoo;

    public Bar getBar() {
        return mBar;
    }

    public Baz getBaz() {
        return mBaz;
    }

    public Foo getFoo() {
        return mFoo;
    }

    public static class Builder {

        private Bar mBar;
        private Baz mBaz;
        private Foo mFoo;

        public Properties.Builder withBar(Bar bar) {
            mBar = bar;
            return this;
        }

        public Properties.Builder withBaz(Baz baz) {
            mBaz = baz;
            return this;
        }

        public Properties.Builder withFoo(Foo foo) {
            mFoo = foo;
            return this;
        }

        public Properties build() {
            Properties properties = new Properties();
            properties.mBar = mBar;
            properties.mBaz = mBaz;
            properties.mFoo = mFoo;
            return properties;
        }

    }

}
