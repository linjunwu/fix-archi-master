package uk.ivanc.archi.testplugins;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by linjunwu_91 on 2015/10/16.
 */
public class TestParcelablePlugins implements Parcelable {
    private int a;
    private float b;
    private long c;
    private String d;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.a);
        dest.writeFloat(this.b);
        dest.writeLong(this.c);
        dest.writeString(this.d);
    }

    public TestParcelablePlugins() {
    }

    protected TestParcelablePlugins(Parcel in) {
        this.a = in.readInt();
        this.b = in.readFloat();
        this.c = in.readLong();
        this.d = in.readString();
    }

    public static final Parcelable.Creator<TestParcelablePlugins> CREATOR = new Parcelable.Creator<TestParcelablePlugins>() {
        public TestParcelablePlugins createFromParcel(Parcel source) {
            return new TestParcelablePlugins(source);
        }

        public TestParcelablePlugins[] newArray(int size) {
            return new TestParcelablePlugins[size];
        }
    };
}
