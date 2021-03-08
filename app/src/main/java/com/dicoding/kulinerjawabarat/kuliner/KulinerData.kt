package com.dicoding.kulinerjawabarat.kuliner

import com.dicoding.kulinerjawabarat.R

object KulinerData {
    private var kulinerName = arrayOf(
            "Doclang",
            "Empal Gentong",
            "Karedok",
            "Nasi Jamblang Daun Jati",
            "Opak",
            "Peuyeum",
            "Surabi",
            "Tahu Gejrot",
            "Tahu Sumedang",
            "Tapai Ketan"
    )

    private var kulinerRate = arrayOf(
            "4,6/5",
            "4,8/5",
            "4,3/5",
            "4,8/5",
            "4,5/5",
            "4,3/5",
            "4,4/5",
            "4,6/5",
            "4,8/5",
            "4,5/5"
    )

    private var kulinerStar = intArrayOf(
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars,
            R.drawable.stars
    )

    private var kulinerImage = intArrayOf(
            R.drawable.doclang,
            R.drawable.empal_gentong,
            R.drawable.karedok,
            R.drawable.nasi_jamblang,
            R.drawable.opak,
            R.drawable.peuyeum1,
            R.drawable.surabi,
            R.drawable.tahu_gejrot,
            R.drawable.tahu_sumedang,
            R.drawable.tapai_ketan
    )

    private var kulinerDetail = arrayOf(
            "Rp. 10.000",
            "Rp. 15.000",
            "Rp. 10.000",
            "Rp. 15.000",
            "Rp. 25.000/Kg",
            "Rp. 15.000",
            "Rp. 10.000",
            "Rp. 7.000",
            "Rp. 1.000/Pcs",
            "Rp. 10.000"
    )

    private var kulinerOverview = arrayOf(
            "Doclang merupakan makanan yang terdiri dari ketupat, tahu, telur, kentang, serta ada siraman bumbu kacang mengitarinya.\nTerkesan sangat mirip bukan dengan ketoprak-nya Jakarta maupun kupat tahu-nya Bandung, namun ada banyak yang membedakan antara ketiganya. \nMakanan khas Jawa Barat satu ini memiliki karakteristik yang bikin lidah bisa bergoyang karena menggunakan cabe yang pedas, namun bagi yang tidak suka pedas bisa request untuk tidak diberikan cabe pedas.\nJika ditelusuri, adanya kentang menjadi perbedaan paling menonjol diantara ketiganya, selain itu, pembungkusan ketupat yang memakai daun patat juga berbeda dari dua olahan di atas.\nUntuk urusan rasa memang tidak terlalu beda jauh, mengingat bumbunya adalah sama-sama bumbu kacang, jika ada mungkin terletak pada tingkat kepedasannya.\nDengan kandungan gizi yang cukup lengkap, doclang bisa dikonsumsi sebagai menu makan malam bahkan dijadikan sebagai menu makan pagi alias sarapan, hal itu diketahui persis penjualnya, karena saat pagi dan malam, mereka dapat dengan mudah ditemukan.\nSalah satu olahan doclang spesial terletak di Jalan Mantarena, yang memiliki rasa bumbu kacang dengan cita rasa unik dan seporsinya bisa mengenyangkan.\nUntuk masalah harga, cuma denga uang 8 ribu saja, satu porsi lengkap doclang yang telah dilengkapi telur dan tambahan kerupuk bisa didapatkan.",
            "Makanan asal Cirebon ini memang sudah terkenal sampai seluruh Jawa, bahkan Indonesia karena memiliki cara pengolahan dan rasa yang berbeda.\nSesuai namanya, empal gentong diolah dengan cara memasukkan aneka daging ke dalam gentong untuk nantinya dimasak beberapa saat.\nBahkan pengolahan tradisional akan menggunakan kayu bakar khusus yang didapat dari pohon mangga, tujuannya sudah pasti agar memberi rasa khas pada empal gentongnya.\nSedang untuk daging yang kerap masuk pada olahan ini adalah daging sapi, usus, hingga babat yang nanti setelah masak akan terasa begitu empuk ketika digigit.\nPenampakan makanan khas Jawa Barat dari daging ini mirip dengan gulai, yakni daging-daging yang telah masak akan memiliki kuah bewarna agar kekuning-kuningan, namun kuahnya lebih cair dari gulai.\nSedangkan untuk bahan tambahan, empal akan disajikan bersama kucai dan ditambah pula dengan sambal gandengannya, yaitu sambal berbahan dasar cabai kering yang digiling.\nBerkat adanya sambal inilah, selain segar, juga bisa memberi cita rasa pedas pada empal, padahal rasa awalnya adalah gurih.\nSaran penyantapan adalah ketika empal gentong masih hangat, dan akan sangat tepat bila dikonsumsi bareng dengan nasi atau potongan lontong.",
            "Makanan khas Jawa Barat karedok merupakan kuliner dengan bahan dasar sayur-sayuran segar yang disajikan bersama siraman bumbu kacang.\nMakanan dengan nama karedok sebenarnya mirip dengan gado-gado atau pecel, namun perbedaan paling mendasar adalah pada pemakaian sayurnya yang disajikan dalam keadaan mentah.\nDiantara sayuran yang bisa dijadikan sebagai karedok adalah timun, daun kemangi, kacang panjang, kol, terong, dan tauge, kesemuanya akan dipotong kecil-kecil dan disajikan dalam keadaan mentah.\nWalaupun mentah, rasanya akan tetap lezat karena penggunaan bumbu kacangnya yang menimbulkan rasa pedas gurih pada sayuran.\nPembuatan bumbu kacang tersebut dibuat menggunakan kacang tanah, cabai rawit, gula jawa, terasi, air asam, garam, kencur, dan bawang putih.\nDan perlu diketahui bahwa makanan ini berasal dari Sumedang namun telah melebarkan sayapnya, sehingga di daerah-daerah kerap menjumpainya.\nSelain karena rasanya enak, adanya kandungan serat yang cukup tinggi pada karedok bisa menjadi nilai lebih dalam mengonsumsinya.",
            "Mengenai nasi jamblang, sebenarnya olahan ini hanyalah nasi yang diisi dengan sepicuk nasi dengan tambahan lauk dan dibungkus menggunakan daun jati.\nNamun ada cerita dibalik lahirnya kuliner asli Cirebon ini, yakni dimulai ketika Belanda memerintahkan pembuatan jalan raya Anyer-Panarukan.\nKerja rodi ini membuat warga Cirebon ikut dipekerjakan, akhirnya warga Desa Jamblang membuat nasi dengan bungkus daun jati untuk para pekerja.\nNamun awalnya hanya memiliki lauk berupa tempe, tahu, dan sambal, tetapi kini telah ada sekitar 40 jenis lauk yang berbeda.\nDalam satu porsinya, nasi jamblang memang hanya menyediakan sedikit nasi, namun akan ditumpuk dengan puluhan lauk, sehingga membuatnya lebih bervariasi.\nApalagi pembungkusannya yang menggunakan daun jati, maka bisa menciptakan aroma dan rasa khas kepada nasi, belum lagi daun jati bisa membuat makanan lebih tahan basi.\nMakanan khas Jawa Barat dan asal kotanya, yakni di Cirebon, ada yang namanya warung Nasi Jamblang Mang Dul yang terletak di Jalan Cipto Mangunkusumo dengan olahan favoritnya nasi jamblang.\nDi sana ada sekitar 40-an lauk, di antaranya adalah tahu tempe, sambal, telur, sate, urapan, jenis daging, dan masih banyak lagi pilihannya.",
            "Makanan yang telah merambah Jawa Barat sebagai olahan khas Sunda dengan nama opak secara umum adalah olahan dengan bahan dasar tepung beras.\nNamun itu hanya versi awalnya saja, karena kini telah berkembang aneka jenis opak dengan bahan dasar yang berbeda-beda pula.\nNamun satu hal yang pasti dari opak, yaitu bentuknya yang pipih dan tipis dengan rasa yang renyah.\nBahkan walaupun makanan ini adalah asli dari Jawa Barat, namun beberapa daerah di Jawa juga mengakuisisi makanan ini, namun dengan bentuk yang berbeda, seperti opak solo dan opak wonosobo.\nNamun jika opak-nya Jabar, maka yang sudah pasti muncul di toko oleh-oleh adalah opak ketan dan opak singkong dengan bahan dasar sesuai namanya.\nOpak ketan akan menggunakan bahan berupa beras ketan dengan rasa gurih dan renyah, selain itu ada dua varian dari opak jenis ini, yaitu yang original opak ketan asin dan ada pula opak ketan manis.\nSedangkan yang opak singkong atau sampeu, bahannya adalah parutan singkong dengan tambahan garam, cabai merah, dan MSG.\nAda juga opak kucai, opak dengan bahan dasar singkong plus daun kucai, lalu opak gendar dari nasi, dan juga ada opak santir dengan bentuk seperti keripik, serta opak ilat berbentuk lidah.",
            "Peuyeum merupakan sejenis tape yang juga dibuat dengan cara fermentasi, namun pembutannya dilakukan dengan bahan dasar singkong.\nJenis ubi tersebut setelah dikukus sudah langsung siap untuk diberi taburan ragi yang memicu pertumbuhan jamur pada singkong.\nPemberian ragi tersebut yang membuat peuyeum memiliki warna putih di sekelilingnya, dan karena ragi inilah rasa singkong berubah menjadi berbeda, karena akan berasa tape.\nSetelah memberi ragi, singkong harus ditempatkan pada tempat tertutup dan wajib didiamkan selama 2 sampai 3 hari agar rasanya makin nikmat.\nMakanan khas Jawa Barat yang dulunya banyak dibuat di daerah Cipeyeum yang membuatnya dinamai peuyeum tersebut telah banyak dijual di Bandung, seperti di pasar maupun tempat wisata.\nUniknya, banyak penjualnya yang menjualnya dengan cara menggantungkan peuyeum, tujuannya sih untuk menarik minat pembeli.\nMakanan ini bahkan dipercaya mampu menghangatkan tubuh, sehingga sangat tepat dikonsumsi ketika malam tiba atau hawa dingin melanda.\nKarena banyaknya penjualnya, rata-rata harga peuyeum di setiap tempat hampir sama, dan tergolong murah.",
            "Surabi atau serabi adalah panganan yang telah tersebar rata hampir di seluruh Jawa Barat, bisa dikatakan bahwa makanan ini adalah makanan khas Sunda.\nPembuatannya dibuat menggunakan tepung beras dengan cara masak yang masih tradisional, karena harus menggunakan tungku, bahkan tungku tersebut dibuat dari tanah liat.\nPenampilan makanan khas Jawa Barat surabi sendiri memiliki bentuk membulat dengan tekstur empuk, sehingga akan ada rasa legit nan gurih saat memakannya.\nBelum lagi ada banyak varian surabi yang tidak hanya terbuat dari gula dan kelapa saja, karena masih banyak produsen yang menawarkan rasa lain.\nRasa original surabi memang manis, karena ada penggunaan gula dan kelapa, namun lambat laun telah banyak jenis lain, diantaranya ada di Warung Surabi Setia Budi.\nWarung dengan alamat di Jalan Dokter Setiabudhi No.175 tersebut mengolah surabi dengan selai kacang, durian, strawberry, hingga markisa.\nLebih hebatnya lagi, surabi yang awalnya tidak punya isian apapun di warung ini justru disulap dengan tambahan isian kornet, ayam, atau telur.\nSelain lebih menambah cita rasa, adanya isian dan selai ini juga membuat gizi di dalamnya lebih meningkat.\nTapi itu semua kembali kepada selera penikmatnya. Karena tak jarang juga orang yang justru eneg jika makan surabi dengan tambahan kornet, ayam, atau telur.",
            "Makanan sederhana dari Jawa Barat namun memiliki rasa yang enak adalah olahan dengan nama tahu gejrot.\nPanganan dari daerah Cirebon tersebut dibuat dari bahan dasarnya berupa tahu goreng, dengan keunggulannya yang memiliki tekstur lebih berisi.\nDalam penyajiannya, tahu tersebut tidak sendirian, karena akan ditemani dengan yang namanya kuah asam pedas berbahan dasar cabai rawit.\nBiasanya penyajian tahu gejrot akan ditaruh di atas pisin, atau lebih tepatnya piring yang terbuat dari tanah berbentuk agak kecil.\nTahu yang ada di atas pisin tidaklah tahu glendongan, karena akan terlebih dahulu dipotong kecil-kecil, agar lebih mudah dikonsumsi dan bumbu lebih meresap.\nKuah asam pedasnya selain terbuat dari cabai rawit, juga akan ada tambahan bumbu seperti petis, air gula, gula, dan bawang merah.\nRasa yang akan timbul ketika lidah mendapat sentuhan tahu gejrot adalah pedas manis gurih yang sangat terasa di mulut.\nDipastikan siapa saja yang mencicipi makanan yang mudah ditemukan di Cirebon ini akan dengan cepat ketagihan dan ingin mencoba kembali.",
            "Makanan khas Jawa Barat yang terkenal seantero indonesia ini bernama tahu sumedang.\nOlahan tahu yang sangat familiar di telinga masyarakat Tanah Air adalah tahu sumedang yang berasal dari daerah Sumedang, Jawa Barat.\nSeperti kebanyakan tahu yang ada, bahan utama tahu ini juga adalah kacang kedelai dengan kandungan protein nabati yang tinggi.\nBerkat kandungan tersebutlah tahu sumedang seharusnya bisa menjadi makanan yang tepat dan menyehatkan bagi anak-anak hingga dewasa.\nSeperti yang telah kita ketahui, tahu sumedang punya ciri-ciri berbentuk kotak kecil dengan isiannya yang kopong.\nWalaupun kopong, namun yang membuat olahan tahu ini istimewa adalah berasal dari rasanya yang gurih dan lembut di mulut, dan sangat cocok bila dimakan dengan cocolan saus atau dengan cabai.\nNama lain dari tahu ini adalah tahu boen keng, karena dibuat pertama kali oleh keluarga Boen Keng sejak 100 tahun lalu.\nDi Sumedang, keluarga Boen Keng masih menjualnya, lokasi outlet mereka ada di pusat kota dan tak ada cabangnya.\nPembuatan tahu di sana masih menggunakan tenaga manusia, bahkan kedelainya direndam dulu 4 sampai 6 jam agar rasanya makin lezat.",
            "Olahan dengan nama tapai memiliki ciri khas dibuat dengan cara difermentasi, begitu pula dengan tapai ketan yang menjadi olahan khas daerah Kuningan.\nPembuatan tapai ketan tersebut, menggunakan bahan dasar beras ketan, entah itu ketan hitam maupun putih, namun kebanyakan memakai yang ketan putih.\nSelain itu, olahan tapai yang dibuat dari ketan putih kerap diwarnai dengan daun katuk agar memiliki warna hijau alami.\nSedangkan untuk bungkusannya kerap didapat dari daun jambu hingga daun pisang.\nPemilihan daun pisang biasanya lebih sering karena untuk memberikan identitas makanan khas Jawa Barat beserta gambarny ini termasuk ke dalam kekayaan kuliner nusantara.\nSesuai dengan namanya, tapai ketan dibuat dengan proses fermentasi dari ragi, yakni setelah ketan selesai dikukus, nantinya akan dimasukkan ke daun dengan tambahan ragi.\nSetelah dibungkus beberapa saat, dan didiamkan dalam waktu 3 hari sampai seminggu, tapai ketan tersebut sudah siap untuk dihidangkan.\nDengan proses tersebut, dipercaya bahwa tapai ini bisa menambah kandungan vitamin B1 yang sangat baik untuk sistem pencernaan dan obat diabetes.\nUntuk mendapatkannya juga dapat dengan gampang didapat di area sekitar Kuningan, dan sudah dibungkus dengan kemasan modern.\n",
    )

    val listData: ArrayList<Kuliner>
        get(){
            val list = arrayListOf<Kuliner>()
            for (position in kulinerName.indices){
                val Kuliner = Kuliner()
                Kuliner.name = kulinerName[position]
                Kuliner.rate = kulinerRate[position]
                Kuliner.star = kulinerStar[position]
                Kuliner.photo = kulinerImage[position]
                Kuliner.detail = kulinerDetail[position]
                Kuliner.overview = kulinerOverview[position]
                list.add(Kuliner)
            }
            return list
        }
}