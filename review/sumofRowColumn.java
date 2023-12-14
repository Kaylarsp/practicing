public class sumofRowColumn {
    public static void main(String[] args) {
        int rows, cols, sumRow, sumCol;
        // mendeklarasikan dan menginisialisasikan sebuah matriks 2D yang berukuran 3x3
        int a[][] = {
            {1, 2, 3 },
            {4, 5, 6 },
            {7, 8, 9 } };
        // menghitung jumlah baris matriks a
        rows = a.length;
        // menghitung jumlah kolom matriks a
        cols = a[0].length;
        // perulangan ini digunakan untuk menghitung jumlah elemen dalam tiap baris dan kolom
        for (int i = 0; i < rows; i++) { // dimulai dari 0 berakhir di rows-1, menentukan jumlah elemen di setiap baris matriks a
            sumRow = 0; // menyimpan jumlah elemen di setiap baris
            // menambahkan nilai dari elemen - elemen di baris ke-i dari matriks var. sumRow
            for (int j = 0; j < cols; j++) { // dimulai dari 0 dan berakhir di cols - 1, dg penambahan 1 di tiap iterasi
                sumRow = sumRow + a[i][j];
            }
        // menampilkan jumlah elemen di baris ke-i + 1 dari matriks a
        System.out.println("Sum of " + "row " + (i+1) + " : " + sumRow);
        }
        // menentukan jumlah elemen di setiap kolom matriks a
        for (int i = 0; i < cols; i++) {
            sumCol = 0; // menyimpan jumlah elemen di setiap kolom
            // menambahkan nilai dari eleman - elemen di kolom ke-i dari matriks a ke var. sumCol
            for (int j = 0; j < rows; j++) { // dimulai dari 0, berakhir di rows rows - 1, dg penambahan 1 di tiap iterasi
                sumCol = sumCol + a[j][i];
            }
        // menampilkan jumlah elemen di kolom ke-i + 1 dari matriks a
        System.out.println("Sum of " + "column " + (i+1) + " : " + sumCol);
        }
    }
}

