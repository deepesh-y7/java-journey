class Hello {
    public static void main(String[] args) {

        int n = 11;

        for(int i = 0; i < n; i++){

            // ===== First Pattern (X) =====
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   "); // space between patterns

            // ===== Second Pattern (Box + X) =====
            for(int j = 0; j < n; j++){
                if(i == j || i + j == n - 1 || i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); // space between patterns

            // ===== third Pattern (Box + X) =====
            for(int j = 0; j < n; j++){
                if(i+j==(n-1)/2 || j-i == (n-1)/2 || i==(n-1)/2 || i+j == (n-1)+(n-1)/2 || i-j ==(n-1)/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); // ✅ NEW LINE AFTER FULL ROW
        }
    }
}
