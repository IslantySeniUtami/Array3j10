public class testarraydua {
    public static void main(String[] args) {
        int nis [][] = {{210651}, {210652}, {210653}};
        String nama [][] = {{"Ade"}, {"Galih"},{"baihaqi"}};
        testarraydua siswa = new testarraydua();
        siswa.tampil(null);
        siswa.namanis(0);
        }
    
        public void tampil(String n){
        System.out.println("Identitas Siswa Angkatan 24");
        }
        
        public void namanis (int n){
            
            for (int i = 0; i< 1; i++){
            for (int j = 0; j< 1; j++){
            int [][] nis = {{210651}, {210652}, {210653}};
            String nama [][] = {{"Ade"}, {"Galih"}, {"Baihaqi"}};
            System.out.println(nama[0][i] + ":" + nis[0][j]);
            System.out.println(nama[1][i] + ":" + nis[1][j]);
            System.out.println(nama[2][i] + ":" + nis[2][j]);
            }
            }
            }
}
    

