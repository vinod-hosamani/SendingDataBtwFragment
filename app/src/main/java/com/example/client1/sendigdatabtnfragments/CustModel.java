package com.example.client1.sendigdatabtnfragments;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by client1 on 1/4/2018.
 */

public class CustModel implements Parcelable {
    public String firstName;
    public String lastName;

    protected CustModel(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
    }

    public CustModel() {
    }

    public static final Creator<CustModel> CREATOR = new Creator<CustModel>() {
        @Override
        public CustModel createFromParcel(Parcel in) {
            return new CustModel(in);
        }

        @Override
        public CustModel[] newArray(int size) {
            return new CustModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
    }
}
