public class TransaksiMasuk extends Transaksi {

    private int kodeMasuk;
    public int jumlah;


    public int getKodeMasuk() {
        return kodeMasuk;
    }

    public void setKodeMasuk(int kodeMasuk) {
        this.kodeMasuk = kodeMasuk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }


    @Override
    String tanggal() {
         return "12-01-2022";
    }

    @Override
    String deskribsi() {
      return "ini bersih";
    }
}
