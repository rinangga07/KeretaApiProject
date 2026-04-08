import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Penumpang p = new Penumpang("Rangga", "23110014");

        
        List<KeretaApi> daftarKereta = new ArrayList<>();
        daftarKereta.add(new KeretaBisnis("SIGMA EXPRESS"));
        daftarKereta.add(new KeretaEkonomi("KAI Ekonomi Express"));
        daftarKereta.add(new KeretaBisnis("ARGO BROMO"));

        
        List<Tiket> daftarTiket = new ArrayList<>();
        daftarTiket.add(new TiketPromo("A001", "Bandung - Jakarta", 200000, 10));
        daftarTiket.add(new Tiket("A002", "Surabaya - Malang", 150000));
        daftarTiket.add(new TiketPromo("A003", "Jogja - Solo", 100000, 5));

        
        System.out.println("=== DAFTAR TIKET ===");
        for (int i = 0; i < daftarKereta.size(); i++) {
            System.out.println((i + 1) + ". "
                    + daftarKereta.get(i).namaKereta + " - "
                    + daftarTiket.get(i).getTujuan() + " - Rp"
                    + daftarTiket.get(i).getHarga());
        }

         
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih tiket: ");
        int pilihan = input.nextInt();
        input.close();

        
        if (pilihan < 1 || pilihan > daftarKereta.size()) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        
        KeretaApi kereta = daftarKereta.get(pilihan - 1);
        Tiket tiket = daftarTiket.get(pilihan - 1);

        
        Transaksi tr = new Transaksi(p, tiket, kereta);
        tr.munculkanDetailTransaksi();

        
        Pembayaran bayar = new BayarCash();
        bayar.prosesBayar(tr.getTotalHarga());
        bayar.cetakStruk(tr.getTotalHarga());
    }
}