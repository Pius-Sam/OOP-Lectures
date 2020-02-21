public class Multi {
    public static void main(String[] args) {
        int table[][]=new int[12][24];
        int row=1,col=1;
        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                table[i][j]=row*col;
                col +=1;
                System.out.print(" "+table[i][j]+"\t| ");
            }
            row +=1;
            col=1;
            System.out.print("\n");
        }
    }
}
