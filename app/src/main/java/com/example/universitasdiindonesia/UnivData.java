package com.example.universitasdiindonesia;

import java.util.ArrayList;

public class UnivData {
    private static String[] univNames = {
            "Institut Teknologi Bandung",
            "Universitas Gadjah Mada",
            "Institut Pertanian Bogor",
            "Institut Teknologi Sepuluh Nopember",
            "Universitas Indonesia",
            "Universitas Diponegoro",
            "Universitas Airlangga",
            "Universitas Hasanuddin",
            "Universitas Brawijaya",
            "Universitas Padjadjaran"
    };

    private static String[] univDetails = {
            "Peringkat universitas terbaik di Indonesia dipegang ITB. PTN di Bandung ini layak menjadi institut terbaik di Indonesia yang bergerak di bidang pengembangan teknik dan sains. ITB didirikan sejak tahun 1959 dan mampu mempertahankan kualitas sebagai salah satu yang termasuk daftar PTN terbaik di Indonesia.",
            "Urutan universitas terbaik di Indonesia selanjutnya adalah Universitas Gajah Mada. Terletak di Yogyakarta dan sudah didirikan sejak tahun 1949.",
            "Institut Pertanian Bogor adalah perguruan tinggi berbentuk institut yang berada di provinsi Jawa Barat, tepatnya di kota Bogor. IPB lebih berfokus di bidang pertanian, meski banyak juga jurusan non-agragris.",
            "Singkatan dari ITS adalah Institut Teknologi Sepuluh Nopember dan terletak di daerah Sukolilo, Surabaya. Pertama didirikan di tahun 1957, ITS berfokus untuk mengembangkan bidang teknologi dan maritim Indonesia.",
            "Letaknya berada di perbatasn kota Depok dan Jakarta, namun sering dianggap sebagai universitas di Jakarta. Kampus negeri di Jakarta ini pertama didirikan di tahun 1849. UI juga pernah beberapa kali menempati peringkat 1 list universitas terfavorit di Indonesia dan termasuk salah satu universitas terbesar di Indonesia.",
            "Universitas Diponegoro terletak di kota Semarang, dan layak dianggap sebagai universitas terbaik di Jawa Tengah. Letaknya yang cukup strategis serta pilihan jurusan yang bervariasi membuat UNDIP jadi salah satu rekomendasi tempat kuliah terbaik di Indonesia yang enak.",
            "Universitas Airlangga atau UNAIR mungkin paling pas jika disebut sebagai universitas terbaik di Surabaya. UNAIR terkenal sebagai kampus yang memiliki kredibililtas dan moralitas tinggi serta salah satu universitas terbaik di Jawa Timur.",
            "Universitas Hasanuddin yang kemudian disingkat UNHAS, merupakan sebuah perguruan tinggi negeri di kota Makassar, Provinsi Sulawesi Selatan, Indonesia, yang berdiri pada 10 September 1956.",
            "Tidak mau ketinggalan dari universitas di surabaya, Universitas Brawijaya juga menjadi salah satu universitas terbaik di Jawa Timur. Universitas Brawijaya atau UB didirikan di tahun 1963 dan terletak di kota Malang. Dulunya singkatan universitas ini adalah UNIBRAW, namun kemudian disederhanakan lagi menjadi UB sampai sekarang.",
            "Tidak mau kalah dengan tetangganya ITB, Universitas Padjadjaran atau yang sering dikenal UNPAD menjadi universitas terbaik ke 10. UNPAD merupakan salah satu perguruan tinggi negeri yang terletak di Bandung, Jawa Barat, Indonesia."
    };

    private static int[] univImages = {
            R.drawable.itb,
            R.drawable.ugm,
            R.drawable.ipb,
            R.drawable.its,
            R.drawable.ui,
            R.drawable.undip,
            R.drawable.unair,
            R.drawable.unhas,
            R.drawable.ub,
            R.drawable.unpad
    };

    static ArrayList<Universitas> getListData() {
        ArrayList<Universitas> list = new ArrayList<>();
        for (int position = 0; position < univNames.length; position++) {
            Universitas univ = new Universitas();
            univ.setName(univNames[position]);
            univ.setDetail(univDetails[position]);
            univ.setPhoto(univImages[position]);
            list.add(univ);
        }
        return list;
    }
}
