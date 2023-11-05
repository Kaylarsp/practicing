public class insertionSort {
    // static pertama : untuk melakukan sorting
    public static void insertionSort(int array[]) {
        // panjang dari array, merepresentasikan jumlah elemen dari array
        int n = array.length;
        // menentukan elemen-elemen yang akan disisipkan ke posisi yang tepat di dalam array yang sudah terurut sebagian
        for (int j = 0; j < n; j++) {
            int key = array[j]; // merepresentasikan elemen yang sudah ditentukan
            int i = j-1; // menunjukkan indeks dari elemen terakhir di bagian array tadi
            // mencari posisi yang tepat untuk menyisipkan key di dalam array yang sudah terurut sebagian
            while ((i > -1) && (array [i] > key)) {
                array [i + 1] = array [i]; // membuat ruang kosong untuk menyisipkan key di posisi yang tepat
                i--; // memindahkan indeks i ke kiri, menuju ke elemen sebelumnya di bagian array yang sudah terurut sebagian
            }
            // menyelesaikan proses penyisipan key
            array[i+1] = key;
        }
    }
    // static kedua : metode utama yang akan dijalankan saat program dijalankan
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Insertion sort : ");
        // perulangan for-each, untuk mencetak elemen-elemen di array arr1
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println(); // new line

        // sorting array using insertion sort
        insertionSort(arr1);

        System.out.println("After Insertion sort : ");
        // for-each loop, mencetak elemen-elemen di array arr1
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
