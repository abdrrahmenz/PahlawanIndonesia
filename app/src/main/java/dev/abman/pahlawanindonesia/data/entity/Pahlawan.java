package dev.abman.pahlawanindonesia.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by adul on 03/10/17.
 */

public class Pahlawan implements Parcelable{

    private String nama, jabatan, keterangan, lahir, wafat, foto;

    public Pahlawan() {
    }

    protected Pahlawan(Parcel in) {
        nama = in.readString();
        jabatan = in.readString();
        keterangan = in.readString();
        lahir = in.readString();
        wafat = in.readString();
        foto = in.readString();
    }

    public static final Creator<Pahlawan> CREATOR = new Creator<Pahlawan>() {
        @Override
        public Pahlawan createFromParcel(Parcel in) {
            return new Pahlawan(in);
        }

        @Override
        public Pahlawan[] newArray(int size) {
            return new Pahlawan[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public String getWafat() {
        return wafat;
    }

    public void setWafat(String wafat) {
        this.wafat = wafat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(jabatan);
        parcel.writeString(keterangan);
        parcel.writeString(lahir);
        parcel.writeString(wafat);
        parcel.writeString(foto);
    }
}
