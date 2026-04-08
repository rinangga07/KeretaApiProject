public class Main {
    public static void main(String[] args) {

        Penumpang p = new Penumpang("Rangga", "23110014");
 
        Tiket t = new TiketPromo("A001", "Banda Neira", 200000, 10);
 
        KeretaApi kereta = new KeretaBisnis("SIGMA EXPRESS");
        //KeretaApi kereta = new KeretaEkonomi("KAI Ekonomi Express");

        Transaksi tr = new Transaksi(p, t, kereta);
        tr.munculkanDetailTransaksi();

        Pembayaran bayar = new BayarCash();
        bayar.prosesBayar(tr.getTotalHarga());
        bayar.cetakStruk(tr.getTotalHarga());
    }
}
