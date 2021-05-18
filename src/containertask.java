import java.util.Arrays;

public class containertask {
    public static void main (String [] args) {
        int [][] pakete = new int[22][22];
        // id der pakete
        pakete[2][1] = 4051;
        pakete[3][1] = 3408;
        pakete[4][1] = 4119;
        pakete[5][1] = 3231;
        pakete[6][1] = 5963;
        pakete[7][1] = 3277;
        pakete[8][1] = 5464;
        pakete[9][1] = 5782;
        pakete[10][1] = 3437;
        pakete[11][1] = 4515;
        pakete[12][1] = 3540;
        pakete[13][1] = 3201;
        pakete[14][1] = 3710;
        pakete[15][1] = 4164;
        pakete[16][1] = 5810;
        pakete[17][1] = 4836;
        pakete[18][1] = 3812;
        pakete[19][1] = 3750;
        pakete[20][1] = 5056;
        pakete[21][1] = 4615;
        
        // gewicht der pakete
        pakete[1][2] = 7;
        pakete[1][3] = 6;
        pakete[1][4] = 7;
        pakete[1][5] = 5;
        pakete[1][6] = 1;
        pakete[1][7] = 1;
        pakete[1][8] = 6;
        pakete[1][9] = 6;
        pakete[1][10] = 3;
        pakete[1][11] = 6;
        pakete[1][12] = 2;
        pakete[1][13] = 4;
        pakete[1][14] = 7;
        pakete[1][15] = 8;
        pakete[1][16] = 10;
        pakete[1][17] = 2;
        pakete[1][18] = 9;
        pakete[1][19] = 7;
        pakete[1][20] = 5;
        pakete[1][21] = 8;

        int container[][] = new int[22][22];

        for(int i = 2; i < pakete.length-1; i++) {
            container[0][i] = pakete[1][i] + pakete[1][i];
            container[i][1] = pakete[i][1];
            if(container[0][i] + pakete[1][i+1] == 20){
                container[0+i][i] = container[i][i];
                container[i+1][1] = pakete[i][1];
            }
		}
        for(int[] x : container) {
            for(int y : x) {
                System.out.print("\t" + y + " ");
            }
            System.out.println();
        }
	}

}
