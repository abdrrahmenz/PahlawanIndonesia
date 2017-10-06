package dev.abman.pahlawanindonesia.data;

import java.util.ArrayList;

import dev.abman.pahlawanindonesia.data.entity.Pahlawan;

/**
 * Created by abman on 03/10/17.
 */

public class PahlawanData {
    public static String[][] data = new String[][]{
            {"Adam Malik","Jurnalis dan aktivis kemerdekaan","Adam Malik adalah mantan Menteri Indonesia pada beberapa Departemen, antara lain ia pernah menjabat menjadi Menteri Luar Negeri. Ia juga pernah menjadi Wakil Presiden Indonesia yang ketiga. Adam Malik ditetapkan sebagai salah seorang Pahlawan Nasional Indonesia pada tanggal 6 November 1998 berdasarkan Keppres Nomor 107/TK/1998."
                    ,"22 Juli 1917, Sumatera Utara","5 September 1984, Bandung","https://upload.wikimedia.org/wikipedia/commons/9/9f/Adam_Malik_Batubara_Official_Portrait.jpg"},
            {"Agus Salim","Pejuang Kemerdekaan Indonesia","Agus Salim adalah seorang pejuang kemerdekaan Indonesia. Haji Agus Salim ditetapkan sebagai salah satu Pahlawan Nasional Indonesia pada tanggal 27 Desember 1961 melalui Keppres nomor 657 tahun 1961."
                    ,"8 Oktober 1884, Sumatera Barat","4 November 1954, Jakarta","https://upload.wikimedia.org/wikipedia/commons/5/57/Agus_Salim.jpg"},
            {"R.A Kartini","Tokoh Hak Asasi Perempuan Indonesia","R.A Kartini adalah seorang tokoh Jawa dan Pahlawan Nasional Indonesia. Kartini dikenal sebagai pelopor kebangkitan perempuan pribumi."
                    ,"21 April 1879, Jepara","17 September 1904, Rembang","https://upload.wikimedia.org/wikipedia/commons/2/23/COLLECTIE_TROPENMUSEUM_Portret_van_Raden_Ajeng_Kartini_TMnr_10018776.jpg"},
            {"Mohammad Natsir","Sarjana Islam dan Politisi","Mohammad Natsir adalah seorang ulama, politisi, dan pejuang kemerdekaan Indonesia. Ia merupakan pendiri sekaligus pemimpin partai politik Masyumi, dan tokoh Islam terkemuka Indonesia. Di dalam negeri, ia pernah menjabat menteri dan perdana menteri Indonesia."
                    ,"17 Juli 1908, Sumatera Barat","6 Februari 1993, Jakarta","https://upload.wikimedia.org/wikipedia/commons/7/7a/Natsir_Harian_Umum_26_October_1950.jpg"},
            {"Sudirman","Perwira Tinggi Indonesia","Sudirman adalah seorang perwira tinggi Indonesia pada masa Revolusi Nasional Indonesia. Menjadi panglima besar Tentara Nasional Indonesia pertama, ia secara luas terus dihormati di Indonesia. Terlahir dari pasangan rakyat biasa di Purbalingga, Hindia Belanda, Soedirman diadopsi oleh pamannya yang seorang priyayi. "
                    ,"24 Januari 1916, Purbalingga","29 Januari 1950, Magelang","https://upload.wikimedia.org/wikipedia/commons/e/e7/Sudirman.jpg"},
            {"Oerip Soemohardjo","Jenderal TNI","Oerip Soemohardjo adalah seorang jenderal dan kepala staf umum Tentara Nasional Indonesia pertama pada masa Revolusi Nasional Indonesia. Lahir di Purworejo, Hindia Belanda, Oerip kecil adalah anak nakal yang sudah memperlihatkan kemampuan memimpin sejak usia dini."
                    ,"22 Februari 1893, Purworejo","17 November 1948, Yogyakarta","https://upload.wikimedia.org/wikipedia/commons/e/ea/Oerip_Soemohardjo_5_November_1947_KR.JPG"},
            {"Adnan Kapau Gani","Dokter dan Politisi Indonesia","Sejak remaja Gani aktif dalam kegiatan politik dan organisasi sosial. Pada era 1920-an, ia giat di berbagai organisasi kedaerahan seperti Jong Sumatranen Bond dan Jong Java. Pada tahun 1928 ia terlibat dalam Kongres Pemuda II di Jakarta. "
                    ,"16 September 1905, Sumatera Barat","23 Desember 1968, Sumatera Selatan","https://upload.wikimedia.org/wikipedia/commons/b/b0/Ak_gani.jpg"},
    };

    public static ArrayList<Pahlawan> getListData(){
        Pahlawan pahlawan = null;
        ArrayList<Pahlawan> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            pahlawan = new Pahlawan();
            pahlawan.setNama(data[i][0]);
            pahlawan.setJabatan(data[i][1]);
            pahlawan.setKeterangan(data[i][2]);
            pahlawan.setLahir(data[i][3]);
            pahlawan.setWafat(data[i][4]);
            pahlawan.setFoto(data[i][5]);

            list.add(pahlawan);
        }

        return list;
    }
}
