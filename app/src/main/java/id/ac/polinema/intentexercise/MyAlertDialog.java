package id.ac.polinema.intentexercise;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlertDialog {
    public static void showAlert(Context context, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(false); // Jika ingin popup tidak bisa dicancel dengan klik di luar popup

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Kode yang akan dijalankan saat tombol OK ditekan
                dialog.dismiss(); // Tutup popup
            }
        });

        // Untuk menampilkan popup
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
