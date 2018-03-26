package com.masson.alex.jsonplaceholder.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by alex on 24/03/2018.
 */

public class Compagny implements Serializable, Parcelable{
    private String name;
    private String catchPhrase;
    private String bs;


    public Compagny() {

    }

    public Compagny(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    protected Compagny(Parcel in) {
        name = in.readString();
        catchPhrase = in.readString();
        bs = in.readString();
    }

    public static final Creator<Compagny> CREATOR = new Creator<Compagny>() {
        @Override
        public Compagny createFromParcel(Parcel in) {
            return new Compagny(in);
        }

        @Override
        public Compagny[] newArray(int size) {
            return new Compagny[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(catchPhrase);
        parcel.writeString(bs);
    }
}
